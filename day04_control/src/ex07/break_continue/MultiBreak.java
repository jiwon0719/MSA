package ex07.break_continue;

public class MultiBreak {
	public static void main(String[] args) {
		
		boolean flag = true;
		
		first : {  // 식별자 : { } 
		
			second : {
				
				third : {
				
					int k = 100;
					System.out.println("Before the break");
					
					if (flag) break second;
						
						System.out.println("This won't execute");
					
				} //end third
				System.out.println("화이팅 6기수님들!! ");
				
			} //end second
			System.out.println("This is after second block");
			
		} //end first
		System.out.println("123455556667778");
		
	}
}
