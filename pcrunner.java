import javax.swing.*;

class pcrunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public pcrunner()
	{
		super("Pac-Man");

		setSize(WIDTH,HEIGHT);

		getContentPane().add( new pc() );
				
		setVisible(true);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		pcrunner run = new pcrunner();
	}
}