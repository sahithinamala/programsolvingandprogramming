
package Game;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class minitennis extends JPanel {
    class Racquet{
        int y = 330;
	int width = 60;
	 int height = 10;
	
	minitennis game;
	 int x;
	 int xspeed;
          Racquet(minitennis game) {
		this.game = game;
	}
	
	public void move() {
		if (x + xspeed > 0 && x + xspeed < game.getWidth()- width)
			x = x + xspeed;
	}

	public void paint(Graphics2D g) {
		g.fillRect(x, y, width, height);
	}

	public void keyReleased(KeyEvent e) {
		xspeed = 0;
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			xspeed = -game.speed;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			xspeed = game.speed;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}
	
	public int gety() {
		return y;
	}
    }
    class Ball {
	int diameter = 40;
	 int x;
	 int y;
	 int xspeed;
	 int yspeed;
         minitennis game;
         public Ball(minitennis game) {
		this.game = game;
		xspeed = 1;
		yspeed = 1;
                
	}
         void move(){
		if (x + xspeed < 0)
			xspeed = game.speed;
		if (x + xspeed > game.getWidth() - diameter)
			xspeed = -game.speed;
		if (y + yspeed < 0)
			yspeed = game.speed;
		if (y + yspeed > game.getHeight() - diameter) {
			game.speed = 1;
			game.gameOver();
		}
		if (collision()) {
			yspeed = -game.speed;
			y = game.racquet.gety() - diameter;
			game.speed++;
		}
		x = x + xspeed;
		y =y + yspeed;
	}
         
         public void paint(Graphics2D g) {
		g.fillOval(x, y, diameter, diameter);
               
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x,y, diameter, diameter);
	}
	
	public boolean collision() {
		return game.racquet.getBounds().intersects(getBounds());
	}
        
    }
    Racquet racquet = new Racquet(this);
    Ball ball = new Ball(this);
	int speed = 1;
	public int getScore() {
		return speed -1 ;
	}
        
        public minitennis() {
            
		addKeyListener(new KeyListener() {
                        @Override
			public void keyTyped(KeyEvent e) {
				
			}
			public void keyPressed(KeyEvent e) {
				racquet.keyPressed(e);
			}
	
			public void keyReleased(KeyEvent e) {
				racquet.keyReleased(e);
			}
		});
		setFocusable(true);
	}

    public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		minitennis game = new minitennis();
		JFrame frame = new JFrame("Mini Tennis");
		frame.add(game);
		frame.setSize(300, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setBackground(Color.PINK);
		while (true) {
			game.move();
			game.repaint();
			Thread.sleep(10);
		}
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		ball.paint(g2);
		racquet.paint(g2);
		
		g2.setColor(Color.BLACK);
		g2.setFont(new Font("Italic", Font.ITALIC, 35));
		g2.drawString(String.valueOf(getScore()), 10, 30);
	}
	
	public void move() {
		ball.move();
		racquet.move();
	}
        public void gameOver() {
		int n = JOptionPane.showConfirmDialog(this, "Would you like to play again?","Game Over",JOptionPane.YES_NO_OPTION);
		if (n == JOptionPane.YES_OPTION) {
			ball.yspeed = -1;
		} 
                else {
			System.exit(ABORT);
		}
	}
      
	
	
}
