public class MyStack<T> {
    private MyArrayList<T> arrayList;  // MyArrayList немесе MyLinkedList

    public MyStack(boolean useArrayList) {
        if (useArrayList) {
            arrayList = new MyArrayList<>();
        } else {
            // Егер MyLinkedList қолданғыңыз келсе, оны қосуға болады
            arrayList = new MyArrayList<>();
            // linkedList = new MyLinkedList<>();
        }
    }

    // Стек бос па екенін тексеру
    public boolean isEmpty() {
        return arrayList.size() == 0;
    }

    // Стек өлшемін қайтару
    public int size() {
        return arrayList.size();
    }

    // Элементті стекке қосу
    public T push(T newItem) {
        arrayList.addLast(newItem);  // MyArrayList немесе MyLinkedList әдісін қолданамыз
        return newItem;
    }

    // Стектің жоғарғы элементін көру
    public T peek() {
        return arrayList.getLast();  // MyArrayList немесе MyLinkedList әдісін қолданамыз
    }

    // Стектің жоғарғы элементін алу және жою
    public T pop() {
        T removingItem = peek();  // Жоғарғы элементті аламыз
        arrayList.removeLast();   // MyArrayList немесе MyLinkedList әдісін қолданамыз
        return removingItem;
    }
}
