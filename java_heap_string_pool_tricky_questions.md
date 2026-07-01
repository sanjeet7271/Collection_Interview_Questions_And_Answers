# Java Heap Memory and String Constant Pool - 20 Tricky Questions and Answers

## 1. How many objects are created?

``` java
String s1 = "Java";
String s2 = "Java";
```

**Answer:** 1 object

**Explanation:** Both references point to the same object in the String
Constant Pool (SCP).

------------------------------------------------------------------------

## 2. How many objects are created?

``` java
String s1 = new String("Java");
```

**Answer:** 2 objects

1.  `"Java"` in SCP
2.  Heap object created by `new String()`

------------------------------------------------------------------------

## 3. How many objects are created?

``` java
String s1 = new String("Java");
String s2 = new String("Java");
```

**Answer:** 3 objects

1.  `"Java"` in SCP
2.  Heap object for `s1`
3.  Heap object for `s2`

------------------------------------------------------------------------

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

------------------------------------------------------------------------

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

------------------------------------------------------------------------

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

------------------------------------------------------------------------

## 7. What happens with intern()?

``` java
String s1 = new String("Java");
String s2 = s1.intern();

System.out.println(s1 == s2);
```

Output:

``` text
false
```

------------------------------------------------------------------------

## 8. Output?

``` java
String s1 = "Java";
String s2 = new String("Java").intern();

System.out.println(s1 == s2);
```

Output:

``` text
true
```

------------------------------------------------------------------------

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

------------------------------------------------------------------------

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

------------------------------------------------------------------------

## 11. final Keyword Optimization

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

------------------------------------------------------------------------

## 12. Output?

``` java
String s1 = "Java";
String s2 = "Ja";
String s3 = "va";

System.out.println(s1 == s2 + s3);
```

Output:

``` text
false
```

------------------------------------------------------------------------

## 13. Output?

``` java
String s1 = "Java";
String s2 = "Ja";
String s3 = "va";

System.out.println(s1.equals(s2 + s3));
```

Output:

``` text
true
```

------------------------------------------------------------------------

## 14. Heap vs Stack vs SCP

``` java
public class Test {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
    }
}
```

-   Stack stores references.
-   Heap stores objects.
-   SCP stores string literals.

------------------------------------------------------------------------

## 15. Tricky Interview Question

``` java
String s1 = new String("Hello");
String s2 = "Hello";
String s3 = s1.intern();

System.out.println(s1 == s2);
System.out.println(s2 == s3);
System.out.println(s1 == s3);
```

Output:

``` text
false
true
false
```

------------------------------------------------------------------------

## 16. How many objects?

``` java
String s1 = new String("A") + new String("B");
```

**Answer:** Typically 5 objects plus a temporary StringBuilder object.

------------------------------------------------------------------------

## 17. Frequently Asked Interview Question

``` java
String s1 = "abc";
String s2 = new String("abc");
String s3 = s2.intern();

System.out.println(s1 == s2);
System.out.println(s1 == s3);
System.out.println(s2 == s3);
```

Output:

``` text
false
true
false
```

------------------------------------------------------------------------

## 18. String Immutability

``` java
String s1 = "Java";
s1.concat("8");

System.out.println(s1);
```

Output:

``` text
Java
```

------------------------------------------------------------------------

## 19. String Reassignment

``` java
String s1 = "Java";
s1 = s1.concat("8");

System.out.println(s1);
```

Output:

``` text
Java8
```

------------------------------------------------------------------------

## 20. Why is String Immutable?

-   Enables String Constant Pool optimization.
-   Improves security.
-   Makes String thread-safe.
-   Allows hash code caching.
-   Makes String suitable as keys in HashMap.

------------------------------------------------------------------------

## Interview Summary

  Scenario                   Objects Created
  -------------------------- -----------------------
  `String s="Java";`         1
  `new String("Java")`       2
  Two `new String("Java")`   3
  `"Ja" + "va"`              1
  `s1 + "va"`                New heap object
  `intern()`                 Returns SCP reference
