# Java Set and Map Iterator Examples

## HashSet Using Iterator

```java
HashSet<String> hashSet = new HashSet<>();
hashSet.add("Java");
hashSet.add("Python");
hashSet.add("C++");

Iterator<String> hsIterator = hashSet.iterator();
while (hsIterator.hasNext()) {
    System.out.println(hsIterator.next());
}
```

## LinkedHashSet Using Iterator

```java
LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
linkedHashSet.add("Java");
linkedHashSet.add("Python");
linkedHashSet.add("C++");

Iterator<String> lhsIterator = linkedHashSet.iterator();
while (lhsIterator.hasNext()) {
    System.out.println(lhsIterator.next());
}
```

## TreeSet Using Iterator

```java
TreeSet<String> treeSet = new TreeSet<>();
treeSet.add("Java");
treeSet.add("Python");
treeSet.add("C++");

Iterator<String> tsIterator = treeSet.iterator();
while (tsIterator.hasNext()) {
    System.out.println(tsIterator.next());
}
```

## HashMap Using Iterator

```java
HashMap<Integer, String> hashMap = new HashMap<>();
hashMap.put(101, "John");
hashMap.put(102, "David");
hashMap.put(103, "Mike");

Iterator<Map.Entry<Integer, String>> hmIterator =
    hashMap.entrySet().iterator();

while (hmIterator.hasNext()) {
    Map.Entry<Integer, String> entry = hmIterator.next();
    System.out.println(entry.getKey() + " : " + entry.getValue());
}
```

## LinkedHashMap Using Iterator

```java
LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
linkedHashMap.put(101, "John");
linkedHashMap.put(102, "David");
linkedHashMap.put(103, "Mike");

Iterator<Map.Entry<Integer, String>> lhmIterator =
    linkedHashMap.entrySet().iterator();

while (lhmIterator.hasNext()) {
    Map.Entry<Integer, String> entry = lhmIterator.next();
    System.out.println(entry.getKey() + " : " + entry.getValue());
}
```

## TreeMap Using Iterator

```java
TreeMap<Integer, String> treeMap = new TreeMap<>();
treeMap.put(101, "John");
treeMap.put(102, "David");
treeMap.put(103, "Mike");

Iterator<Map.Entry<Integer, String>> tmIterator =
    treeMap.entrySet().iterator();

while (tmIterator.hasNext()) {
    Map.Entry<Integer, String> entry = tmIterator.next();
    System.out.println(entry.getKey() + " : " + entry.getValue());
}
```
