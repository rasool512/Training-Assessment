ackage com.hcl.customizedexception;
/*
 * this class defines how to create over own customized exception
 * 
 */

class Young extends RuntimeException{
	 Young(String s){
		 super(s);
	 }
}
class Old extends RuntimeException{
	Old(String s){
		super(s);
	}
}

class CustomException {
public static void man(String args[]) {
	   int age=Integer.parseInt(args[0]);
	   if(age>60) {
		   throw new Young("very old age");
		   
	   }
	   if(18<age) {
		   throw new Young("very young age");
		   
	   }
	   else {
		   System.out.println("he is chaild age");
	   }
}
}