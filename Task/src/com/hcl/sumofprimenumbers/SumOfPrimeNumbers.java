package com.hcl.sumofprimenumbers;

import java.util.Scanner;
//import the scanner class library

class SumOfPrimeNumbers{

     public static void main(String args[]){
        /* The below code will be print the sum of 10 numbers
             .................................  */

           Scanner sc=new Scanner(System.in); 
        // scanner class used to read the input

          System.out.println("please enter number:");
              int n=sc.nextInt();
         //read the int value

    int count=0;   // initialize the constant value and print out put

     for(int j=2;j<=n;j++){

        // repeatedly excuate a block of statement

                 int sum=0;     //declare constant value 

                   for(int i=2;i<=j-1;i++){

                              if(j%i==0){

                                 // if check the condition it is  true increment the sum value

                                     sum=sum+1;

                                 } //end if statement

                        }//end of inner for loop

                   if(sum==0){

                      //if sum is 0 it can print value

                         count=count+j;
                    //using count variable to store sum of numbers
           
                    } //end of if statement
                   //end for loop
             }
        System.out.println("sum of prime:"+count);  // it can print the out put on console           
     } //end of main method
} //end of class