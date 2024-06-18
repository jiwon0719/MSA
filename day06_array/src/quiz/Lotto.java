package quiz;

public class Lotto {
	public static void main(String[] args) {
		// 문제] 로또 프로그램 작성하기, 1~45숫자 중에서 6개 추출한다(같은 수 x)

		// 번호 추출(난수)
		int[] num = new int[6];
		int temp = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45 + 1);
			
			// 삽입 정렬로 번호 비교 > 중복 제거
			for (int j = 0; j < num.length; j++) {
				for(int k = j+1; k < num.length; k++) {
	
					if (num[j] == num[k]) {
						do {
							num[k] = (int) (Math.random() * 45 + 1);
						} while (num[j] == num[k]);
					}
					
				} //end for
			} //end for

			System.out.print(num[i] + "\t");
		} // end for

	}
}
