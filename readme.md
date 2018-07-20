* Builder   

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
                                                      
   ---------------------------------------------------------------------------------------                                                   
* Singleton                                                       