package com.hcl.modifiers;

import com.hcl.modifiers.*;

/*
 * 
 * import the class ProtectedKeyword into OutsideClass
 * 
 * 
 */

class OutsideClass extends ProtectedKeyword {
	
	public static void main(String args[]){  
        ProtectedKeyword obj = new ProtectedKeyword(); // creating object in  class PeotectedKeyword
        
        obj.msg();  // calling method out side of the class  ProtectedKeyword

}
	
	
}