package APAttack;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerMovement implements KeyListener{
Player player; 
	public PlayerMovement(Player p)
	{
		
		player = p; 
		
	}
	
	@Override
	public void keyPressed(KeyEvent k) {
		if (k.getKeyCode() == KeyEvent.VK_UP)
		{
			player.setMoveUp(true);
		}
		
		if(k.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			player.setMoveRight();
		}
		if(k.getKeyCode() == KeyEvent.VK_LEFT)
		{
			player.setMoveLeft(); 
		}
	}

	@Override
	public void keyReleased(KeyEvent k) {
		
		if (k.getKeyCode() == KeyEvent.VK_UP)
		{
			player.setVelY(0);
		}
		
		if(k.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			player.setVelX(0);
		}
		if(k.getKeyCode() == KeyEvent.VK_LEFT)
		{
			player.setVelX(0);  
		}
		
		
		
	}

	@Override
	public void keyTyped(KeyEvent k) {

	}
	
	
}