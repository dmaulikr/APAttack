package APAttack;

import java.awt.Color;
import java.awt.Point;

public class Player extends Point{

String name; 
private boolean moveRight;
private boolean moveLeft;
private boolean moveUp;
private int velY;
private int velX;	
	
	public Player()	
	{
	this.setLocation(new Point(0, Constants.PLAYER_START_Y));
	this.moveRight = false;
	this.moveLeft = false;
	this.moveUp = false;
	
	}

	
	public boolean isMovingRight() {
		return moveRight;
	}

	public void setMoveRight() {
		this.setLocation(this.getX() + this.velX, this.getY());
	}

	public boolean isMovingLeft() {
		return moveLeft;
	}

	public void setMoveLeft() {
		this.setLocation(this.getX() - this.velX, this.getY());
	}

	public boolean isMovingUp() {
		if((this.getY() - this.getVelY()) > this.getY())
		{
			return true; 
		}
		else
		{
			return false;			
		}
	}


	public void setMoveUp(boolean moveUp) {
		this.moveUp = moveUp;
	}

	public int getVelY() {
		return velY;
	}

	public void setVelY(int velY) {
		this.velY = velY;
	}

	public int getVelX() {
		return velX;
	}

	public void setVelX(int velX) {
		this.velX = velX;
	}
	
	
	public static void main(String[] args)
	{
	
		Player p = new Player(); 
		System.out.println(p.isMovingRight());
		
	}
	
	
	
	
	
	
}
