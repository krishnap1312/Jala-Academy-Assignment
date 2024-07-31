import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();

        for (int i = 1; i <= 10; i++) {
            stringSet.add("Element " + i);
        }

        stringSet.add("New Element");

        for (String element : stringSet) {
            System.out.println(element);
        }

        stringSet.remove("Element 3");

        System.out.println("Is 'Element 4' present? " + stringSet.contains("Element 4"));

        System.out.println("Size of the HashSet: " + stringSet.size());

        System.out.println("Is the HashSet empty? " + stringSet.isEmpty());

        stringSet.clear();
        System.out.println("Size of the HashSet after clearing: " + stringSet.size());
    }
}
