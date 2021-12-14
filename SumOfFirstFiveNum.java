package Capgemini.assignment;
import java.util.Scanner;
public class SumOfFirstFiveNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n= sc.nextInt();
		int sum=0;
		
		for (int i =0;i<=n;i++)
		{
			sum=sum+i;
		
		}
		System.out.println("Sum of first "+n+" natural numbers ="+sum);

		System.out.println("average of first "+n+ "numbers is = "+sum/n);
	}

}
