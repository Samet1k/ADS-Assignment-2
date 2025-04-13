public class Main {
    public static void main(String[] args) {
        // MyArrayList Test
        System.out.println("Testing MyArrayList:");
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        int n = 10;
        
        // Add elements to the ArrayList
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        
        // Set and add elements at specific positions
        arrayList.set(7, 2);  // Set value at index 7
        arrayList.add(2, 8);   // Add 8 at index 2
        arrayList.addFirst(3); // Add 3 at the beginning
        arrayList.addLast(5);  // Add 5 at the end
        
        // Print specific elements
        System.out.println("Element at index 8: " + arrayList.get(8));
        System.out.println("First element: " + arrayList.getFirst());
        System.out.println("Last element: " + arrayList.getLast());

        // Remove elements
        arrayList.remove(1);   // Remove element at index 1
        arrayList.removeFirst(); // Remove first element
        arrayList.removeLast();  // Remove last element

        // Sorting the array
        arrayList.sort();

        // Check indices and existence of elements
        System.out.println("Index of 13: " + arrayList.indexOf(13));
        System.out.println("Last index of 2: " + arrayList.lastIndexOf(2));
        System.out.println("Does 19 exist in the list? " + arrayList.exists(19));

        // Convert to array and print
        System.out.println("Array contents: " + java.util.Arrays.toString(arrayList.toArray()));

        // Clear the list and print size
        arrayList.clear();
        System.out.println("ArrayList size after clearing: " + arrayList.size());
        
        // MyLinkedList Test
        System.out.println("\nTesting MyLinkedList:");
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        
        // Add elements to the LinkedList
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        
        // Print the entire list
        System.out.print("LinkedList elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println();
        
        // Modify and add elements
        linkedList.set(2, 19);  // Set element at index 2 to 19
        linkedList.add(4, 7);    // Add 7 at index 4
        linkedList.addFirst(8);  // Add 8 at the beginning
        linkedList.addLast(99);  // Add 99 at the end
        
        // Print updated elements
        System.out.println("Element at index 2: " + linkedList.get(2));
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

        // Remove elements
        linkedList.remove(2);    // Remove element at index 2
        linkedList.removeFirst(); // Remove the first element
        linkedList.removeLast();  // Remove the last element

        // Check indices and existence of elements
        System.out.println("Index of 4: " + linkedList.indexOf(4));
        System.out.println("Last index of 5: " + linkedList.lastIndexOf(5));
        System.out.println("Does 99 exist in the list? " + linkedList.exists(99));

        // Convert to array and print
        System.out.println("LinkedList contents as array: " + java.util.Arrays.toString(linkedList.toArray()));
        
        // Clear the list and print size
        linkedList.clear();
        System.out.println("LinkedList size after clearing: " + linkedList.size());
    }
}
