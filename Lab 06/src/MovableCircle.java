//Steven Kast, katsm
//CSE 271, Dr Bravo
//March 2, 2017
//Lab 06, Interfaces

public class MovableCircle implements Movable {

	private MovablePoint center;
	private int radius;
	
	//Constructor
	public MovableCircle(double x, double y, double xSpeed, double ySpeed, int radius){
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}
	//end constructor
	
	//Interface implementation
	@Override
	public void moveUp() {
		center.moveUp();
	}

	@Override
	public void moveDown() {
		center.moveDown();

	}

	@Override
	public void moveRight() {
		center.moveRight();

	}

	@Override
	public void moveLeft() {
		center.moveLeft();
	}
	//End interface implementation

	@Override
	public String toString() {
		return center.toString() + " radius = " + radius;
	}
}
