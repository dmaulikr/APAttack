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
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			player.setMoveUp(true);
		}
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			player.set
		}
	}

	@Override
	public void keyReleased(KeyEvent k) {
		
	}

	@Override
	public void keyTyped(KeyEvent k) {

	}
	
	
}
