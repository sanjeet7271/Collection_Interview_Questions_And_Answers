# Advanced Java Polymorphism Interview Questions and Answers

## 1. Can static methods participate in runtime polymorphism?

**Answer:** No. Static methods are resolved at compile time and are
hidden, not overridden.

## 2. Can private methods be overridden?

**Answer:** No. Private methods are not inherited and therefore cannot
be overridden.

## 3. What is dynamic method dispatch?

**Answer:** The JVM determines which overridden method to invoke at
runtime based on the actual object type.

## 4. What is compile-time polymorphism?

**Answer:** Method overloading resolved by the compiler.

## 5. What is runtime polymorphism?

**Answer:** Method overriding resolved by the JVM at runtime.

## 6. Can constructors be overridden?

**Answer:** No. Constructors are not inherited.

## 7. What is covariant return type?

``` java
class Parent {}
class Child extends Parent {}

class A {
    Parent get() { return new Parent(); }
}

class B extends A {
    Child get() { return new Child(); }
}
```

## 8. Can we override a method and throw a broader checked exception?

**Answer:** No. Overridden methods cannot throw broader checked
exceptions.

## 9. Can return type alone differentiate overloaded methods?

**Answer:** No.

## 10. What is method hiding?

**Answer:** Static methods with same signature in subclass hide parent
methods.

## 11. What is variable hiding?

**Answer:** Member variables are resolved using reference type.

## 12. Difference between overriding and overloading.

  Feature       Overriding          Overloading
  ------------- ------------------- --------------
  Resolution    Runtime             Compile Time
  Parameters    Same                Different
  Return Type   Covariant allowed   Can differ

## 13. Bridge Methods

**Answer:** Compiler-generated methods used to support polymorphism with
generics after type erasure.

## 14. Type Erasure Example

``` java
class Box<T> {
    T get() { return null; }
}
```

## 15. Why are bridge methods generated?

**Answer:** To preserve polymorphism after generic type information is
removed.

## 16. What JVM instruction is used for virtual methods?

**Answer:** `invokevirtual`

## 17. JVM instruction for static methods?

**Answer:** `invokestatic`

## 18. JVM instruction for interface methods?

**Answer:** `invokeinterface`

## 19. JVM instruction for constructors?

**Answer:** `invokespecial`

## 20. Can final methods be polymorphic?

**Answer:** No. Final methods cannot be overridden.

## 21. Can abstract methods be polymorphic?

**Answer:** Yes.

## 22. Can interface default methods be overridden?

**Answer:** Yes.

## 23. Multiple default method conflict example

``` java
interface A { default void show(){ System.out.println("A"); } }
interface B { default void show(){ System.out.println("B"); } }

class C implements A, B {
    public void show() {
        A.super.show();
    }
}
```

## 24. What is upcasting?

``` java
Animal a = new Dog();
```

## 25. What is downcasting?

``` java
Dog d = (Dog)a;
```

## 26. What causes ClassCastException?

``` java
Animal a = new Animal();
Dog d = (Dog)a;
```

## 27. Why use instanceof before downcasting?

**Answer:** To avoid runtime ClassCastException.

## 28. Can overloaded methods be inherited?

**Answer:** Yes.

## 29. Can static interface methods be overridden?

**Answer:** No.

## 30. Are lambda expressions polymorphic?

**Answer:** Yes, through functional interfaces.

## 31. Example of lambda polymorphism

``` java
Runnable r = () -> System.out.println("Running");
```

## 32. Can generics participate in polymorphism?

**Answer:** Yes, but generic types are invariant.

## 33. Is List`<Object>`{=html} parent of List`<String>`{=html}?

**Answer:** No.

## 34. What is bounded wildcard polymorphism?

``` java
List<? extends Number>
```

## 35. What is PECS principle?

**Answer:** Producer Extends, Consumer Super.

## 36. Can enums override methods?

**Answer:** Yes.

## 37. Can anonymous classes override methods?

**Answer:** Yes.

## 38. Difference between dynamic binding and static binding.

-   Dynamic binding -\> overridden methods
-   Static binding -\> static, private, final methods

## 39. Which methods use early binding?

-   Static
-   Private
-   Final

## 40. Which methods use late binding?

-   Overridden instance methods

## 41. Can synchronized methods be overridden?

**Answer:** Yes.

## 42. Can native methods be overridden?

**Answer:** Yes, unless declared final.

## 43. Can protected methods become public in overriding?

**Answer:** Yes, visibility can be widened.

## 44. Can public methods become protected in overriding?

**Answer:** No.

## 45. Interview Favorite

``` java
class A {
    void show(Object o){ System.out.println("Object"); }
    void show(String s){ System.out.println("String"); }
}

A a = new A();
a.show(null);
```

Output:

``` text
String
```

## 46. Dynamic dispatch bytecode uses:

-   invokevirtual
-   invokeinterface

## 47. Static dispatch bytecode uses:

-   invokestatic
-   invokespecial

## 48. Why does JVM use virtual method tables (vtable)?

**Answer:** To efficiently resolve overridden methods at runtime.

## 49. What is a vtable?

**Answer:** A table maintained by JVM containing references to virtual
methods.

## 50. Why is polymorphism important?

-   Extensibility
-   Loose coupling
-   Open/Closed Principle
-   Design patterns support
