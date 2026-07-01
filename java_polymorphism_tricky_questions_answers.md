# Java Polymorphism - Tricky Interview Questions and Answers

## 1. Method Overriding vs Reference Type

``` java
class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barks");
    }
}

Animal a = new Dog();
a.sound();
```

**Output**

``` text
Dog Barks
```

**Explanation:** Runtime polymorphism uses the actual object type.

------------------------------------------------------------------------

## 2. Variable Hiding

``` java
class Animal {
    String name = "Animal";
}

class Dog extends Animal {
    String name = "Dog";
}

Animal a = new Dog();
System.out.println(a.name);
```

**Output**

``` text
Animal
```

**Explanation:** Variables are resolved using reference type.

------------------------------------------------------------------------

## 3. Static Methods are not Polymorphic

``` java
class Parent {
    static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child");
    }
}

Parent p = new Child();
p.show();
```

**Output**

``` text
Parent
```

------------------------------------------------------------------------

## 4. Private Methods

``` java
class Parent {
    private void display() {
        System.out.println("Parent");
    }

    public void call() {
        display();
    }
}

class Child extends Parent {
    private void display() {
        System.out.println("Child");
    }
}

Parent p = new Child();
p.call();
```

**Output**

``` text
Parent
```

------------------------------------------------------------------------

## 5. Constructor Polymorphism

``` java
class Parent {
    Parent() {
        show();
    }

    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    int x = 10;

    void show() {
        System.out.println(x);
    }
}

new Child();
```

**Output**

``` text
0
```

------------------------------------------------------------------------

## 6. Overloading Resolution

``` java
void show(int x) { System.out.println("int"); }
void show(long x) { System.out.println("long"); }

show(10);
```

**Output**

``` text
int
```

------------------------------------------------------------------------

## 7. Widening vs Boxing

``` java
void show(long x) { System.out.println("long"); }
void show(Integer x) { System.out.println("Integer"); }

show(10);
```

**Output**

``` text
long
```

Priority: 1. Exact Match 2. Widening 3. Boxing 4. Varargs

------------------------------------------------------------------------

## 8. Boxing vs Varargs

``` java
void show(Integer x) { System.out.println("Integer"); }
void show(int... x) { System.out.println("Varargs"); }

show(10);
```

**Output**

``` text
Integer
```

------------------------------------------------------------------------

## 9. Overloading with Null

``` java
void show(String s) { System.out.println("String"); }
void show(Object o) { System.out.println("Object"); }

show(null);
```

**Output**

``` text
String
```

------------------------------------------------------------------------

## 10. Ambiguous Null

``` java
void show(String s) { }
void show(Integer i) { }

show(null);
```

**Result:** Compilation Error - Ambiguous method call.

------------------------------------------------------------------------

## 11. Covariant Return Type

Java supports covariant return types where overridden methods can return
subclass types.

------------------------------------------------------------------------

## 12. Interface Reference

``` java
interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car Started");
    }
}

Vehicle v = new Car();
v.start();
```

**Output**

``` text
Car Started
```

------------------------------------------------------------------------

## 13. Valid Downcasting

``` java
Animal a = new Dog();
Dog d = (Dog) a;
```

------------------------------------------------------------------------

## 14. Invalid Downcasting

``` java
Animal a = new Animal();
Dog d = (Dog) a;
```

**Result**

``` text
ClassCastException
```

------------------------------------------------------------------------

## 15. Safe Downcasting with instanceof

``` java
if(a instanceof Dog){
    Dog d = (Dog)a;
}
```

------------------------------------------------------------------------

## 16. Dynamic Method Dispatch

``` java
A obj = new C();
obj.show();
```

**Output**

``` text
C
```

------------------------------------------------------------------------

## 17. Final Methods

Final methods cannot be overridden.

------------------------------------------------------------------------

## 18. Can Constructors be Overridden?

No. Constructors do not participate in polymorphism.

------------------------------------------------------------------------

## 19. Can Static Methods be Overridden?

No. Static methods are hidden, not overridden.

------------------------------------------------------------------------

## 20. Interview Favorite

``` java
class A {
    void show() {}
}

class B extends A {
    static void show() {}
}
```

**Result:** Compilation Error - Cannot hide instance method with static
method.

------------------------------------------------------------------------

## Summary

  Feature            Polymorphic
  ------------------ -------------
  Instance Method    Yes
  Static Method      No
  Variable           No
  Constructor        No
  Private Method     No
  Final Method       No
  Abstract Method    Yes
  Interface Method   Yes
