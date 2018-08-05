/**
 * Created by vishal on 05-Aug-18.
 * <p>
 * WAP , even thread printing even numbers
 * odd thread priting odd numbers
 * 
 */
public class Printer {

    private Boolean isOddPrinted;

    public void print(int i) {
        System.out.println(i);
    }

    public Boolean getIsOddPrinted() {
        return isOddPrinted;
    }

    public void setIsOddPrinted(Boolean odd) {
        isOddPrinted = odd;
    }

    static class EvenThread implements Runnable {

        private Printer printer;

        public EvenThread(Printer printer) {
            this.printer = printer;
        }

        @Override
        public void run() {

            for (int i = 2; i < 10; i += 2) {
                synchronized (printer) {
                    while (!printer.getIsOddPrinted()) {//odd
                        try {
                            printer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Even Thread printing");
                    printer.print(i);
                    printer.setIsOddPrinted(false);
                    printer.notifyAll();
                }

            }

        }
    }

    static class OddThread implements Runnable {

        private Printer printer;

        public OddThread(Printer printer) {
            this.printer = printer;
        }

        @Override
        public void run() {

            for (int i = 1; i < 10; i += 2) {

                synchronized (printer) {
                    while (printer.getIsOddPrinted()) {//odd
                        try {
                            printer.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Odd Thread printing");
                    printer.print(i);
                    printer.setIsOddPrinted(true);
                    printer.notify();
                }

            }

        }

    }

    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.setIsOddPrinted(false);

        Thread evenThread = new Thread(new EvenThread(printer));
        Thread oddThread = new Thread(new OddThread(printer));

        evenThread.start();
        oddThread.start();
    }
}
