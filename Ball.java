import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

/*
 *	Directions: extend the Block class to use the Block methods
 *
 *				Override the paint method to draw a Ball
 *				
 *				Make an xspeed and a yspeed instance variable in order to make the ball bounce
 *				
 *				Create a Ball constructor, using the Paddle constructor as an example, it can still take
 *				in just one speed, then set both instance variables to that one speed.
 *				
 *				Create a bounce method that keeps the ball on the screen but bounces around the screen.
 *				Do NOT test if the ball is touching the bricks or the paddle in this method, you will do that
 *				in the game logic in BreakOut.java.
 *
 *				Go to BreakOut and do Step 2 and test it in the runner.
 *
 *				If all works then move on to Brick
 *				
 */

class Ball extends Block
{
	private int xspeed;
    private int yspeed;
	
    public Ball(int ex, int wy, int wd, int ht, int s){
        super(ex, wy, wd, ht);
        xspeed = s;
        yspeed = s;
    }

    public int getXspeed(){
        return xspeed;
    }

    public int getYspeed(){
        return yspeed;
    }

    public void setXspeed(int xs){
        xspeed = xs;
    }

    public void setYspeed(int ys){
        yspeed = ys;
    }

    public void bounce(){

        setX(getX()-xspeed);
        setY(getY()-yspeed);

        if(getX()<=0){
            xspeed-=5;
        }
        if(getX()>=750){
            xspeed+=5;
        }
        if(getY()<=0){
            yspeed-=5;
        }
//        if(getY()>=550){
//            yspeed+=5;
//        }
    }

    public void paint(Graphics window){

        window.setColor(Color.BLUE);
        window.fillOval(getX(), getY(), getW(), getH());
        window.setColor(Color.BLACK);
        window.drawOval(getX(), getY(), getW(), getH());

        Graphics2D g = (Graphics2D) window;
        Image img = Toolkit.getDefaultToolkit().getImage("mushroom.png");
        g.drawImage(img, getX(), getY(), getW(), getH(), this);
    }
}