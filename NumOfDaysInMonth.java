package Capgemini.assignment;
import java.util.Scanner;
public class NumOfDaysInMonth {

	public static void main(String[] args) {
		int month;
		Scanner sc = new Scanner (System.in);
		month = sc.nextInt();
		System.out.println("Please enter monthnumber from 1 to 12");
		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31 days in month");
				break;
			
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30 days in month");
				break;
			case 2:
				System.out.println("28 days in month");
				break;
				default :
				System.out.println("Please enter valid number between 1 to 12");
		}
	}

}
