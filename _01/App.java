package _01;

class Runner1 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runner1 " + i);
		}
		
	}
}

class Runner2 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Runner2 " + i);
		}
		
	}
}
public class App {
	public static void main(String[] args) {
		Thread thread01 = new Thread(new Runner1());
		Thread thread02 = new Thread(new Runner2());
		thread01.start();
		thread02.start();
	}
}
