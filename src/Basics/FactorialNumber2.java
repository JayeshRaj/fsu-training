package Basics;

public class FactorialNumber2 {
	 public static void main(String args []){  
		  
		  int number=5;//It is the number to calculate factorial    
		 int  fact = factorial(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
	
		 static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n +factorial(n-1));    
		 }    
		
		}  

//recursion based program is always short and smart :) 
