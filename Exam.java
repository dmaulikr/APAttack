package APAttack;
import java.awt.Point;


public class Exam extends Point {

	private int health;
	private boolean jumpedOn;
	
	public Exam() {
		this.setLocation(new Point(Constants.EXAM_START_X, Constants.EXAM_START_Y));
		this.health = Constants.EXAM_HEALTH_MAX;
	}

	public void moveLeft() {
		this.setLocation(this.getX() - Constants.EXAM_X_VELOCITY, this.getY());
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public boolean isJumpedOn() {
		return jumpedOn;
	}

	public void setJumpedOn(boolean jumpedOn) {
		this.jumpedOn = jumpedOn;
	}
	
	
}




