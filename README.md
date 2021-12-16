# Training-Assessment
##  Acess specifiers:

1.public 

2.private

3.default

4.protected

1.public: 

* it is keyword it can use to access any whare like with in the class and out side of the class

* inside of the package and out side of the package will be use

* it can use class,methods,variables,constructor

2.private: 

* it can access with in the class only

* outside of the class and out side of the package it can't be access

3.defualt : 

* if u don't use any modifier in variables,class by default it take

* it is keyword it can acess with in class and with in same package

* outside of the package it can't access

4.protected : 

* it can access with in the package and out side of the packge child class only it can acess(inheritance)

* it can applicable only data members,methods,constructor and it not aplicable class level

## primative data types :
1.short 

2.byte 

3.int

4.long 

5.float

6.double

7.char

8.boolean

## Static Modifire :

* staic modifre applicable in variables and methods but not for class but we can declare inner class to class level

* instance variable for avery object separate copy wil be created but in the case static variblr are created single 
 copy will be created class level to share by every object of that class
 
* it can't access instance members to static area but it can access instance area directly

* but we can acess static members both static  and non static areas

## static method : 

* If you apply static keyword with any method, it is known as static method.

* static method belongs to the class rather than the object of a class.

* static method can be invoked without the need for creating an instance of a class.

* static method can access static data member and can change the value of it.

## Variable Types : 

1.Instance variables

2.private variables

3.local variables

### Instance variable : 

* if a value of variable varied from object to object such type of varible is called instance variable 

* instance variable declare with in class directly and out sid eif the methos and block,constuctore *instace varible will stored in heap memory area.

### Private variables : 

* it can access with in the class only 

* outside of the class and out side of the package it can't be access

### Local Variables : 

* inside a method are block ,constructore we can declared a varibles is called local varibles

* Local variables are stored in inside statck memory

* local variable wiil be created while excuating the block in wich we declared it,Once block excuation complete automaticallylovcal varible

## Exception: 

* In an event that occurs during the execution of a program that disrupts the normal flow of instructions is called an exception 

* This is generally an unexpected or unwanted event which can occur either at compile-time or run-time in application code.

## Exception Handling: 

### Try block : 

* try block is used to enclose the code that might throw an exception. It must be used within the method 

* if an exception occurs at the particular statement in the try block, the rest of the block code will not execute
So it is recommended not to keep the code in try block that will not throw an exception. 

* Java try block must be followed by either catch or finally block

### Catch block: 

* catch block is used to handle the Exception by declaring the type of exception within the parameter 

* The declared exception must be the parent class exceptio or the generated exception type 

* The catch block must be used after the try block only

* You can use multiple catch block with a single try block

## Try with multiple catch blocks : 

* The way of handling an exception id varied from exception to exception.

* for avery exception type it is heighly recommanded to take suparate catch block,that is try with multiple catch blocks is always possible

## CustomException : 

* some time to meet program requirement we can define overown exceptions such type of exceptions are called customized or user defined exceptions 

* throw keyword is only used to the customized exception *to define customized exception as unchecked that is we have to extends runtime exception but not exception

## Abstract :

* abstract is keyword it is applicable only class and methods but not varibles 

* even though we don't about implementation still we we can declare a method with abstract modifier

* that is for abstraction methods only declaration available but not implementation *abstract method must be declare with semi colan 
 
* It can have abstract and non-abstract methods *It cannot be instantiated *It can have constructors and static methods also.

example:

public abstract void m1(); //correct way to define because abstarct method has no method body

public abstarct void m1(){ 
// compile time error because is implementation is responsible child class //method body }

## Interface :

* An interface in Java is a blueprint of a class. It has static constants and abstract methods 

* The interface in Java is a mechanism to achieve abstraction 

* There can be only abstract methods in the Java interface, not method body,It is used to achieve abstraction and multiple inheritance in Java 

* It is used to achieve abstraction.

* By interface, we can support the functionality of multiple inheritance.

* It can be used to achieve loose coupling.

###example: 

interface <interface_name>{

// declare constant fields  
// declare methods that abstract   
// by default.  
}


## InputStream : 

* inputStream class is super class of all the io classes,it repragents input stream of bytes

* Applications that are defining subclass of inputStream must provide method,returning the next byte of input *we using methods in inputStream
java.io.InputStream.mark(int args) //marks the current ostion of the inout stream
java.io.InputStream.read() //reads next byte if of data from the input Stream
java.io.InputStream.close() //closes the input stream and releases system resources associated with this stream to Garbage Collector
java.io.InputStream.skip(long arg) //skip and discards arg bytes in the input stream

## OutputStream : 

* java FileOutputStream is an output stream used for writing data to a file

* if you have to write primative value into a file,use FileOutStream class

* we can wrire byte-oriented data as well as character data through FileOutStream class

* but for character-oriented data,it is preferred to use FileWroter then FileOutputStream

## PropertiesFile : 

* the Properties object ciontains key and value pair both as a string,java.util.Properties class is the subclass of Hashtable 

* it can be used to get property value based on the property key 

*t he properties class provide methods to get data from the properties file and store data the properties file,it can be used to get the prperties of a system


