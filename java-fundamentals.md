# Java Fundamentals
  
## Classes & Objects
A class is the logical bundling of data and behaviors (fields and methods) into a single logical unit. Often, however, we will deal with objects instead of classes. Objects and classes are tightly related concepts, but we should understand the difference. **Objects are instances of classes.** Classes are a sort of blueprint for objects. We often take a class and "**instantiate**" an objcet from it. This just means we create an object using the class as a blueprint. Sometimes a class can exist on its own, not as an object instance. This is where the `static` keyword comes in. 

## Static Keyword
`Static` denotes a method, or field to be part of the class itself, rather than part of an object instantiated from the class. This means that all objects of that class share a single method or field. Consider the class below:
  
```
public class Example {
    public static int x = 5;
}
```
  
That ststic int x will be shared among all instances of this class. If we create two different objects from the class and print the value of x for each, they will both be 5. If we change one to 10 and then print them both again, both will show 10. There is only one version of x, which is kept in memory with the class itself.
  
Likewise we can classify methods as static as well. Static methods can be invoked on a class itself, and do not have access to non-static fields and methods. Consider a class with a non-static field, y. If you never instantiate an object from the class, y never exists. If you can invoke a static method without ever instantiating an object, and that method tries to access the field y, it would throw an error. Static methods can be invoked on a class object as well, and can be invoked on sub-classes as though inherited. 
  
Lastly, we can modify some classes to be static as well. We can't make a top-most class static (every .java file must contain one top-most class which the file is named after) but we can "nest" a class inside another. These nested classes can be made static. Static nested classes can only access static members of the outer class. Nested classes can access even private members of the outer class.


## Inheritance
In Java, a class inherits data and behavior from a parent class using the `extends` keyword. A class can only extend one other class. Java is a language that only supports "single-inheritance". In fact every class (except one) in Java inherits from exactly one parent class. If a class is not specified with `extends` then it implicitly extends the `Object` class. The only class which does not have a parent is the `Object` class itself. **`Object` is the class from which all other Java classes are derived.**
  
Java is single-inheritance, but does have a way to inherit behavior from multiple sources: **interfaces**. Interfaces are a special type of class which can not be instantiated into an object. Interfaces generally lack any implementation details, instead interfaces generally only provide method **signatures**. We will cover interfaces in greater details in week 3.
  
## Overriding & Overloading
Some of the most common examples to demonstrate the concept of polymorphism are overloading and overriding.
  
### Overriding
Method overriding is the practice of modifying a method that a child class inherits from a parent. This is done by implementing the method with the exact same signature in the child class. 

```
//Animal.java
public class Animal {
    public void makeSound() {
        System.out.println("Aaaahhhhhh!");
    }
}

//Dog.java
public class Dog {
    public void makeSound() {
        System.out.println("Woof!");
    }
}
```
Note that both Dog and Animal have a method with the same signature: `public void makeSound();`. A method signature is the method name, parameter list, return type, and modifiers but without any implementation details. Dog extends Animal (it inherits from) and the Dog implementation includes a method which replaces or **overrides** the one inherited from Animal.  
  
### Overloading
Method overloading is the practice of implementing methods with the same name, but with different parameter lists. This allows us to provide multiple similar implementations that are invoked depending on different parameters. Consider a sum method that adds numbers together, but one version has ints as parameters, and one has longs (extra large integers).
  
```
public int sum(int a, int b) {
    return a + b;
}


public long sum(long a, long b) {
    return a + b;
}

```
Note that the return type changes between these two methods, however that alone is not enough for the compiler to be able to choose one. In order to overload a method we must change the parameter list. 
