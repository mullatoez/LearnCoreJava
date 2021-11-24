<--!     Learn Core Java   -->
1. Variables
    Data types
        1. Byte (byte) - ranges from -128 to 127
            it is 8 bits
            primitive data type - meaning it comes packaged with java
            no special tasks are needed to use it. You can use it to save memory when you are
            the output will be between the -128 to 127 range
            declared this way
                byte a = 100;
        2. Short (short) - ranges from -32768 to 32767
            it is 16 bits
            two times smaller than integer
            declared this way
                short a = 10000;

        3. Integer (int) - ranges from -2,147,483648 to 2,147,483,647
            preferred data type that is used when dealing with numeric values
            it is 32 bits
            declared this way
                long a = 200000000;

2. Classes & Objects
        Class - A class is a user defined blueprint or prototype from which objects are created.
            e.g
            public Class Animal(){
            String name = "Cat";
            }
            A class can contain:
            - Fields
            - Methods - a method is like a function which is used to expose the behavior of an object.
                    There are two types of methods
                        1. Pre-defined methods - methods already defined in Java class libraries e.g length(),compareTo(),sqrt()
                        2. User-defined methods - methods written by a programmer

                        Abstract methods - methods without implementation,created in an abstract class using abstract keyword
                    -- Method declaration --
                    It has access modifier e.g public/private
                    Return type e.g int,String, void,list
                    Name of the method
                    parameter list
                    method body/signature
            - Constructors
            - Blocks
            - Nested class and interface

        Object - Is an instance of class. It has states, behaviours & identity.
            e.g
            Animal animal = new Animal();
            animal.name;
            System.out.println(animal.name);
            // Cat
            -- state --
            represents the data of the object
            -- behaviour --
            represents the responsibility/functionality of an object such as withdraw/deposit


3. OOP Concepts
        1. Abstraction -
        Abstraction helps in displaying only the information needed and hides the unnecessary
        information. We can say that the main purpose of abstraction is data hiding. Abstraction means selecting
        data from a large number of data to show the information needed, which helps in reducing programming
        complexity and efforts.
        2. Inheritance -
        Inheritance is a method in which one object acquires/inherits another object’s properties.
        3. Polymorphism -
        It is an ability of object to behave in multiple form. The most common use of polymorphism is Java, when a
        parent class reference type of variable is used to refer to a child class object.
        4. Encapsulation -
        We can hide direct access to data by using
        private key and we can access private data by using getter and
        setter method.
4. String methods e.g isBlank
5. Java Collections i.e lists,sets, maps
6. Java Naming conventions
        - Is the rule to follow when naming your identifiers such as class,variables,constant,package,methods.
        -- Class, Interfaces --
        Should start with uppercase
        Should be a noun
        Should use appropriate words not acronyms
        e.g
        class Employee(){

        }
        -- Methods --
        Should start with lowercase letter
        Should be a verb like draw(),print(),println()
        If the name contains multiple words, start it with a lowercase letter followed by an uppercase letter
        such as actionPerformed().
        -- Variables --
        Should start with lowercase
        Don't use special characters like &(ampersand),$(dollar),_(underscore)
        -- package --
        Should start with lowercase
        -- constants --
        It should be in uppercase letters such as RED, YELLOW.
        If the name contains multiple words, it should be separated by an underscore(_) such as MAX_PRIORITY.
7. Constructor
        is a block of codes similar to the method. It is called when an instance of the class
        is created. At the time of calling constructor, memory for the object is allocated in the memory.
        Every time an object is created using the new() keyword, at least one constructor is called.
                -- Rules for creating a constructor --
                1. Its name must be same as its class name
                2. Must not have explicit return type
                3. Cannot be abstract,static,final or synchronized
                -- Types of java Constructors --
                1. Default Constructor (No-arg constructor)
                    Q. What is the purpose of default constructor?
                    A. Used to provide default values to the object like 0, null depending on the type.
                2. Parameterized Constructor

        Difference between constructor and method in Java
        1. Constructor is used initialise the state of an object. -> 1.Method exposes the behaviour of an object
        2. A constructor must not have a return type. -> 2. A method must have a return type

8. Static keyword
        Helps us efficiently manage memory
        Generally, if you want to access variables or methods inside a class, you first need to create an
        instance or object of that class. With static that is not the case

9. ABSTRACT CLASSES & METHODS
        Abstract class -> is a class that is declared abstract. It may or may not contain abstract methods.
        e.g
        Sometimes we may come across a situation where we cannot provide
        implementation to all the methods in a class. We want to leave the
        implementation to a class that extends it. In such case we declare a class
        as abstract.To make a class abstract we use key word abstract.
        Any class that contains one or more abstract methods is declared as abstract.
        If we don’t declare class as abstract which contains abstract methods we get
        compile time error.

        1)Abstract classes cannot be instantiated i.e ClassOne one = new ClassOne(); XXX
        2)An abstract classes contains abstract method, concrete methods or both.
        3)Any class which extends abstract class must override all methods of abstract class i.e provide implementations
        4)An abstract class can contain either 0 or more abstract method.