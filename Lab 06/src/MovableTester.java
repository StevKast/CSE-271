//Steven Kast, katsm
//CSE 271, Dr Bravo
//March 2, 2017
//Lab 06, Interfaces

public class MovableTester {

	public static void main(String[] args){
		Movable m1 = new MovablePoint(5, 6, 10,12);
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		
		Movable m2 = new MovableCircle(2, 1, 2, 20,50);
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);
		
		Movable m3 = new MovablePoint(0, 0, 1, 1);
		Movable m4 = new MovableCircle(0, 0, 1, 1, 5);
		Movable[] mArray = {m3, m4};
		chaChaSlide(mArray);
		
		System.out.println("\nExpected:");
		System.out.println("(x,y) = (-1.0, 1.0) xSpeed = 1.0 ySpeed = 1.0");
		System.out.println("(x,y) = (-1.0, 1.0) xSpeed = 1.0 ySpeed = 1.0 radius = 5");
		
		System.out.println("Actual:\n" + m3 + "\n" + m4);
		
		m3.moveRight();
		m3.moveDown();
		System.out.println("\nExpected:\n(x,y) = (0.0, 0.0) xSpeed = 1.0 ySpeed = 1.0");
		System.out.println("Actual:\n" + m3);
	}

	public static void chaChaSlide(Movable[] movable){
		for(Movable point: movable){
			point.moveLeft();
			point.moveRight();
			point.moveDown();
			point.moveUp();
			point.moveLeft();
			point.moveDown();
			point.moveUp();
			point.moveRight();
			point.moveLeft();
			point.moveDown();
			point.moveUp();
			point.moveUp();

		}
	}
}
