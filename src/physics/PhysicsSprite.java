package physics;

import java.awt.image.BufferedImage;

import sprites.Sprite;

public class PhysicsSprite extends Sprite 
{
	private Vector2D vector = new Vector2D(0, 0);
	private PhysicsRoom room = null;
	
	public PhysicsSprite(PhysicsRoom room)
	{
		this.room = room;
	}
	
	public PhysicsSprite(BufferedImage img, PhysicsRoom room, int x, int y)
	{
		
	}
	
	public void update(long elapsed, long total)
	{
		int xMoved = (int) ((elapsed / 1000) * vector.getXComponent());
		int yMoved = (int) ((elapsed / 1000) * vector.getYComponent());
		
		this.setX( this.getX() + xMoved);
		this.setY( this.getY() + yMoved);
	}
}
