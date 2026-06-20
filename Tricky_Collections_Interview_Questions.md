# Tricky Interview Questions & Answers on ArrayList, LinkedList, Queue, Vector, and Stack

# ArrayList

## Q1. What is the output?

```java
List<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);

list.remove(1);

System.out.println(list);
```

### Answer
```text
[10]
```

Reason: remove(int index) removes by index.

---

## Q2. What is the output?

```java
list.remove(Integer.valueOf(10));
```

### Answer
```text
[20]
```

Reason: remove(Object obj) removes by value.

---

## Q3. Why does this throw ConcurrentModificationException?

```java
for(String item : list){
    list.remove(item);
}
```

### Answer
ArrayList iterator is fail-fast.

Correct approach:

```java
Iterator<String> iterator = list.iterator();

while(iterator.hasNext()){
    iterator.next();
    iterator.remove();
}
```

---

## Q4. Default Capacity of ArrayList?

### Answer
- Initial Capacity = 0
- After first insertion = 10

---

## Q5. Capacity vs Size

```java
ArrayList<Integer> list =
new ArrayList<>(100);

list.add(1);
```

### Answer

```text
Capacity = 100
Size = 1
```

---

# LinkedList

## Q6. Which is faster?

```java
arrayList.get(9999);
linkedList.get(9999);
```

### Answer

```text
ArrayList -> O(1)
LinkedList -> O(n)
```

---

## Q7. Output

```java
LinkedList<Integer> list =
new LinkedList<>();

list.addFirst(10);
list.addFirst(20);

System.out.println(list);
```

### Answer

```text
[20,10]
```

---

## Q8. Why does LinkedList consume more memory?

### Answer

Each node stores:

```text
Data
Next Pointer
Previous Pointer
```

---

## Q9. Find Middle Node Complexity

### Answer

```text
Time  O(n)
Space O(1)
```

Using slow and fast pointers.

---

# Queue

## Q10. Difference between add() and offer()

### Answer

```java
add()
```

Throws exception if insertion fails.

```java
offer()
```

Returns false if insertion fails.

---

## Q11. Difference between poll() and remove()

### Answer

```java
poll()
```

Returns null when empty.

```java
remove()
```

Throws NoSuchElementException.

---

## Q12. Difference between peek() and element()

### Answer

```java
peek()
```

Returns null if queue is empty.

```java
element()
```

Throws NoSuchElementException.

---

## Q13. Output

```java
Queue<Integer> q = new LinkedList<>();

q.offer(10);
q.offer(20);

System.out.println(q.poll());
System.out.println(q.peek());
```

### Answer

```text
10
20
```

---

# Stack

## Q14. Output

```java
Stack<Integer> stack = new Stack<>();

stack.push(10);
stack.push(20);
stack.push(30);

System.out.println(stack.pop());
```

### Answer

```text
30
```

LIFO behavior.

---

## Q15. Difference between pop() and peek()

### Answer

```java
pop()
```

Removes and returns element.

```java
peek()
```

Returns top element only.

---

## Q16. Output

```java
Stack<Integer> stack = new Stack<>();

stack.push(1);
stack.push(2);

System.out.println(stack.peek());
System.out.println(stack.peek());
```

### Answer

```text
2
2
```

peek() does not remove.

---

## Q17. Why is Stack considered legacy?

### Answer

```java
Stack extends Vector
```

Modern replacement:

```java
Deque<Integer> stack =
new ArrayDeque<>();
```

---

# Vector

## Q18. Difference between Vector and ArrayList

| Vector | ArrayList |
|----------|-----------|
| Synchronized | Not synchronized |
| Slower | Faster |
| Legacy | Modern |

---

## Q19. Capacity Growth

### Answer

```text
ArrayList = 1.5x
Vector = 2x
```

---

## Q20. Output

```java
Vector<Integer> vector =
new Vector<>(2);

vector.add(1);
vector.add(2);
vector.add(3);

System.out.println(vector.capacity());
```

### Answer

```text
4
```

Capacity doubles.

---

# Senior-Level Questions

## Q21. Why is ArrayList get() O(1)?

### Answer

```java
elementData[index]
```

Direct array access.

---

## Q22. Why is LinkedList get() O(n)?

### Answer

Must traverse nodes sequentially.

---

## Q23. Why is ArrayList insertion O(n)?

### Answer

Elements must shift positions.

---

## Q24. Why does ConcurrentModificationException occur?

### Answer

ArrayList maintains:

```java
modCount
```

Iterator validates modCount during traversal.

---

## Q25. Which Collection Would You Choose?

| Scenario | Best Choice |
|-----------|------------|
| Frequent Reads | ArrayList |
| Frequent Inserts/Deletes | LinkedList |
| FIFO | Queue |
| LIFO | Stack / Deque |
| Thread-safe Dynamic Array | Vector / CopyOnWriteArrayList |
| Modern Stack | ArrayDeque |

---

# Most Asked Product Company Question

## Why is ArrayList preferred over LinkedList?

### Answer

- O(1) random access
- Better CPU cache locality
- Lower memory usage
- Faster iteration
- Better real-world performance

Therefore, ArrayList is usually the default choice.
