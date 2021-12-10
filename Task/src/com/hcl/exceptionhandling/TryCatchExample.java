package com.hcl.exceptionhandling;

/*
 * 
 * this example how to throw exception in try block
 * and musing catch block to catch exception
 * 
 */

class TryCatchExample {
	
	public static void main(String[] args) {  
        try  
        {  
        int data=50/0; // throw exception   
        }  
           
        //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
      
}  
