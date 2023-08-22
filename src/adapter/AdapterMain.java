package adapter;

public class AdapterMain {

	public static void main(String[] args) {
		Print p = new PrintBanner("Hello, World!!");
		p.printWeek();
		p.printStrong();

	}

}
