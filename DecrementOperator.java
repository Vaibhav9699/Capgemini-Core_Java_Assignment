package Capgemini.assignment;

public class DecrementOperator {

		public static void main(String[] args) {
	         int a=10;
	         int b=20;
	         
	         System.out.println("The value of a is "+a);
	         System.out.println("The value of b is "+b);
	         System.out.println("========Pre-decrement operator==============");
	         --a;
	         --b;
	         System.out.println("After Pre-decrement value of a is "+a);
	         System.out.println("After Pre-decrement value of b is "+b);
	         System.out.println("========post-decrement operator==============");
	         a--;
	         b--;
	         System.out.println("After Post-decrement value of a is "+a);
	         System.out.println("After Post-decrement value of b is "+b);
	         System.out.println("===========Addition operation of pre-decrement and post-decrement operator========");
	         int add=--a + a-- + b-- + --b;
	         System.out.println("After addition of pre-decrement and post-decrement operator is "+add);
	         

		}

	

}
