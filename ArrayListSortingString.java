package CollectionAssignment;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingString {

		public static void main(String[] args) {
			ArrayList<String> list=new ArrayList<String>();
			list.add("Saurabh");
			list.add("Ganesh");
			list.add("Aparna");
			list.add("Sonali");
			list.add("Rushi");
			System.out.println("=====Before sorting===========");
			System.out.println(list);
			System.out.println("=====After sorting===========");
			Collections.sort(list);
			System.out.println(list);
			System.out.println("=====Reversing element by"
					+ " sorting===========");
			Collections.reverse(list);
			System.out.println(list);
			

}
}