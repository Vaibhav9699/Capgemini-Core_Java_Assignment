package CollectionAssignment;

enum Color{
	Red,Black,White,Blue,Orange;
}
class Colors{
	Color color;

	public Colors(Color color) {
		super();
		this.color = color;
	}
	public void display() {
		switch(color) {
		case Red:
			System.out.println("This is red colour");
			System.out.println("Red is associated with health, life, love");
			break;
		case Black:
			System.out.println("This is Black colour");
			System.out.println("Black is associated with power,fear,strength,formality,");
			break;
		case White:
			System.out.println("This is White colour");
			System.out.println("White is represent purity or simplicity");
			break;
		case Blue:
			System.out.println("This is Blue colour");
			System.out.println("Blue is is associated with stability,inspiration,health");
			break;
		case Orange:
			System.out.println("This is Orange colour");
			System.out.println("Orange is associated with meaning joy, heat, sunshine, creativity, success, change, health");
			break;
		}
	}
}
	

public class ColorsMain {
	public static void main(String[] args) {
		String clr="Black";
		Colors obj=new Colors(Color.valueOf(clr));
		obj.display();
}
}
