# ArrayList Interview Questions and Answers

## 1. What is an ArrayList in Java?
**Answer:** ArrayList is a resizable array implementation of the List interface in Java.

## 2. Difference between Array and ArrayList?
| Array | ArrayList |
|---------|------------|
| Fixed size | Dynamic size |
| Can store primitives | Stores objects |
| No built-in methods | Rich API methods |

## 3. What is the default capacity of an ArrayList?
In Java 8+, the internal array starts empty and grows to capacity 10 after the first insertion.

## 4. How does ArrayList grow internally?
```java
newCapacity = oldCapacity + (oldCapacity >> 1);
```

## 5. Difference between size() and capacity()?
- Size = Number of elements present.
- Capacity = Total storage available before resizing.

## 6. Does ArrayList allow duplicates?
Yes.

## 7. Does ArrayList allow null values?
Yes, multiple null values are allowed.

## 8. Is ArrayList ordered?
Yes, it maintains insertion order.

## 9. Is ArrayList synchronized?
No, it is not thread-safe.

## 10. Difference between ArrayList and Vector?
- ArrayList: Not synchronized, faster.
- Vector: Synchronized, slower.

## 11. Difference between ArrayList and LinkedList?
- ArrayList: Fast retrieval O(1).
- LinkedList: Retrieval O(n), better for frequent insertions/deletions.

## 12. Time Complexity
| Operation | Complexity |
|------------|------------|
| get() | O(1) |
| set() | O(1) |
| add() at end | O(1) amortized |
| add(index) | O(n) |
| remove(index) | O(n) |
| contains() | O(n) |

## 13. Why is get() O(1)?
Because ArrayList uses direct index access on an internal array.

## 14. Why is insertion in the middle expensive?
Elements must be shifted, resulting in O(n) complexity.

## 15. What happens when capacity is exceeded?
A larger array is created and existing elements are copied.

## 16. What is ensureCapacity()?
Pre-allocates memory to improve performance.

## 17. What is trimToSize()?
Reduces capacity to match current size.

## 18. What is fail-fast behavior?
Modifying the list during iteration throws ConcurrentModificationException.

## 19. How can you safely remove elements during iteration?
Use Iterator.remove().

## 20. Difference between remove(int) and remove(Object)?
- remove(int): Removes by index.
- remove(Object): Removes matching object.

## 21. What is RandomAccess?
A marker interface indicating fast index-based access.

## 22. Can ArrayList store primitive data types?
No. Use wrapper classes such as Integer, Double, etc.

## 23. Convert ArrayList to Array
```java
String[] arr = list.toArray(new String[0]);
```

## 24. Convert Array to ArrayList
```java
ArrayList<String> list =
new ArrayList<>(Arrays.asList(arr));
```

## 25. How do you sort an ArrayList?
```java
Collections.sort(list);
```

## 26. Arrays.asList() vs ArrayList
Arrays.asList() returns a fixed-size list. ArrayList supports add/remove operations.

## 27. When should you use ArrayList?
When applications require frequent reads and random access.

## 28. How do you make ArrayList thread-safe?
```java
Collections.synchronizedList(new ArrayList<>());
```
or
```java
CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
```

## 29. Advantages of ArrayList
- Dynamic resizing
- Fast retrieval
- Rich API support
- Maintains insertion order

## 30. Disadvantages of ArrayList
- Not thread-safe
- Slow insertions/deletions in middle
- Resizing overhead

## Most Asked Interview Question
### Why is ArrayList retrieval faster than LinkedList?
ArrayList stores elements in contiguous memory and provides O(1) index-based access, while LinkedList requires traversal with O(n) complexity.
