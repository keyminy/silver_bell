package ch03.generic;

public class GenericMethod {

	//GenericMethod : Point 2개의 점을 이용해 너비를 구함
	//public <자료형 매개 변수> 반환형 메서드 이름(자료형 매개변수.....) { }
	public static <T,V> double makeRectangle(Point<T,V> p1,Point<T,V> p2) {
		//getX() : T type이라 => Object Type임
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
	public static void main(String[] args) {
		Point<Integer,Double> p1 = new Point<>(0,0.0);
		Point<Integer,Double> p2 = new Point<>(10,10.0);
		
		double rect = GenericMethod.<Integer,Double>makeRectangle(p1,p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다");
	}

}
