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
  
Likewise we can classify methods as static as well. Static methods can be invoked on a class itself, and do not have access to non-static fields and methods. Consider a class with a non-static field, y. If you never instantiate an object from the class, y never exists. If you can invoke a static method without ever instantiating an object, and that method tries to access the field y, it would throw an error.


## Inheritance
In Java, a class inherits data and behavior from a parent class using the `extends` keyword. A class can only extend one other class. Java is a language that only supports "single-inheritance". In fact every class (except one) in Java inherits from exactly one parent class. If a class is not specified with `extends` then it implicitly extends the `Object` class. The only class which does not have a parent is the `Object` class itself. **`Object` is the class from which all other Java classes are derived.**
  
Java is single-inheritance, but does have a way to inherit behavior from multiple sources: **interfaces**. Interfaces are a special type of class which can not be instantiated into an object.
