package ex04.inheritance;

class Point {
		int x, y;
		
		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
			System.out.println("Point 클래스 매개변수 2개");
		}
		
		public Point() {
			x = y = 5;
//			this(5, 5);
			System.out.println("Point 클래스 디폴트 생성자함수");
		}
		
		public Point(int x) {
			super();
			this.x = x;
			System.out.println("Point 클래스 매개변수 1개");
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public void disp() {
			System.out.print(x + ", " + y + " ");	
		}
		
} //end Point class
