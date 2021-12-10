ackage com.hcl.modifiers;

/*
 * this example defines outside of class can't access private keyword
 */

class Sample{
    private int a=10;   // initialize variable
    private Sample(){   //creating constructor
         System.out.println("i am constructore");
       }
    private void m1(){  //creating  private method
          
           System.out.println("i am method");   
       }
}

class PrivateKeyword {
	
	public static void main(String args[]){
		
        Sample s=new Sample();  //creating constructor to provide compile time error
        
        System.out.println(s.a); //calling variable a compile time error
        
        s.m1();  // calling method it gives compile time error              
      
    }
}

}
