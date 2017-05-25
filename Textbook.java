package APAttack;

import java.awt.Point;
import java.util.Random;

public class Textbook extends Point{
	
	private boolean eaten;
	private float a;
		public Textbook() {
		this.a = 1.0f;
		int startY = Constants.TEXTBOOK_START_Y;
		if (new Random().nextInt(3) + 1 == 3) {
			startY = Constants.TEXTBOOK_START_Y_2;
		}
		this.setLocation(new Point(Constants.TEXTBOOK_START_X, startY));
	}
	
		public void moveLeft() {
			this.setLocation(this.getX() - Constants.TEXTBOOK_X_VELOCITY, this.getY());
		}

		public boolean isEaten() {
			return eaten;
		}
		public void setEaten(boolean eaten) {
			this.eaten = eaten;
		}

		public float getAlpha() {
			return a;
		}
		
		public void setAlpha(float alpha) {
			this.a = alpha;
		}
	
	
	
	

}
