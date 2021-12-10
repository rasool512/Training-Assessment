package com.hcl.modifiers;

/*
 * this example defines how to access outside of class in public keyword
 * 
 */

class Addition{
         void add(){   //creating method
          //declare two local variables in the method
              int a=20;
              int b=30;
           System.out.println(a+b); //print out put value
         }
   }
class PublicKeyword {
	
	 public static void main(String args[]){
		 
         Addition m1=new Addition();  //creating the Addition class object
         
         m1.add(); //calling the add() method to Addition class
}


}