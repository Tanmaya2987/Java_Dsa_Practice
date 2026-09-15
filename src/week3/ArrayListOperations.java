package week3;
import java.util.ArrayList;

public class ArrayListOperations {
	 public static void main(String[] args) {

			ArrayList<String> fruits = new ArrayList<>();

			// ADD
			fruits.add("Apple");
			fruits.add("Banana");
			fruits.add("Mango");
			fruits.add("Orange");

			System.out.println("After adding:");
			System.out.println(fruits);

			// RETRIEVE
			System.out.println("Element at index 1: " + fruits.get(1));

			// UPDATE
			fruits.set(1, "Grapes");

			System.out.println("After updating:");
			System.out.println(fruits);

			// REMOVE using index
			fruits.remove(2);

			System.out.println("After removing index 2:");
			System.out.println(fruits);

			// CHECK ELEMENT
			System.out.println("Contains Apple? " + fruits.contains("Apple"));

			System.out.println("Contains Mango? " + fruits.contains("Mango"));

			// SIZE
			System.out.println("Size: " + fruits.size());
		}

}
