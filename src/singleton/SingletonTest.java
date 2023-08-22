package singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton singletonA = Singleton.getInstance();
		Singleton singletonB = Singleton.getInstance();
		
		//가져온 2개의 주소가 같니?
		if(singletonA == singletonB) {
			System.out.println("주소 같음 : true");
		}else {
			System.out.println("주소 다름 : false");			
		}
		
		

	}

}
