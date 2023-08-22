package adapter;

public class PrintBanner implements Print {

	//새로운 기능인 banner클래스 composition!!!
	Banner banner;
	
	public PrintBanner(String str) {
		this.banner = new Banner(str);
	}
	
	@Override
	public void printWeek() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}

}
