import java.util.Random;

public class TestHashTable {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>(31); // A prime number for better distribution
        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            int id = rand.nextInt(100000);
            String name = "User" + rand.nextInt(10000);
            Student student = new Student("Student" + i, rand.nextInt(30) + 18);
            table.put(new MyTestingClass(id, name), student);
        }

        for (int i = 0; i < 31; i++) {
            int count = 0;
            MyHashTable<?, ?>.HashNode<?, ?> node = ((MyHashTable<MyTestingClass, Student>) table).chainArray[i];
            while (node != null) {
                count++;
                node = node.next;
            }
            System.out.println("Bucket " + i + ": " + count + " elements");
        }
    }
}
