package com.sadp.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerPattern {
	public static void main(String args[]) throws InterruptedException {

		// Creating shared object
		BlockingQueue sharedQueue = new LinkedBlockingQueue();

		// Creating Producer and Consumer Thread

		Thread prodThread = new Thread(new Producer(sharedQueue));
		
		Thread consThread = new Thread(new Consumer(sharedQueue));

		// Starting producer and Consumer thread
		prodThread.start();
		//Thread.sleep(1000);
		consThread.start();
	}
}
