import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

/*
 *	Directions: 
 *				Make the brick extend Block
 *
 *				Write the Brick constructor that takes an x, y, w, h to create a block.
 *
 *				Override the paint method to draw a Brick

				Choose to draw or import an image.
 *
 *				Go to BreakOut and do Step 3, then test in the runner.
 *
 *				If all works correctly then move on to Steps 4 - 6 in BreakOut.
 */ 
 
class Brick extends Block
{
	public Brick(int ex, int wy, int wd, int ht){
        super(ex, wy, wd, ht);
    }

    public void paint (Graphics window){

//        window.setColor(Color.RED);
//        window.fillRect(getX(), getY(), getW(), getH());
//        window.setColor(Color.BLACK);
//        window.drawRect(getX(), getY(), getW(), getH());

        Graphics2D g = (Graphics2D) window;
        Image img = Toolkit.getDefaultToolkit().getImage("brick.png");
        g.drawImage(img, getX(), getY(), getW(), getH(), this);
    }
}