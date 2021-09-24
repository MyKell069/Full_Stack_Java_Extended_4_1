# SOLID
The SOLID principles are guiding principles for how to seperate concerns and functionality in object oriented design. These principles exist to guide us, but must be taken into consideration on a case-by-case basis where we utilize our best judgement. 


## **S**ingle-responsibility principle
"A class should have one and only one reason to change, meaning that a class should have only one job."
  
This principle discusses how you know when to separate classes. If your class has more than one reason to change, perhaps it should be more than one class. Consider a class that handles a database connection and CRUD functionality, like a DAO. If your DAO is also responsible for outputting data to a console, this class is doing too much. The class which handles a connection to a database and manipulating data from there should not also be in charge of transmitting that data to a coneole, or printer. You would have an output class, and a printing class. 
  
## **O**pen-Close Principle 
"Objects or entities should be open for extension but closed for modification."
  
If we want to modify the behavior of a class, instead of modifying it directly we should write our own class which inherits from it and make our modifications to that class. We want to write our own classes to be ready for extension, but block modification.
  
## **L**iskov Substitution Principle
"Let q(x) be a property provable about objects of x of type T. Then q(y) should be provable for objects y of type S where S is a subtype of T." 
  
This somewhat obtuse description basically means that if you inherit from a parent class you should be able to substitute the sub-class for the super-class. This is what we see in the following example of subtype-polymorphism:
```java
  List<Integer> myList = new ArrayList<>();
```
Here we see an ArrayList being created and stored in a reference to a List. ArrayList inherits from List, and we can substitute ArrayList for List.
  
## Interface Segregation Principle
"A client should never be forced to implement an interface that it doesn’t use, or clients shouldn’t be forced to depend on methods they do not use."
  
This is analogous to the Single-responsibility principle but applies to multiple inheritence, like java interfaces. If people implementing your interface wouldn't be interested in implementing all of the methods, then those methods bay need to be separated into a different interface. In this way we can choose those interfaces we do want to implement.

## **D**ependency Inversion Principle

"Entities must depend on abstractions, not on concretions. It states that the high-level module must not depend on the low-level module, but they should depend on abstractions."

