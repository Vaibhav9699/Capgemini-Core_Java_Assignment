package Capgemini.assignment;

public class AssignmentOperator {



	public static void main(String[] args) {
		//Test case 1:
		System.out.println("========================Test Case-1=====================");
		int composite=200;
		composite += 32;
		System.out.println("This is after assignment += operator "+composite);
		composite -= 32;
		System.out.println("This is after assignment += operator "+composite);
		composite *= 32;
		System.out.println("This is after assignment += operator "+composite);
		composite /= 32;
		System.out.println("This is after assignment += operator "+composite);
		composite %= 32;
		System.out.println("This is after assignment += operator "+composite);
        
	    //Test case 2:
		System.out.println("=======================Test Case-2===================================");
		int composite1=50;
		composite += 21;
		System.out.println("This is after assignment += operator "+composite);
		composite -= 98;
		System.out.println("This is after assignment += operator "+composite);
		composite *= 43;
		System.out.println("This is after assignment += operator "+composite);
		composite /= 9;
		System.out.println("This is after assignment += operator "+composite);
		composite %= 22;
		System.out.println("This is after assignment += operator "+composite);
        
	}

}