// package is a folder (container for the classes)


// no need to import other class into the file if it exists in the same package


// static variable - when a member is declared static it can be accessed before creating the object of the class, without even refrencing to the object
// to modify/access/declare - always do using the class name and not the this keyword
// main method is declared static because it can run without creating an object



// public class J2_Static_BuiltInMethods { 
//     public static void main(String[] args) {
//         greeting(); // will not run because the function is non static and is called in a static method
        
//     }
//     void greeting(){
//         fun(); // you can have a static in non static method because it does not limits itself
//         System.out.println("Help world");
//     }
//     static void fun(){
//         greeting(); // will not run because it requires an instance and function it is being called does not depend on instances
//     }
// }
// static method can only access static data, non static belongs to an object
// this keyword cannot be used in the static method because it requires refrence to objects

// Inner classes:
// only inner classes can be static, not the outside classes


// system is a class 
// out is a variable (public static final PrintStream )
// println is a method (method os printstream)


// Singleton class
// only one object allowed, constructor usage prohibited
