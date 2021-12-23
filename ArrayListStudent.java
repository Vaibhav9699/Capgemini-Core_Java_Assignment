package CollectionAssignment;

import java.util.ArrayList;


public class ArrayListStudent {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		System.out.println(list.get(0) * list.get(0));
		System.out.println(list.get(1) * list.get(0));
		System.out.println(list.get(2) * list.get(0));
		System.out.println(list.get(3) * list.get(0));
		System.out.println(list.get(4) * list.get(0));
		for (int i = 0; i < list.size(); i++) {
			int add = list.get(i) * list.get(i);
			System.out.println(add);
		}

//	//remove  0th
	list.remove(0);
//	System.out.println("After removing element "+list);
//	list.clear();
//	System.out.println("Empty "+list);
//list.removeAll(list);
//	System.out.println("Empty "+list);
//	list.addAll(list);

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.addAll(list);
		list.remove(2);
		System.out.println("After adding all list to list1: " + list1);
		boolean v2 = list1.contains(10);
		boolean v3 = list.containsAll(list1);

		System.out.println("Key 14 is exist in hashmap? : " + v3);
		System.out.println("Key 10 is exist in hashmap? : " + v2);
		System.out.println();
}
}