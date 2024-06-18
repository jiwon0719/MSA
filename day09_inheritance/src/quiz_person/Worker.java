package quiz_person;

public class Worker extends Person {

	String depart = "KOSA";

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public Worker(String depart) {
		super("seoul", 20);
		this.depart = depart;
	}

	public Worker() {
		super("seoul", 20);
	}
	
	public void disp() {
		super.disp();
		System.out.println(", ");
	}
	
	
	
}
