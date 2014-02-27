package ai.ru.nl;

public class Main {
	public static void main(String[] args) {
		Counter up = new Counter("up");
		Counter down = new Counter("down");
		up.start();
		down.start();
	}
}
