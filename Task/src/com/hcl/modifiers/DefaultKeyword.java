package com.hcl.modifiers;

class DefaultKeyword {
	
	public void m1(){  //creating method
        
    }
	

}

creating anothe class B

package mypack;  //creating package name mypack
  import com.hcl.modifiers.*;  //import the out side of the package pack 
     class B{
         public static void main(String args[]){
               A a=new A();  //compile time error
               a.m1();  //compile time error
          }
      }
