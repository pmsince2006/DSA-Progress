// Access Modifiers :
// Public : Can be accessed in same class, same package, subclass(diffrent package), everywhere
// Private : Can be accessed in same class, NOT in same package(non - subclass), NOT in subclasses , NOT everywhere
// Protected : Same as public but not everywhere
// Default : only in same class and same package(non - subclass) , not available in subclass of diffrent package

// Order -> Private > Default > Protected > Public
// Top classes can only be public or default


//Built in Packages in Java
// 1. java.lang : Core language features, fundamental types , is automatically imported
// ex: String, Object, System, Math, Integer, Thread Exception
// 2. java .util : Collection Framework, date/time , utility , not automatically imported
// ex: Arraylist, Hashmap, Hashset, Collections , Scanner
// 3. java.io : Input/Output - files, streams , Serialization 
// ex: File, Filereader , Filewriter
// 4. java.time : Modern date-time 
// ex: LocalDate, LocalTime
// 5. java.sql : Database Connectivity (JDBC)
// ex: Connection, Statement 


// Object Class in java
// java.lang.Object is the root class of the entire Java class hierarchy.
// Every class (even arrays) directly or indirectly extends Object.
// All classes inherit its 11 methods (some are very commonly overridden).

// Hashcode means unique representation of a object via number
// .equals() method checks the content of the variables to compare 
// == method checks if the variables are pointing to the same memory reference


// public class J4_AccessControl_InBuiltPackages_ObjectClass {
    
// }
