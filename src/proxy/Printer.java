package proxy;

public class Printer implements Printable {

	private String name; //프린터의 이름
	
	public Printer(String name) {
		this.name = name;
		//실제 프린터 생성시 오래 걸리는 작업
		heavyJob("Printer 생성중.....");
	}
	
	@Override
	public void setPrinterName(String name) {
		
		System.out.println("real : setPrinterName()");
		this.name = name;

	}

	@Override
	public String getPrinterName() {
		System.out.println("real : getPrinterName()");
		return null;
	}

	@Override
	public void print(String str) {
		System.out.println(name + " is doing real printing");
		System.out.println(str);

	}
	
	public void heavyJob(String msg) {
		System.out.println(msg);
		
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(".");
		}
		System.out.println("생성완료");
	}

}
