package com.hcl.interface1;

interface printable{  
void print();  
}  
class Test2 implements printable{  
public void print(){System.out.println("Hello");}  
  
public static void main(String args[]){  
Test2 obj = new Test2();  
obj.print();  
 }  
}  