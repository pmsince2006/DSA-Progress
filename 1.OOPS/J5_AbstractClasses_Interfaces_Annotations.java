// Abstract Classes: A class that is not meant to be instantiated(cannot create objects directly), and is meant to be extended (inheritance)
// When to use abstract class:

// You want to provide partial implementation (shared behavior + state)
// Classes are closely related (e.g., Animal → Dog, Cat)
// You need constructors, fields, or non-public methods

// abstract class Shape {
//     protected String color;           // state

//     public Shape(String color) {      // constructor
//         this.color = color;
//     }

//     abstract double area();           // must implement

//     public void display() {           // shared concrete method
//         System.out.println("Color: " + color);
//     }
// }

// Interfaces:
// An interface defines a contract (what to do, not how). Classes implement it (can implement multiple).
// You want multiple inheritance of behavior
// Classes are unrelated but share capability (e.g., Flyable, Swimmable, Serializable)
// Focus is on contract rather than shared implementation/state

// public class J5_AbstractClasses_Interfaces_Annotations {
    
// }
