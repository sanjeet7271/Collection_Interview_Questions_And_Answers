# Java Heap Memory and String Constant Pool - Tricky Questions and Answers

## 1. How many objects are created?

``` java
String s1 = "Java";
String s2 = "Java";
```

**Answer:** 1 object

## 2. How many objects are created?

``` java
String s1 = new String("Java");
```

**Answer:** 2 objects

## 3. How many objects are created?

``` java
String s1 = new String("Java");
String s2 = new String("Java");
```

**Answer:** 3 objects

## 4. Output?

``` java
String s1 = "Java";
String s2 = "Java";

System.out.println(s1 == s2);
System.out.println(s1.equals(s2));
```

Output:

``` text
true
true
```

## 5. Output?

``` java
String s1 = new String("Java");
String s2 = new String("Java");

System.out.println(s1 == s2);
System.out.println(s1.equals(s2));
```

Output:

``` text
false
true
```

## 6. Output?

``` java
String s1 = "Java";
String s2 = new String("Java");

System.out.println(s1 == s2);
```

Output:

``` text
false
```

## 7. intern() example

``` java
String s1 = new String("Java");
String s2 = s1.intern();

System.out.println(s1 == s2);
```

Output:

``` text
false
```

## 8. intern() with SCP

``` java
String s1 = "Java";
String s2 = new String("Java").intern();

System.out.println(s1 == s2);
```

Output:

``` text
true
```

## 9. Compile Time Concatenation

``` java
String s1 = "Ja" + "va";
String s2 = "Java";

System.out.println(s1 == s2);
```

Output:

``` text
true
```

## 10. Runtime Concatenation

``` java
String s1 = "Ja";
String s2 = s1 + "va";
String s3 = "Java";

System.out.println(s2 == s3);
```

Output:

``` text
false
```

## 11. final keyword optimization

``` java
final String s1 = "Ja";
String s2 = s1 + "va";
String s3 = "Java";

System.out.println(s2 == s3);
```

Output:

``` text
true
```

## 12. equals vs ==

``` java
String s1 = "Java";
String s2 = "Ja";
String s3 = "va";

System.out.println(s1 == s2 + s3);
System.out.println(s1.equals(s2 + s3));
```

Output:

``` text
false
true
```

## 13. Heap vs Stack vs SCP

-   Stack stores references.
-   Heap stores objects.
-   SCP stores string literals.

## 14. intern() comparison

``` java
String s1 = new String("Hello");
String s2 = "Hello";
String s3 = s1.intern();
```

## 15. String immutability

``` java
String s1 = "Java";
s1.concat("8");

System.out.println(s1);
```

Output:

``` text
Java
```

## 16. String reassignment

``` java
String s1 = "Java";
s1 = s1.concat("8");

System.out.println(s1);
```

Output:

``` text
Java8
```

## Interview Summary

  Scenario                   Objects Created
  -------------------------- -----------------------
  `String s="Java";`         1
  `new String("Java")`       2
  Two `new String("Java")`   3
  `"Ja" + "va"`              1
  `s1 + "va"`                New heap object
  `intern()`                 Returns SCP reference
