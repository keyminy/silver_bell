package proxy;

public class PrinterProxy implements Printable{

	private String name;
	private Printer real; //프린터 프록시 : real subject에 대한 reference를 가짐
	
	public PrinterProxy(String name) {
		this.name = name;
	}
	
	// synchronized : 동기화해줌
	@Override
	public synchronized void setPrinterName(String name) {
		if(real != null) {
			real.setPrinterName(name); // "본인"에게도 설정한다.
		}
		this.name = name;
		System.out.println("PrinterProxy : setPrinterName()");
		
	}

	@Override
	public String getPrinterName() {
		System.out.println("proxy : getPrinterName()");
		return name;
	}

	@Override
	public synchronized void print(String str) {
		real(); //real객체 생성
		real.print(str);
		
	}
	
	public void real() {
		//real 객체가 생성될 수 있게함
		if(real == null) {
			real = new Printer(name);
		}
	}

}
