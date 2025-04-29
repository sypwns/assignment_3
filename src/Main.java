public class Main {
    public static void main(String[] args) {
        BST<Integer, String> tree = new BST<>();

        // Testing put()
        tree.put(5, "five");
        tree.put(3, "three");
        tree.put(7, "seven");
        tree.put(2, "two");
        tree.put(4, "four");
        tree.put(6, "six");
        tree.put(8, "eight");

        System.out.println("Size after insertion: " + tree.size()); // Should be 7

        System.out.println("Get key 4: " + tree.get(4)); // Should be "four"
        System.out.println("Get key 6: " + tree.get(6)); // Should be "six"
        System.out.println("Get key 10 (non-existent): " + tree.get(10)); // Should be null

        System.out.println("\nIn-order traversal:");
        for (var elem : tree) {
            System.out.println("Key: " + elem.getKey() + ", Value: " + elem.getValue());
        }

        tree.delete(3);
        tree.delete(7);

        System.out.println("\nSize after deletion: " + tree.size()); // Should be 5

        // Testing traversal after deletion
        System.out.println("\nIn-order traversal after deletion:");
        for (var elem : tree) {
            System.out.println("Key: " + elem.getKey() + ", Value: " + elem.getValue());
        }
    }
}