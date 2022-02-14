package findNearestPoints;


/**
 * Write a description of class FindNearestPoints here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FindNearestPoints
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the number of points: ");
		int numberOfPoints = input.nextInt();
		
		double [][] points = new double[numberOfPoints] [2];
		System.out.println("Enter " + numberOfPoints + " points: ");
		
		public static double fillArray(double [][] points)
		{
		import java.util.Scanner;
		
			
			for (int i = 0; i < points.length; i ++)
			 	{
				 	points [i][0] = input.nextDouble();
				 	points [i][1] = input.nextDouble();
			 	}
		
			 }
		//p1 and p2 are the indices in the point's array
		int p1 = 0;
		int p2 = 1;
		double shortestDistance = distance(points[p1][0], points [p1] [1], points [p2][0], points [p2][1]);
		
		//Compute distance for every two points
		for (int i = 0; i < points.length; i++)
		{
			for (int j = i + 1; j < points.length; j++)
			{
				double distance = distance(points [i][0], points [i][1], points [j][0], points [j][1]);
				
				if (shortestDistance > distance) 
				{
					p1 = i;
					p2 = j;
					shortestDistance = distance; 
				}
			}
		}
		
		//Display result
		System.out.println("The closest two points are " + "(" + points[p1][0] + ", " + points[p1][1] + ") and (" + points[p2][0] + ", " + points[p2][1] + ")");	
	}
	
	/** Compute the distance between two points (x1, y1) and (x2, y2) */
	public static double distance( double x1, double y1, double x2, double y2)
	{
		return Math.sqrt((x2-x1) * (x2-x1) + (y2 - y1) * (y2 - y1));
	}
	
}


}
