package Capgemini.assignment;

public class CalculatorByUsingMethod {
	public void add(int num1, int num2) {
		int addition= num1+num2;
		System.out.println("addition of "+num1+" and "+num2+" is "+addition);
	}
	public void substract(int num1, int num2) {
		int sub= num1-num2;
		System.out.println(sub);
	}
	public void multiply(int num1, int num2) {
		int multipl= num1*num2;
		System.out.println(multipl);
	}
	public void devide(int num1, int num2) {
		int devid= num1/num2;
		System.out.println(devid);
	}
	public static void main(String[] args) {
		CalculatorByUsingMethod obj = new CalculatorByUsingMethod();
		obj.add(4,2);
		obj.substract(4,2);
		obj.multiply(4,2);
		obj.devide(4,2);
	}

}
