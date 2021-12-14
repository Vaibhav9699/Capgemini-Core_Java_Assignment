package Capgemini.assignment;
import java.util.Scanner;
public class AreaOfCube {

	public static void main(String[] args) {
		double side, volume,surfaceArea;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter length of side of cube");
		side = sc.nextDouble();
		surfaceArea =6*side*side;
		volume=side*side*side;
		System.out.println("Surface area of cube = "+ surfaceArea);
		System.out.println("volume of cube = "+volume);
	}

}
