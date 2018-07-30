* **Builder**   

    - Builders are often used together with fluent APIs or small, domain specific languages (DSLs) 
    to create immutable objects without “telescoping” constructors (a telescoping constructor occurs when the 
    increase of object constructor parameter combination leads to an exponential list of overloaded constructors). 

    - Builders eliminates a need in a long constructor, Which is helpful when there are a lot 
    of different optional values.
    
     - It is the use of constructor as opposed to setters that eliminates the danger of partially initialized instances. 
    Builders simply help you to hide a constructor with too many parameters.
    
    - If we have multiple consecutive arguments of the same type, it's easy to accidentally swap them around:
        ==> the compiler does not pick it up as an error.
        
    - Getters and setters with void constructor is not a good solution : What happens if a developer forgets to call a 
    particular setter method? 
    
    - We could end up with an object that is only partially initialized, and again, the compiler wouldn't see any problems with it.
     
     - Thus, there are two specific problems that we need to solve:
     
        * Too many constructor arguments.
        * Incorrect object state.    
        
        ==> the **Builder pattern** comes into play
        
        - The Builder pattern allows us to write readable, understandable code to set up complex objects. 
        - It is often implemented with a fluent interface*(Like in Apache Camel or Hamcrest)
        - We will configure all of the fields that we want on the builder, and then we'll use the builder to create accounts. 
        - At the same time, we'll remove the public constructor from the BankAccount class and replace 
        it with a **private constructor** so that accounts can only be created via the builder.
        
        
            Fluent interface : 
            is a method for designing object oriented APIs based extensively on method chaining with the goal of making the 
            readability of the source code close to that of ordinary written prose.
            Example :     
            mock.expects(once()).method("m").with( or(stringContains("hello"),
                                                      stringContains("howdy")) );
                                                      
  Questions about Builder Pattern : 
  
  - Q1: Why nested?
  
  - It’s not a requirement to have Builder class as a nested class. 
  Just for simplicity of coding, I have create it as nested class. 
  If you have a lot of POJO and their builder classes, then it’s best strategy to have a package itself for builder classes. 
  For example com.mytutos.pojo for POJOs and com.mytutos.builders for Builder classes. 
  However note that in this case, **POJO classes constructor can’t be private** and can be 
  instantiate directly.       
  
  
  - Q2: What are the drawbacks of Builder pattern
  
  - Code redundancy and no reusability : If you change the POJO you'll need to change the Builder.                              
                                                      
   -----------------*********************************----------------------------------------------------------------------   
                                                   
* **Singleton**

    * Real life cases:
        - Hibernate Session Factory(Expensive instance containing pooling, caching, dialects..you don't want many instances)
        - Logging
        - Caching
        - Using Spring Beans scope by default is singleton.
    
    * Steps    :

    - 1 - Override the **private constructor** to avoid any new object creation with new operator.
    - 2 - Declare a **private static instance of the same class**
    - 3 - Provide a **public static method** that will return the singleton class instance variable. 
    If the variable is not initialized then initialize it or else simply return the instance variable.

    - In the ClassSingleton example, In the above code, getInstance() method is not thread safe. 
     Multiple threads can access it at the same time and for the first few threads when the instance variable is not initialized, 
     multiple threads can enters the if loop and create multiple instances and break our singleton implementation.        
     ==> **can be problematic in a multithreading**  
     
    - This approach has **serialization and thread-safety guaranteed by the enum implementation itself**, which ensures 
    internally that only the single instance is available, correcting the problems pointed out on the class-based implementation.    
    
            - There are three ways through which we can achieve thread safety:
            
            1 - Create the instance variable at the time of class loading.
            
                Pros:
            
                 Thread safety without synchronization
                 Easy to implement
            
                Cons:
            
                Early creation of resource that might not be used in the application.
                The client application can’t pass any argument, so we can’t reuse it. For example, having a generic singleton 
                class for database connection where client application supplies database server properties.
                
                
            2 - Synchronize the getInstance() method
                
                Pros:
                
                    Thread safety is guaranteed.
                    Client application can pass parameters
                    Lazy initialization achieved
                
                Cons:
                
                    Slow performance because of locking overhead.
                    Unnecessary synchronization that is not required once the instance variable is initialized.
                    
            3 -  Use synchronized block inside the if loop and volatile variable (BEST)
             
              Pros:
              
                Thread safety is guaranteed
                Client application can pass arguments
                Lazy initialization achieved
                Synchronization overhead is minimal and applicable only for first few threads when the variable is null.
              
              Cons:
              
                Extra if condition

------------------------------------------------------***************___________________________----------------------------------------

* **Factory**
    - Factory design pattern is used when we have a super class with multiple sub-classes and based on input, 
    we need to return one of the sub-class. This pattern take out the responsibility of instantiation of a class from 
    client program to the factory class.
    
    - See diagram one (before Factory) : This is bad because your classes are closely coupled : 
    If you want to add another argument to PC, you client class will have to change
    - There is no abstraction : Client is aware of all instances of Server/PC
    - Client has to do a lot of work to instantiate eveything
    ==> Solution : Factory
    
    - Benefits of Factory:
        - Abstraction
        - Loose coupling
        - Easy to extend

        - JDK Examples: Calendar : createCalendar
                
                
   - According to the Gang of Four book that defined the technique, the intent of the Factory Method pattern is as follows:
     
    - Define an interface for creating an object, but let subclasses decide which class to instantiate. 
    Factory Method lets a class defer instantiation to subclasses.

   - a Factory Method involves more than just a single method. Instead, it involves creating two sets of interfaces: 
   (1) the product interface that constitutes the object to be created and 
   (2) the creator interface that constitutes the object that will instantiate the product. 
   
   - Using the general pattern, we build a **Creator interface**, which includes one or more Factory Methods, 
   as well as any number of other methods. This interface may also be an abstract class with defined methods 
   or even a default implementation of the Factory Method that returns a default instance of Product . 
   From this interface, a set of ConcreteCreator classes are created that return desired 
   ConcreteProduct instances that implement the Product interface.     
   
   - Factory example https://dzone.com/articles/java-the-factory-pattern
   
   - we will create an encryption mechanism that allows for the user to supply a string of text and a file name, 
   which is then encrypted and written to disk. Since there are various encryption algorithms that may be desired 
   in a variety of scenarios, we will use the Factory 
   Method pattern to allow for multiple encryption implementations to be created