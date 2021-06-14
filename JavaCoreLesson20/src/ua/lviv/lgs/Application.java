package ua.lviv.lgs;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a count of Fibonachi number what you want display: ");
		System.out.println();
		int number = scanner.nextInt();
		MyThread myThread = new MyThread(number);
		myThread.start();

		RunnableThread myRunnable = new RunnableThread(number);

		
		System.out.println();
		scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter a count of Fibonachi number what you want display: ");
		System.out.println();
		int number2 = scanner.nextInt();
		System.out.println();
		ExecutorService executorFTP = Executors.newFixedThreadPool(2);
		executorFTP.submit(new MyThread(number2));
		System.out.println();
		executorFTP.submit(new RunnableThread(number2));
		executorFTP.shutdown();
		
	}

}
