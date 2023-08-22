package ch01;

public class StringTest2 {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		//1023487453
		System.out.println(System.identityHashCode(java));
		
		java = java.concat(android); //새로 java라는게 생겨요..
		System.out.println(java); //javaandroid
		//1651191114
		System.out.println(System.identityHashCode(java)); //새로 생성된 address생성		
	}

}
