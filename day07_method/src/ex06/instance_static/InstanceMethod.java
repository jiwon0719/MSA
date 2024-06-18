package ex06.instance_static;

//instance method : 객체 생성하고 사용해야함(메모리에 할당 되어야...)
// ex) Scanner sc = new Scanner(System.in);
// int x = sc.nextInt();

class B {
	int x, y;
	
	//instance method
	public void setData(int xx, int yy) {
		System.out.println(xx + ", " + yy);
	}
	
} //end B class



public class InstanceMethod {
	public static void main(String[] args) {
		B b = new B(); //객체 생성, 메모리에 할당, 생성자함수 자동호출
		b.setData(22, 55);		
	}
}
