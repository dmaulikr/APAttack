package APAttack;

import java.awt.Point;

public class HealthBar extends Point{

private int health;
	
	public HealthBar() {
		this.health = Constants.HEALTH_MAX;
	}
	
	public void addHealth() {
		if (this.health < 100) {
			this.health += 1;
		}
	}
	
	public void removeHealth() {
		if (this.health > 0) {
			this.health -= 1;
		}
	}

	public int getHealth() {
		return this.health;
	}

	public void setHealth(int health) {
		this.health = health; 
		
	}

	public double getX() {
		return Constants.HEALTHBAR_X + Constants.HEALTHBAR_WIDTH - (int) (this.health / Constants.HEALTH_MAX * Constants.HEALTHBAR_WIDTH);
	}

	public float getHealthPercentage() {
		return this.health / Constants.HEALTH_MAX;
	}
	
	
}
