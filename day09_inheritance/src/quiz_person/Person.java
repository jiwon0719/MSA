package quiz_person;

//import java.lang.*; // 내부적으로 자동 임포트 해준다.

public class Person { // extends Object {

	private String name, address, phone;
	private int age, height, weight;
	
	//getter / setter method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void disp() {
		System.out.print(name + ", "+age + " ");
	}
	
//	@Override
//	public String toString() {
//		String str = name + ", "+age;
//		
//		return str;
//	}
	
	
	
}
