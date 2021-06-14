package ua.lviv.lgs;

public class RunnableThread implements Runnable {
	int number;
	private Thread thread;

	public RunnableThread(int number) {
		this.number = number;
		this.thread = new Thread(this);
		thread.start();
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
			Integer[] fibonacci = new Integer[number];
			fibonacci[0] = f0;
			fibonacci[1] = f1;

			System.out.print("Descending series of Fibonacci numbers: ");
			for (int i = 2; i < fibonacci.length; i++) {
				f2 = f0 + f1;
				fibonacci[i] = f2;

				f0 = f1;
				f1 = f2;
			}

			for (int i = fibonacci.length-1; i >= 2; i--) {
				System.out.print(fibonacci[i] + " ");
			}
			

			System.out.print(fibonacci[1] + " " + fibonacci[0]);
			
		}

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
