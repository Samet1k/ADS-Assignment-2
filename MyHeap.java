public class MyHeap<T extends Comparable<T>> {
    private MyArrayList<T> heap = new MyArrayList<>();

    // Check if heap is empty
    public boolean empty() {
        return heap.size() == 0;
    }

    // Return the size of the heap
    public int size() {
        return heap.size();
    }

    // Insert a new item to the heap and maintain heap property
    public void insert(T newItem) {
        heap.add(newItem);
        heapifyUp(heap.size() - 1);  // Ensure heap property after insertion
    }

    // Get the minimum value in the heap (root of the heap)
    public T getMin() {
        if (heap.size() > 0) {
            return heap.get(0); // Root is the minimum
        }
        return null; // Return null if heap is empty
    }

    // Extract the minimum (root) element and maintain heap property
    public T extractMin() {
        if (heap.size() == 0) return null;

        T minimum = heap.get(0); // Root element
        heap.set(0, heap.get(heap.size() - 1)); // Replace root with the last element
        heap.removeLast(); // Remove last element
        heapifyDown(0); // Restore heap property
        return minimum;
    }

    // Maintain the heap property by moving the element at index upwards
    private void heapifyUp(int index) {
        while (index > 0 && heap.get(index).compareTo(heap.get((index - 1) / 2)) < 0) {
            swap(index, (index - 1) / 2); // Swap with parent
            index = (index - 1) / 2; // Move up
        }
    }

    // Maintain the heap property by moving the element at index downwards
    private void heapifyDown(int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int smallest = index;

        if (left < heap.size() && heap.get(left).compareTo(heap.get(smallest)) < 0) {
            smallest = left;
        }

        if (right < heap.size() && heap.get(right).compareTo(heap.get(smallest)) < 0) {
            smallest = right;
        }

        if (smallest != index) {
            swap(index, smallest); // Swap with smallest child
            heapifyDown(smallest); // Continue heapifying down
        }
    }

    // Swap two elements in the heap
    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
