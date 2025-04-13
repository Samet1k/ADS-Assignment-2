# ADSAssignment2

## Class: Main
Testing all methods of **MyArrayList** and **MyLinkedList** classes.

## Class: MyArrayList
- **add(T item)**: Adds a new item to the end of the array.
- **increaseBuffer()**: Increases the capacity of the array if the current capacity is reached.
- **set(int index, T item)**: Sets an item at the specified index.
- **add(int index, T item)**: Adds an item at a specific index.
- **addFirst(T item)**: Adds an item at the front (index 0) of the list.
- **addLast(T item)**: Adds an item at the end of the list.
- **get(int index)**: Retrieves the item at the specified index.
- **getFirst()**: Retrieves the first element in the array (index 0).
- **getLast()**: Retrieves the last element in the array.
- **remove(int index)**: Removes the item at the specified index.
- **removeFirst()**: Removes the first element in the array (index 0).
- **removeLast()**: Removes the last element in the array.
- **sort()**: Sorts the array using the **Comparable** interface to compare elements.
- **indexOf(Object object)**: Finds the index of the first occurrence of an item.
- **lastIndexOf(Object object)**: Finds the index of the last occurrence of an item.
- **exists(Object object)**: Checks if an item exists in the array (returns true if found).
- **toArray()**: Converts the array to a new **Object[]** array.
- **clear()**: Clears the entire array, setting all elements to **null** and resetting the size.
- **size()**: Returns the current number of elements in the array.

## Class: MyLinkedList
- **add(T item)**: Adds an item to the end of the linked list.
- **set(int index, T item)**: Sets an item at the specified index in the linked list.
- **add(int index, T item)**: Adds an item at a specific index in the linked list.
- **addFirst(T item)**: Adds an item at the front (index 0) of the linked list.
- **addLast(T item)**: Adds an item at the end of the linked list.
- **get(int index)**: Retrieves the item at the specified index.
- **getFirst()**: Retrieves the first element in the linked list.
- **getLast()**: Retrieves the last element in the linked list.
- **remove(int index)**: Removes the item at the specified index in the linked list.
- **removeFirst()**: Removes the first element in the linked list.
- **removeLast()**: Removes the last element in the linked list.
- **sort()**: Sorting functionality (yet to be implemented in the linked list).
- **indexOf(Object object)**: Finds the index of the first occurrence of an item in the linked list.
- **lastIndexOf(Object object)**: Finds the index of the last occurrence of an item in the linked list.
- **exists(Object object)**: Checks if an item exists in the linked list (returns true if found).
- **toArray()**: Converts the linked list to an array of **Object[]**.
- **clear()**: Clears all elements in the linked list.
- **size()**: Returns the current number of elements in the linked list.

## Additional Notes:
1. The **MyArrayList** and **MyLinkedList** classes implement the **MyList** interface.
2. **MyArrayList** uses a dynamic array to store elements, while **MyLinkedList** uses a doubly linked list with references to the next and previous nodes.
3. **MyArrayList** has methods for adding, removing, and retrieving elements, as well as sorting the array using **Comparable**.
4. **MyLinkedList** has similar methods but operates with a different underlying data structure (doubly linked list).
5. All methods in both classes should be thoroughly tested in the **Main** class.

## Author:
- **Alzhan Samet**  
- **GitHub**: [Samet1k](https://github.com/Samet1k)
