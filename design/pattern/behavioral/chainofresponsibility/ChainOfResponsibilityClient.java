package com.company.design.pattern.behavioral.chainofresponsibility;

/**
 * Created by vishal on 10-Apr-18.
 * This is a behavioral design pattern.
 * Behavioral design pattern are used for better interaction b/w objects and losse coupling.
 * <p>
 * Chain of responsibility pattern is used to achieve loose coupling in software design where a request from client is passed to a chain of objects to process them. Then the object in the
 * chain will decide themselves who will be processing the request
 * and whether the request is required to be sent to the next object in the chain or not.
 *

 Chain of responsibility design pattern is one of the behavioral design pattern.

 Table of Contents [hide]

 Chain of Responsibility Pattern Example in JDK
 Let’s see the example of chain of responsibility pattern in JDK and then we will proceed to implement a real life example of this pattern. We know that we can have multiple catch blocks in a try-catch block code. Here every catch block is kind of a processor to process that particular exception.

 So when any exception occurs in the try block, its send to the first catch block to process. If the catch block is not able to process it, it forwards the request to next object in chain i.e next catch block. If even the last catch block is not able to process it, the exception is thrown outside of the chain to the calling program.
 */
public class ChainOfResponsibilityClient {

    public static void main(String[] args) {

        ATMDispenser atmDispenser = new ATMDispenser();
        /**
         * 1: 50 rs notes
         2: 20 rs notes
         */
        atmDispenser.dispense(90);

    }
}
