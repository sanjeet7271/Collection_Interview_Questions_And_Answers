# ConcurrentModificationException (CME) in Java Collections

## What is ConcurrentModificationException?

ConcurrentModificationException occurs when a collection is structurally modified while it is being iterated, and the modification is not performed through the Iterator itself.

Structural modifications include:
- add()
- remove()
- clear()

---

# Why Does It Happen?

Collections such as:
- ArrayList
- LinkedList
- Vector
- Stack
- Queue implementations (LinkedList, PriorityQueue, ArrayDeque)

maintain an internal counter called:

```java
modCount
```

When an Iterator is created, it stores:

```java
expectedModCount
```

During iteration, Java checks:

```java
if(modCount != expectedModCount) {
    throw new ConcurrentModificationException();
}
```

---

# ArrayList Example

## Wrong

```java
List<Integer> numbers = new ArrayList<>();

numbers.add(1);
numbers.add(2);
numbers.add(3);

for(Integer number : numbers) {
    if(number == 2) {
        numbers.remove(number);
    }
}
```

Output:

```text
ConcurrentModificationException
```

## Correct

```java
Iterator<Integer> iterator = numbers.iterator();

while(iterator.hasNext()) {
    Integer value = iterator.next();

    if(value == 2) {
        iterator.remove();
    }
}
```

---

# LinkedList Example

## Wrong

```java
LinkedList<Integer> list = new LinkedList<>();

for(Integer value : list) {
    list.remove(value);
}
```

Output:

```text
ConcurrentModificationException
```

## Correct

```java
Iterator<Integer> iterator = list.iterator();

while(iterator.hasNext()) {
    Integer value = iterator.next();

    iterator.remove();
}
```

---

# Vector Example

Although Vector is synchronized, it still throws CME.

```java
Vector<Integer> vector = new Vector<>();

for(Integer value : vector) {
    vector.remove(value);
}
```

Output:

```text
ConcurrentModificationException
```

Reason:
Synchronization protects concurrent access but not modification during iteration.

---

# Stack Example

Stack extends Vector.

```java
Stack<Integer> stack = new Stack<>();

for(Integer value : stack) {
    stack.pop();
}
```

May throw:

```text
ConcurrentModificationException
```

Correct:

```java
while(!stack.isEmpty()) {
    stack.pop();
}
```

---

# Queue Example

## LinkedList Queue

```java
Queue<Integer> queue = new LinkedList<>();

for(Integer value : queue) {
    queue.poll();
}
```

Output:

```text
ConcurrentModificationException
```

---

# Fail-Fast Collections

These can throw CME:

- ArrayList
- LinkedList
- Vector
- Stack
- HashMap
- HashSet
- PriorityQueue
- ArrayDeque

---

# Fail-Safe Collections

These do not throw CME:

## CopyOnWriteArrayList

```java
CopyOnWriteArrayList<String> list =
        new CopyOnWriteArrayList<>();
```

## ConcurrentHashMap

```java
ConcurrentHashMap<Integer, String> map =
        new ConcurrentHashMap<>();
```

## ConcurrentLinkedQueue

```java
ConcurrentLinkedQueue<Integer> queue =
        new ConcurrentLinkedQueue<>();
```

---

# Why CopyOnWriteArrayList Does Not Throw CME

```java
CopyOnWriteArrayList<Integer> list =
        new CopyOnWriteArrayList<>();

for(Integer value : list) {
    list.add(100);
}
```

No exception occurs.

Reason:

- Creates a new copy of the array on modification.
- Iterator works on an immutable snapshot.
- No modCount mismatch.

---

# Interview Answer

ConcurrentModificationException occurs when a fail-fast iterator detects that the collection has been structurally modified after the iterator was created by comparing modCount and expectedModCount.

---

# Summary

| Collection | CME Possible? |
|------------|--------------|
| ArrayList | Yes |
| LinkedList | Yes |
| Vector | Yes |
| Stack | Yes |
| LinkedList Queue | Yes |
| PriorityQueue | Yes |
| ArrayDeque | Yes |
| CopyOnWriteArrayList | No |
| ConcurrentLinkedQueue | No |
| ConcurrentHashMap | No |
