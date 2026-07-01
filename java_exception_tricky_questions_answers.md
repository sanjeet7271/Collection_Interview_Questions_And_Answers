# Java Exception Handling - Tricky Coding Questions and Answers

## 1. Finally Block Execution

``` java
try {
    System.out.println("Try");
}
finally {
    System.out.println("Finally");
}
```

**Output**

``` text
Try
Finally
```

`finally` executes even if there is no `catch` block.

------------------------------------------------------------------------

## 2. Return in try and finally

``` java
public static int test() {
    try {
        return 10;
    } finally {
        return 20;
    }
}
```

**Output:** `20`

------------------------------------------------------------------------

## 3. Exception in try and return in finally

``` java
public static int test() {
    try {
        int x = 10 / 0;
        return 10;
    } finally {
        return 20;
    }
}
```

**Output:** `20`

------------------------------------------------------------------------

## 4. Exception in try and exception in finally

``` java
try {
    throw new RuntimeException("Try Exception");
}
finally {
    throw new RuntimeException("Finally Exception");
}
```

**Output:** `Finally Exception`

------------------------------------------------------------------------

## 5. Which catch block executes?

``` java
try {
    int x = 10 / 0;
}
catch (ArithmeticException e) {
    System.out.println("Arithmetic");
}
catch (Exception e) {
    System.out.println("Exception");
}
```

**Output:** `Arithmetic`

------------------------------------------------------------------------

## 6. Incorrect Catch Order

``` java
try {
    int x = 10 / 0;
}
catch (Exception e) {}
catch (ArithmeticException e) {}
```

**Result:** Compilation Error

------------------------------------------------------------------------

## 7. Return Value Modification in finally

``` java
public static int test() {
    int x = 10;
    try {
        return x;
    } finally {
        x = 20;
    }
}
```

**Output:** `10`

------------------------------------------------------------------------

## 8. Mutable Object in finally

``` java
List<Integer> list = new ArrayList<>();
try {
    list.add(1);
    return list;
} finally {
    list.add(2);
}
```

**Output:** `[1, 2]`

------------------------------------------------------------------------

## 9. Checked Exception without Handling

``` java
FileReader fr = new FileReader("abc.txt");
```

**Result:** Compilation Error

------------------------------------------------------------------------

## 10. Runtime Exception Handling

``` java
int x = 10 / 0;
```

**Result:** `ArithmeticException`

------------------------------------------------------------------------

## 11. Can we catch Throwable?

``` java
try {
    int x = 10 / 0;
}
catch (Throwable t) {
    System.out.println("Caught");
}
```

**Output:** `Caught`

------------------------------------------------------------------------

## 12. Can finally execute after System.exit()?

``` java
try {
    System.out.println("Try");
    System.exit(0);
}
finally {
    System.out.println("Finally");
}
```

**Output:** `Try`

------------------------------------------------------------------------

## 13. Multiple Exceptions in Multi-Catch

``` java
catch (ArithmeticException | NullPointerException e) {
    System.out.println("Handled");
}
```

**Output:** `Handled`

------------------------------------------------------------------------

## 14. Reassigning Multi-Catch Variable

``` java
catch (ArithmeticException | NullPointerException e) {
    e = new Exception();
}
```

**Result:** Compilation Error

------------------------------------------------------------------------

## 15. Exception Propagation

``` java
static void m1() {
    m2();
}

static void m2() {
    throw new RuntimeException();
}
```

RuntimeException propagates to the caller.

------------------------------------------------------------------------

## 16. Throw vs Throws

  throw                        throws
  ---------------------------- ------------------------------
  Throws an exception object   Declares possible exceptions
  Used inside method body      Used in method signature

------------------------------------------------------------------------

## 17. Can we throw null?

``` java
throw null;
```

**Output:** `NullPointerException`

------------------------------------------------------------------------

## 18. Overriding Checked Exceptions

``` java
class Parent {
    void test() throws Exception {}
}

class Child extends Parent {
    void test() throws java.io.IOException {}
}
```

**Result:** Valid

------------------------------------------------------------------------

## 19. Overriding with Broader Exception

``` java
class Parent {
    void test() throws java.io.IOException {}
}

class Child extends Parent {
    void test() throws Exception {}
}
```

**Result:** Compilation Error

------------------------------------------------------------------------

## 20. Can Constructors Throw Exceptions?

``` java
class Test {
    Test() throws Exception {
        throw new Exception();
    }
}
```

**Answer:** Yes.

------------------------------------------------------------------------

## Interview Summary

  Topic               Key Point
  ------------------- -------------------------------
  finally             Executes almost always
  return in finally   Overrides return in try
  throw null          Produces NullPointerException
  checked exception   Must be handled or declared
  runtime exception   Optional handling
  catch order         Child before parent
  System.exit()       Skips finally
