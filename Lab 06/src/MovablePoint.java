
public class MovablePoint implements Movable {
	
	private double x, y;
	private double xSpeed, ySpeed;
	
	//Constructors
	public MovablePoint(double x, double y, double xSpeed, double ySpeed){
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	//End constructors
	
	//Getters and setters
	public double getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(double xSpeed) {
		if(xSpeed >= 0) {this.xSpeed = xSpeed;}
	}

	public double getySpeed() {
		return ySpeed;
	}

	public void setySpeed(double ySpeed) {
		if(ySpeed >= 0) {this.ySpeed = ySpeed;}
	}
	//End getters and setters

	@Override
	public void moveUp() {
		y = y + ySpeed;
	}

	@Override
	public void moveDown() {
		y = y - ySpeed;
	}

	@Override
	public void moveRight() {
		x = x + xSpeed;
	}

	@Override
	public void moveLeft() {
		x = x - xSpeed;
	}
	
	@Override
	public String toString(){
		return "x = " + x + " xSpeed = " + xSpeed + " y = " + y + " ySpeed = " + ySpeed;
	}

}
