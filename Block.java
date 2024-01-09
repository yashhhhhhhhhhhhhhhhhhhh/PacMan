import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

abstract class Block extends Canvas
{
	private int x, y, w, h;

	public Block( int ex, int wy, int wd, int ht)
	{
		//write the Block constructor
		x = ex;
		y = wy;
		w = wd;
		h = ht;
	}
	
	public int getX( ){ return x; }
	public void setX( int ex ){ x = ex; }
	public int getY( ){ return y; }
	public void setY( int wy ){ y = wy; }
	public int getW(){ return w; }
	public int getH(){ return h; }
	
	
	public boolean intersects( Block other )
	{
		/*
		 * 		Copy and Paste the following URL in google chrome
		 *		https://docs.oracle.com/javase/8/docs/api/java/awt/Rectangle.html
		 *		make new Rectangle, using this Block's x,y,w,h
		 *		make new Rectangle, using the other Block's x,y,w,h
		 *		return if the two rectangles intersect, use the Rectangle's intersects method.
		 */

		Rectangle a = new Rectangle(x, y, w, h);
		Rectangle b = new Rectangle(other.getX(), other.getY(), other.getW(), other.getH());
		if(a.intersects(b)){
			return true;
		}
		return false;
	}
}