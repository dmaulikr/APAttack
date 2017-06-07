package APAttack;


import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

public class Game extends JPanel {

    //changing these values will change the size of the game, while still remaining functional
    //within the size limit specified.
	
    static int windowWidth = 1500;
    static int windowHeight = 1100;
    BufferedImage textbook = ImageIO.read(new File("textbook.jpg"));
    int randNumb = 0;
    int circleWidth = 50;
    int circleHeight = 50;
    int circleYLocation = -circleHeight;
    int textbookYLocation = -textbook.getHeight();
    int playerYLocation;
    boolean numberCreated = false;
    static boolean gameRunning = false;
   
    //generates a random Y value inside the window for the circle to spawn at
    public void generateRandomNumber() {
        Random rand = new Random();
        randNumb = rand.nextInt(windowWidth - textbook.getWidth());
        
        numberCreated = true;
    }

    //paints a black screen, then paints a rectangle on top of the black screen
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, windowWidth, windowHeight);
        g.setColor(Color.BLUE);
        g.fillOval(randNumb, circleYLocation, circleWidth, circleHeight);
        g.drawImage(textbook, randNumb, textbookYLocation, null);
    }

    public void update() {

        //calls the generateRandomNumber() method which gives the circle a random x value inside the screen
        if (!numberCreated) {
            generateRandomNumber();
        }
        //moves the circles y coordinate towards the bottom of the screen and stops once it hits the bottom
        if (textbookYLocation <= windowHeight) {
            textbookYLocation++;

            //resets the x and y location to a new position
        } else {
            numberCreated = false;
            textbookYLocation = -textbook.getHeight();
        }
    }

    //sets the while loop to true to start the game
    public void start() {
        gameRunning = true;
    }

    public static void main(String[] args) throws InterruptedException {

        Game game = new Game();
        JFrame frame = new JFrame();
        frame.add(game);
        frame.setVisible(true);
        frame.setSize(windowWidth, windowHeight);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("AP Attack");
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        game.start();

        //updates circle position, repaints circle, and slows down update and paint speed.
        while (gameRunning) {
            game.update();
            game.repaint();
            Thread.sleep(5);
        }
    }
}