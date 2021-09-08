# Packages & Access
Java has a very large ecosystem around it. The JRE comes with numerous libraries that help us do all sorts of things. Beyond that there are uncountable libraries and frameworks we can use that are not included with the JRE. In order to keep these organized and to avoid problems, we use the concept of **packages**. Even our own projects can get so large and complex that we use packages to organize them. A Java package is a group of similar types of classes, interfaces, and sub-packages. The directory structure within our own Java projects are also packages.  
  
The primary benefits of Java's packages are:
 - Categorization
 - Access protection
 - Avoid naming collisions
  
## Importing Packages
We `import` packages into our java files in order to use the classes and methods defined in those packages. 
```
//MyClass.java
package myclass;
public class MyClass {
    public static void printText(String str) {
        System.out.println(str);
    }
}

//MyOtherClass.java
import myclass;
public class MyOtherClass {
    public void invokeOtherMethod() {
        MyClass.printText("This is a sentence!");
    }
}
```
  
## Access modifiers 

| **Modifier** | **Class** | **Package** | **Sub-class** | **Global** |
| ------------ | --------- | ----------- | ------------- | ---------- |
| `public` | Y | Y | Y | Y |
| `protected` | Y | Y | Y | N |
| ***default*** | Y | Y | N | N |
| private | Y | N | N | N |

  
  
