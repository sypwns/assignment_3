Assignment 3 — Custom BST and HashTable in Java
Overview
This project implements a custom Binary Search Tree (BST) and Hash Table in Java, along with supporting classes.

Key features:

Custom BST implementation with basic operations.
In-order traversal using iterator().
Access to both key and value during BST iteration.
Basic HashTable implementation with chaining for collision handling.
Custom key class MyTestingClass with a manually tuned hashCode().
Note: Main.java currently tests only the BST functionalities.

Project Structure
src/
├── BST.java
├── Entry.java
├── MyHashTable.java
├── MyTestingClass.java
├── Student.java
├── Main.java
Classes
1. BST<K extends Comparable<K>, V>
   put(K key, V value): Inserts a key-value pair into the BST.
   get(K key): Retrieves the value associated with a key.
   delete(K key): Deletes a node by key.
   size(): Returns the number of nodes.
   iterator(): In-order traversal, yielding Entry<K, V> pairs.
   Example:

for (var entry : bst) {
System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
}
2. MyHashTable<K, V>
   Custom hash table with an array of buckets (linked lists).
   Handles collisions with chaining.
   Basic operations: put, get, remove, contains, size.
   (Not tested in the current Main.java.)

3. MyTestingClass
   Custom key class designed for use in hash tables.
   Fields: two integers (a and b).
   Implements a manually tuned hashCode() and equals() for better uniform distribution.
4. Student
   Simple class representing a student with name and age fields.
   Used as values in MyHashTable.
   How to Run
   Compile all .java files:
   javac src/*.java
   Run the Main class:
   java src.Main
   Current Main.java Test Flow
   Creates a BST<Integer, String>.
   Inserts several key-value pairs.
   Retrieves a value by key.
   Iterates through the tree using in-order traversal.
   Deletes a key and verifies the result with a second traversal.