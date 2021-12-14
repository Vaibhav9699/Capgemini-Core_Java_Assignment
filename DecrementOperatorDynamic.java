package Capgemini.assignment;
import java.util.Scanner;
public class DecrementOperatorDynamic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("==============Pre-Decrement Operation========");
		--num1;
		--num2;
		System.out.println("After pre-decrement operation value of num1 is "+num1);
		System.out.println("After pre-decrement operation value of num1 is "+num2);
		System.out.println("==============Post-Decrement Operation========");
		--num1;
		--num2;
		System.out.println("After post-decrement operation value of num1 is "+num1);
		System.out.println("After post-decrement operation value of num1 is "+num2);

	}

}

