package findnearestpoints;

import java.util.Scanner;

public class FindNearestPoints {
	public static void main(String[] args) {

	}
	public static void inputArray() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of points: ");
		int numberOfPoints = input.nextInt();
		final double[][] points = new double[numberOfPoints][3];
	}

	public int[] closestPoints(double[][] points) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter " + numberOfPoints + " points: ");
		for (int i = 0; i < points.length; i++) {
			points[i][0] = input.nextDouble();
			points[i][1] = input.nextDouble();
			points[i][2] = input.nextDouble();
		}

		// p1 and p2 are the indices in the point's array
		int p1 = 0;
		int p2 = 1;
		int p3 = 2;
		double shortestDistance = distance(points[p1][0], points[p1][1],
				points[p1][2], points[p2][0], points[p2][1], points[p2][2],
				points[p3][0], points[p3][1], points[p3][2]);

		// Compute distance for every two points
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) {
				for (int t = i + 2; t < points.length; t++) {
					double distance = distance(points[i][0], points[i][1],
							points[j][0], points[j][1], points[t][0],
							points[t][1]);
				}

				if (shortestDistance > distance) {
					p1 = i;
					p2 = j;
					p3 = t;
					shortestDistance = distance;
				}
			}
		}
	}

	public void displayClosestPoints(double[][] points) {
		System.out.println("The closest two points are " + "(" + points[p1][0]
				+ ", " + points[p1][1] + ") and (" + points[p2][0] + ", "
				+ points[p2][1] + ")");

	}

	public static double distance(double x1, double y1, double x2, double y2,
			double z1, double z2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)
				+ (z2 - z1) * (z2 - z1));
	}

}
