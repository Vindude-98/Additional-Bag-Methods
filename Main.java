
public class Main {

	public static void main(String[] args) {
		Bag<String> bag1 = new Bag();
		Bag<String> bag2 = new Bag();

		
		bag1.add("Apple");
		bag1.add("Strawberry");
		bag1.add("Apple");
		bag1.add("Orange");
		bag1.add("Cucumber");
		bag1.add("Apple");
		
		bag2.add("Water");
		bag2.add("Sprite");
		bag2.add("Coke");
		bag2.add("Apple");
		
		System.out.print("Bag1 Contents:");
		bag1.printContents();

		System.out.print("\nBag2 Contents:");
		bag2.printContents();
		
		System.out.println("\nSize of bag1: " + bag1.size());
		System.out.println("Size of bag2: " + bag2.size());
		
		bag1.merge(bag2);
		
		System.out.print("\nContents of bag1 after merge.");
		bag1.printContents();
		
		Bag<String> uniqueBag = bag1.distinct();
		
		System.out.print("\nDistinct elements in bag: ");
		uniqueBag.printContents();

	}

}