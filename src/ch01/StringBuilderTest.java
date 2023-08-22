package ch01;

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java); // buffer : java
		System.out.println(System.identityHashCode(buffer));//1023487453
		
		buffer.append(android);
		System.out.println(buffer.toString()); // javaandroid
		System.out.println(System.identityHashCode(buffer)); // 1023487453, append후 buffer의 주소 동일
	}

}
