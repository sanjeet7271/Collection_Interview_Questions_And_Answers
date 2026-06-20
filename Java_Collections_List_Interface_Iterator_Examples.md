# Java Collection Iterator Examples

## ArrayList Using Iterator

```java
ArrayList<String> arrayList = new ArrayList<>();
arrayList.add("Java");
arrayList.add("Python");
arrayList.add("C++");

Iterator<String> alIterator = arrayList.iterator();
while (alIterator.hasNext()) {
    System.out.println(alIterator.next());
}
```

## LinkedList Using Iterator

```java
LinkedList<String> linkedList = new LinkedList<>();
linkedList.add("Delhi");
linkedList.add("Mumbai");
linkedList.add("Chennai");

Iterator<String> llIterator = linkedList.iterator();
while (llIterator.hasNext()) {
    System.out.println(llIterator.next());
}
```

## Queue Using Iterator

```java
Queue<String> queue = new LinkedList<>();
queue.add("Apple");
queue.add("Banana");
queue.add("Orange");

Iterator<String> qIterator = queue.iterator();
while (qIterator.hasNext()) {
    System.out.println(qIterator.next());
}
```

## Vector Using Iterator

```java
Vector<String> vector = new Vector<>();
vector.add("Red");
vector.add("Green");
vector.add("Blue");

Iterator<String> vIterator = vector.iterator();
while (vIterator.hasNext()) {
    System.out.println(vIterator.next());
}
```

## Vector Using Enumeration

```java
Vector<String> cities = new Vector<>();
cities.add("Delhi");
cities.add("Mumbai");
cities.add("Chennai");
cities.add("Kolkata");

Enumeration<String> e = cities.elements();

while (e.hasMoreElements()) {
    System.out.println(e.nextElement());
}
```

## Stack Using Iterator

```java
Stack<String> stack = new Stack<>();
stack.push("Book");
stack.push("Pen");
stack.push("Pencil");

Iterator<String> sIterator = stack.iterator();
while (sIterator.hasNext()) {
    System.out.println(sIterator.next());
}
```
