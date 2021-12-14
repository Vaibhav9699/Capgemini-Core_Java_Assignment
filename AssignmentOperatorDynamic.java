package Capgemini.assignment;
import java.util.Scanner;
public class AssignmentOperatorDynamic {


		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your number");
			int num=sc.nextInt();
			num += 32;
			System.out.println("This is after assignment += operator "+num);
			num -= 32;
			System.out.println("This is after assignment += operator "+num);
			num *= 32;
			System.out.println("This is after assignment += operator "+num);
			num /= 32;
			System.out.println("This is after assignment += operator "+num);
			num %= 32;
			System.out.println("This is after assignment += operator "+num);
	        
		    //Test case 2:
			System.out.println("=======================Test Case-2===================================");
			int composite1=50;
			num += 21;
			System.out.println("This is after assignment += operator "+num);
			num -= 98;
			System.out.println("This is after assignment += operator "+num);
			num *= 43;
			System.out.println("This is after assignment += operator "+num);
			num /= 9;
			System.out.println("This is after assignment += operator "+num);
			num %= 22;
			System.out.println("This is after assignment += operator "+num);
	        
			

		}

}
