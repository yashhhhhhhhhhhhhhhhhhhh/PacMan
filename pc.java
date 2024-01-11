import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.MouseInfo;

public class pc extends JPanel implements Runnable, KeyListener
{
	private boolean[] keys;
	private pacMan player;

	public pc()
	{
		setBackground(Color.WHITE);

		keys = new boolean[5];
		for(boolean k : keys){
			k = false;
			System.out.println(k);
		}
		player = new pacMan( 0, 50, 50, 50, 10);
		addKeyListener( this );
		setFocusable( true );
		new Thread(this).start();
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.BLACK);
		window.fillRect( 0,0, 800, 600);
//		window.setColor(Color.WHITE);
//		window.drawString("Mouse  coordinates " + "(" + MouseInfo.getPointerInfo().getLocation().x + "   " + MouseInfo.getPointerInfo().getLocation().y + ")", 250, 30 );
		player.paint( window );
		if(keys[0]) // Left Arrow is pressed
		{
			player.goLeft();
		}
		if(keys[1]) // Right Arrow is pressed
		{
			player.goRight();
		}
		if(keys[2]) // Up Arrow is pressed
		{
			player.goUp();
		}
		if(keys[3]) // Down Arrow is pressed
		{
			player.goDown();
		}
	}
	public void keyPressed(KeyEvent e)
	{
		//Java KeyEvent docs
		//https://docs.oracle.com/javase/8/docs/api/java/awt/event/KeyEvent.html

		if( e.getKeyCode()  == KeyEvent.VK_LEFT )
		{
			keys[0]=true;
		}
		if( e.getKeyCode()  == KeyEvent.VK_RIGHT )
		{
			keys[1]=true;
		}
		if( e.getKeyCode()  == KeyEvent.VK_UP )
		{
			keys[2]=true;
		}
		if( e.getKeyCode()  == KeyEvent.VK_DOWN )
		{
			keys[3]=true;
		}
	}
	public void keyTyped(KeyEvent e) {
		keyPressed(e);
	}
	public void keyReleased(KeyEvent e) {
		if( e.getKeyCode()  == KeyEvent.VK_LEFT )
		{
			keys[0]=true;
		}
		if( e.getKeyCode()  == KeyEvent.VK_RIGHT )
		{
			keys[1]=true;
		}
		if( e.getKeyCode()  == KeyEvent.VK_UP )
		{
			keys[2]=true;
		}
		if( e.getKeyCode()  == KeyEvent.VK_DOWN )
		{
			keys[3]=true;
		}
	}

	public void run()
	{
		try
		{
			while( true )
			{
			   Thread.sleep(50);
			   repaint();
			}
		}
		catch( Exception e )
		{

		}
	}
}