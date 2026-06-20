# Java Collections Framework Interview Handbook

# Part 1: ArrayList Interview Questions (30 Q&A)

## What is ArrayList?
ArrayList is a dynamic array implementation of the List interface.

## Key Characteristics
- Maintains insertion order
- Allows duplicates
- Allows null values
- Fast random access
- Not synchronized

## Common Interview Questions
### Why is ArrayList retrieval O(1)?
Because it uses an internal array and supports direct index access.

### Difference between ArrayList and LinkedList?
| ArrayList | LinkedList |
|------------|------------|
| O(1) retrieval | O(n) retrieval |
| Slow insertion in middle | Faster insertion/deletion |
| Less memory | More memory |

### Default Capacity
10 after first insertion.

### Growth Formula
```java
newCapacity = oldCapacity + (oldCapacity >> 1);
```

### Time Complexity
| Operation | Complexity |
|------------|------------|
| get() | O(1) |
| set() | O(1) |
| add() | O(1) amortized |
| remove() | O(n) |
| contains() | O(n) |

(Additional ArrayList questions can be expanded during revision.)

---

# Part 2: SDET-Focused ArrayList Interview Guide

## Q1. Why is ArrayList commonly used in automation frameworks?
**Answer:**

Used for:
- Storing test data
- Managing API responses
- Collecting web elements
- Data-driven testing

Example:

```java
List<String> testUsers = new ArrayList<>();
```

---

## Q2. ArrayList or LinkedList for Selenium automation?

**Answer:**

Prefer ArrayList because:

- Frequent reads
- Random access
- Less insertion/deletion

---

## Q3. Store WebElements in ArrayList

```java
List<WebElement> links =
driver.findElements(By.tagName("a"));
```

---

## Q4. How do you remove duplicate test data?

```java
Set<String> unique =
new HashSet<>(list);
```

---

## Q5. How do you iterate API response values?

```java
for(String item : responseList){
    System.out.println(item);
}
```

---

## Q6. Thread Safety Concern

ArrayList is not thread-safe.

Use:

```java
CopyOnWriteArrayList<String> list =
new CopyOnWriteArrayList<>();
```

---

## Q7. Why use ensureCapacity() in frameworks?

Improves performance when loading large test datasets.

```java
list.ensureCapacity(10000);
```

---

## Q8. Common Automation Use Cases

- Reading Excel data
- API validation
- Selenium element collections
- Database result validation
- Test execution reports

---

# Part 3: Java Collections Framework Interview Handbook

## Collection Hierarchy

```text
Iterable
   |
Collection
   |
-----------------------------------
|         |         |
List      Set      Queue
```

---

# List Interface

## ArrayList

Best for:
- Frequent retrieval
- Random access

Complexity:

```text
get() = O(1)
add() = O(1)
remove() = O(n)
```

## LinkedList

Best for:
- Frequent insertion/deletion

## Vector

- Thread-safe
- Legacy class

## Stack

LIFO structure.

```java
Stack<Integer> stack = new Stack<>();
```

Operations:

```java
push()
pop()
peek()
```

---

# Set Interface

## HashSet

Features:

- No duplicates
- Unordered

Complexity:

```text
add() = O(1)
contains() = O(1)
```

## LinkedHashSet

- Maintains insertion order

## TreeSet

- Sorted order

Complexity:

```text
O(log n)
```

---

# Queue Interface

## PriorityQueue

Features:

- Elements sorted by priority

```java
PriorityQueue<Integer> pq =
new PriorityQueue<>();
```

---

# Map Interface

## HashMap

Most asked interview topic.

Features:

- Key-value pair
- Allows one null key
- Not synchronized

Complexity:

```text
put() = O(1)
get() = O(1)
```

### Internal Working

1. HashCode
2. Bucket Calculation
3. Equals Check

---

## LinkedHashMap

Maintains insertion order.

---

## TreeMap

Sorted by key.

Complexity:

```text
O(log n)
```

---

## Hashtable

- Thread-safe
- No null key/value

---

# HashMap Interview Questions

### Difference between HashMap and Hashtable?

| HashMap | Hashtable |
|----------|-----------|
| Not synchronized | Synchronized |
| Allows null key | No null key |

### Difference between HashMap and ConcurrentHashMap?

ConcurrentHashMap supports concurrent updates with better performance.

---

# Frequently Asked SDET Collection Questions

1. Difference between List and Set?
2. Difference between ArrayList and LinkedList?
3. HashMap Internal Working?
4. equals() vs hashCode()?
5. Fail-fast vs Fail-safe?
6. ConcurrentHashMap vs HashMap?
7. ArrayList vs Vector?
8. HashSet vs TreeSet?
9. Why is HashMap O(1)?
10. What is CopyOnWriteArrayList?

---

# Quick Revision Sheet

## List
- ArrayList
- LinkedList
- Vector
- Stack

## Set
- HashSet
- LinkedHashSet
- TreeSet

## Queue
- PriorityQueue

## Map
- HashMap
- LinkedHashMap
- TreeMap
- Hashtable
- ConcurrentHashMap

This handbook covers the most commonly asked Java Collections and SDET interview topics.
