import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();

        for (int i = 1; i <= 10; i++) {
            studentMap.put(i, "Student" + i);
        }

        studentMap.put(11, "Student11");

        System.out.println("Value for key 5: " + studentMap.get(5));

        HashMap<Integer, String> cloneMap = (HashMap<Integer, String>) studentMap.clone();

        System.out.println("Is key 3 present? " + studentMap.containsKey(3));

        System.out.println("Is value 'Student4' present? " + studentMap.containsValue("Student4"));

        System.out.println("Is the map empty? " + studentMap.isEmpty());

        System.out.println("Size of the map: " + studentMap.size());

        System.out.println("Keys of the map: " + studentMap.keySet());

        System.out.println("Values of the map: " + studentMap.values());

        studentMap.remove(5);

        HashMap<Integer, String> anotherMap = new HashMap<>(studentMap);
        System.out.println("Another map: " + anotherMap);
    }
}
