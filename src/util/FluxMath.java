package util;


public class FluxMath 
{
	/**
	 * Returns an accurate but slow distance between two Point2Ds
	 * 
	 * @param one - The first Point2D to be compared.
	 * @param two - The second Point2D to be compared.
	 * @return A double of the distance between the two given Point2Ds.
	 */
	public static double distance(Point2D one, Point2D two)
	{
		int x1 = one.getX();
		int x2 = two.getX();
		
		int y1 = one.getY();
		int y2 = two.getY();
		
		double xSq = Math.pow((x2 - x1), 2);
		double ySq = Math.pow((y2 - y1), 2);
		
		return Math.sqrt(xSq - ySq);
	}
}
