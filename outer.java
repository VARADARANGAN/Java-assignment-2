package program7;

public class outer {
	int x;
	void display() {
		System.out.println("outer class display x:"+x);
		Inner inner = new Inner();
		inner.x = 100;
		inner.display();
	}
	class Inner{
		int x;
		void display() {
			System.out.println("in inner display x:"+x);
		}
	}
	public static void main(String[]args) {
		outer outer = new outer();
		outer.x = 200;
		outer.display();
	}
}
