package com.macquarie.shiner.batch.gcs.service;

import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * http://tutorials.jenkov.com/java-nio/scatter-gather.html
 */

public class NIOFileTest {

    @Test
    public void testBufferRead() {

        String filePath = isWindows() ? this.getClass().getClassLoader().getResource("DEAL_GL_test.cdp").getPath().substring(1) : this.getClass().getClassLoader().getResource("DEAL_GL_test.cdp").getPath();

        try (RandomAccessFile raf = new RandomAccessFile(filePath, "rw")) {
            FileChannel channel = raf.getChannel();
            ByteBuffer buf = ByteBuffer.allocate(80);
            int bytesRead = channel.read(buf);//non blokcing call, this will load data as per availability and buffer size, if no data is there it will not wait.
            while (bytesRead != -1) {
                System.out.println("Read " + bytesRead);
                buf.flip(); //moves pointer to beginning of buffer
                while (buf.hasRemaining()) {
                    System.out.println((char) buf.get()); // returns only one byet at a time
                }
                buf.clear();
                bytesRead = channel.read(buf);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * It Read from a channel push it to multiple buffer
     * Then while writing , refer all buffers.
     */
    @Test
    public void testScatterReadGatherWrite() {
        String filePath = isWindows() ? this.getClass().getClassLoader().getResource("DEAL_GL_test.cdp").getPath().substring(1) : this.getClass().getClassLoader().getResource("DEAL_GL_test.cdp").getPath();

        try (RandomAccessFile raf = new RandomAccessFile(filePath, "rw")) {
            FileChannel channel = raf.getChannel();
            ByteBuffer buf1 = ByteBuffer.allocate(40);
            ByteBuffer buf2 = ByteBuffer.allocate(40);

            ByteBuffer bufferArr[] = {buf1, buf2};
            long bytesRead = channel.read(bufferArr);//non blokcing call, this will load data as per availability and buffer size, if no data is there it will not wait.
            while (bytesRead != -1) {
                System.out.println("Read " + bytesRead);
                bufferArr[0].flip(); //moves pointer to beginning of buffer
                bufferArr[1].flip();
                while (bufferArr[0].hasRemaining() && bufferArr[1].hasRemaining()) {
                    System.out.println((char) bufferArr[0].get()); // returns only one byet at a time
                    System.out.println((char) bufferArr[1].get());
                }
                bufferArr[0].clear();
                bytesRead = channel.read(bufferArr);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Boolean isWindows() {
        return System.getProperty("os.name").startsWith("Windows");
    }

}
