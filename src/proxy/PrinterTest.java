package proxy;

public class PrinterTest {

	public static void main(String[] args) {
		//클라이언트가 쓰는것은 Proxy이므로 Proxy객체로 new해서 생성함
		Printable p = new PrinterProxy("Alice");
		System.out.println("현재의 이름은 : " + p.getPrinterName() + "입니다.");
		p.setPrinterName("Bob");
		System.out.println("현재의 이름은 : " + p.getPrinterName() + "입니다.");
		
		/* real객체 생성 후 real이 존재하므로
		 * , setName시, real의 setName수행함.!!*/
		p.print("Hello, world."); //proxy가 real객체의 print()수행 - heavyJob거침
		p.print("test");
		p.setPrinterName("Tomas");
		System.out.println("현재의 이름은 : " + p.getPrinterName() + "입니다.");
		
	}

}
