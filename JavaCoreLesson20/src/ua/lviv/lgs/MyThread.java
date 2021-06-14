package ua.lviv.lgs;

import java.util.Scanner;

public class MyThread extends Thread {
	int number;

	public MyThread(int number) {
		this.number = number;
	}

	@Override
	public void run() {

		int f0 = 0;
		int f1 = 1;
		int f2;

		if (number < 1) {
			System.out.println("The entered number is negative or zero");
		} else if (number == 1) {
			System.out.println(f0);
		} else {
			System.out.print("Fibonacci number series in ascending order: " + f0 + " " + f1 + " ");

			for (int i = 2; i <= number - 1; i++) {
				f2 = f0 + f1;

				System.out.print(f2 + " ");

				f0 = f1;
				f1 = f2;
			}

			System.out.println();
		}

		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
