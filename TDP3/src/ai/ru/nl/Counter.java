package ai.ru.nl;

public class Counter extends Thread {
	private static int counter;
	private static Object lock = new Object();
	private String name;

	public Counter(String name) {
		super(name);
		this.name = name;
	}

	public void run() {
		synchronized(lock){
			if ("down".equals(name))
				for (counter = 1000; counter > 0; counter--)
					System.out.println("in " + name + ", counter=" + counter);
			else if ("up".equals(name))
				for (counter = 0; counter < 1000; counter++)
					System.out.println("in " + name + ", counter=" + counter);
		}
	}
}