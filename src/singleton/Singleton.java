package singleton;

public class Singleton {

	private volatile static Singleton instance;
	
	private Singleton() {}		
	
	public static Singleton getInstance() {
		
		if(instance == null) {
			//instance가 nulㅣ일때만 객체 생성하고, lock이걸림
			synchronized(Singleton.class){
				instance = new Singleton();
			}
		}
		return instance;
	}
}

