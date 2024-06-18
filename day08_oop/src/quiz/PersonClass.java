package quiz;

//문제] 
// person 클래스 ==> 이름, 주소, 연락처, 나이, 키, 몸무게 멤버변수로 가지는 클래스 생성
// getter, setter 함수, output 메서드 생성
// main에서 객체 생성하고 값 세팅해서 출력하는 프로그램 작성

public class PersonClass extends Object { //생성자 클래스도 Object를 상속한다.
	private String name;
	private String adress;
	private String phoneNum;
	private int age;
	private int tall;
	private int weight;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTall() {
		return tall;
	}
	public void setTall(int tall) {
		this.tall = tall;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void disp() {
		System.out.println("name= " + name + ", adress= " + adress + ", phoneNum= " + phoneNum);
		System.out.println("age= " + age + ", tall= " + tall + ", weight= " + weight);
	}
	
}
