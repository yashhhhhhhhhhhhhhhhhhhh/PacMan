import java.awt.*;


class pacMan extends Block
{
	private int speed;

	public pacMan(int ex, int wy, int wd, int ht, int s)
	{
		super(ex, wy, wd, ht);
		speed = s;
	}

	public void goLeft()
	{
	    setX(getX()-speed);
		if(getX()<0){
			setX(0);
		}
	}
	public void goRight()
	{
		setX(getX()+speed);
		if(getX()>735){
			setX(735);
		}
	}
	public void goUp()
	{
		setY(getY()-speed);
		if(getY()<0){
			setY(0);
		}
	}
	public void goDown()
	{
		setY(getY()+speed);
		if(getY()>510){
			setY(510);
		}
	}


	public void paint( Graphics window )
	{
        Graphics2D g2 = (Graphics2D) window;
        Image img1 = Toolkit.getDefaultToolkit().getImage("pacman.png");
        g2.drawImage(img1, getX(), getY(), getW(), getH(), this);
	}
}