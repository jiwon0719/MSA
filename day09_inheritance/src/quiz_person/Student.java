package quiz_person;

public class Student extends Person {
	char grade = 'A';

	
	
	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public Student() {
		super("seoul", 20);
	}

	public Student(char grade) {
		super("seoul", 20);
		this.grade = grade;
	}
	
	public void disp() {
		super.disp();
		System.out.println(", " + grade);
	}
	
}
