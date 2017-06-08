package APAttack;


import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Game extends JPanel implements Runnable {

     //changing these values will change the size of the game, while still remaining functional
    //within the size limit specified.
    static int windowWidth;
	static int windowHeight;
	BufferedImage textbook;
	File f;
	int randNumb;
	int circleWidth;
	int circleHeight;
	int circleYLocation; 
	int textbookYLocation;
	int playerYLocation; 
	int randomRange;
	boolean numberCreated;
	static boolean gameRunning;
	
	public void initialize()
	{
    windowWidth = 1500;
    windowHeight = 1100;
     f = new File("textbook.jpg");
     randNumb = 0;
     circleWidth = 50;
     circleHeight = 50;
     circleYLocation = -circleHeight;
     textbookYLocation = -textbook.getHeight();
     playerYLocation = 0;;
     numberCreated = false;
     gameRunning = false;
     
     try {
    	 textbook = ImageIO.read(f);
     }
     catch (IOException e) {
    	 
     }
     
     randomRange = 1500 - textbook.getWidth();
     
}
    
    public void start() {
        gameRunning = true;
    }
    
    @Override
	public void run() {
		
	}
    //generatrandom Y value inside the window for the circle to spawn at
    public void generateRandomNumber() {
        Random rand = new Random();
        randNumb = rand.nextInt(randomRange);
        numberCreated = true;
 
    }

    //paints a black screen, then paints a rectangle on top of the black screen
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(1,1,1500,1100);
        g.setColor(Color.BLUE);
    }
    public void paintComponent(Graphics gg)
    {
    	g.drawImage(textbook,randNumb,textbookYLocation)
    	
    }
    
    public void update() {

        //calls the generateRandomNumber() method which gives the circle a random x value inside the screen
        if (!numberCreated) {
            this.generateRandomNumber();
        }
        //moves the circles y coordinate towards the bottom of the screen and stops once it hits the bottom
        if (textbookYLocation <= windowHeight) {
     //
            //resets the x and y location to a new position
        } else {
            numberCreated = false;
            textbookYLocation = -textbook.getHeight();
        }
    }

    //sets the while loop to true to start the game
    

    public static void main(String[] args) throws InterruptedException {

        Game game = new Game();
        JFrame frame = new JFrame();
        frame.add(game);
        frame.setVisible(true);
        frame.setSize(1500, 1100);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("AP Attack");
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);

        game.start();

        //updates circle position, repaints circle, and slows down update and paint speed.
        while (gameRunning) {
            game.update();
            game.repaint();
            Thread.sleep(1);
        }
    }
 
	
}