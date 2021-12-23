package CollectionAssignment;

enum Month{
	Jan,Feb,March,April,May,June,Julley,Aug,Sept,October,November,December;
}
class Months{
	Month month;

	public Months(Month month) {
		
		this.month = month;
	}
	public void Test() {
		switch (month) {
		case Jan:
			System.out.println("Jan Month is New Year");
			break;
		case Feb:
		case March:
		case April:
		case May:
			System.out.println("This all months are summer Seasons");
			System.out.println("This months is very hot");
			break;
		case June:
		case Julley:
		case Aug:
		case Sept:
			System.out.println("This all months are Mansoon Seasons");
			System.out.println("This month is very wet");
			break;
		case October:
		case November:
		case December:
			System.out.println("This all months are Winter Seasons");
		System.out.println("This month  is very cool");
			break;
			default:
				System.out.println("Invalid Month");
				
			
		}
	}
	
}
    	

public class MonthMain {
	public static void main(String[] args) {
	    String str="Aug";
    	Months obj=new Months(Month.valueOf(str));
    	obj.Test();
}
}