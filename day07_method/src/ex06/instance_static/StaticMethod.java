package ex06.instance_static;

//static method: 객체 생성 없이 바로 사용 가능함 ex) Math.random();
//object.methodName();
//ClassName.methodName();

class A {
	int x, y;
	
	//static method
	public static void setData(int xx, int yy) {
		System.out.println(xx + ", " +yy);
	}
} //end A class



public class StaticMethod {
	public static void main(String[] args) {
		A.setData(3,5);
		
		A a = new A(); //객체 생성, 메모리에 할당, 생성자함수 자동호출
		a.setData(10, 20); //노란줄이 뜨는 이유: static은 객체 생성 필요없는게 굳이?
	
		a.x = 100;
		System.out.println(a.x);
		
	}
}
