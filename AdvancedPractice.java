package Collection;
import java.util.ArrayList;
import java.util.Collections;
public class AdvancedPractice {
 
	//Sorting of ArrayList<String>
	
	public static void main(String[] args) {
		//We created an array which are consisting of list of countries.
		ArrayList<Integer> ListOfCountries = new ArrayList<Integer>();
		ListOfCountries.add(10);
		ListOfCountries.add(9);
		ListOfCountries.add(13);
		ListOfCountries.add(8);
		
		/*Unsorted List*/
		System.out.println("Arrays Before Sorting");
		for(Integer counter : ListOfCountries)
		{
			System.out.println(counter);
		}
		
		/*Sorted List */
		Collections.sort(ListOfCountries,Collections.reverseOrder());
		System.out.println("Arrays After Sorting");
		for(Integer counter : ListOfCountries) {
			System.out.println(counter);
		}
	}

}
