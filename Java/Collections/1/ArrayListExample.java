import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            stringList.add("Element " + i);
        }

        stringList.add("New Element");

        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        stringList.add(5, "Inserted Element");

        stringList.remove("Element 3");

        stringList.remove(7);

        stringList.set(2, "Updated Element");

        System.out.println("Element at index 2: " + stringList.get(2));

        System.out.println("Element at index 5: " + stringList.get(5));

        System.out.println("Size of the ArrayList: " + stringList.size());

        System.out.println("Is 'Element 4' present? " + stringList.contains("Element 4"));

        stringList.clear();
        System.out.println("Size of the ArrayList after clearing: " + stringList.size());
    }
}
