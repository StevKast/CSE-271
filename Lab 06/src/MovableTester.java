
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
		
		Movable[] mArray = {m1, m2};
		chaChaSlide(mArray);
		
		System.out.println("\n" + m1);
		System.out.println(m2);
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
