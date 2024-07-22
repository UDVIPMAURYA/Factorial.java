Factorial Function:
-----------------------
Calculates the factorial of a given integer.

Usage:
-----------------
Call the function with a positive integer as an argument, like this: factorial(5).

Example:
-------------------
factorial(5) returns 120.

Code:
--------------------
```
 public class Factorial{
	void fact(double a){
		double n=a;
		double fact=1;
		for(double i =1;i<=n;i++){
			fact=fact*i;	
		}
	  System.out.print("Factorial of "+n+" "+"is"+fact); 
	}
}
class main{
	public static void main(String []arg){
		Factorial ref_factorial=new Factorial();
		ref_factorial.fact(9.4);
	}
}
```


Author:
--------------
UDVIP MAURYA

Description:
---------------
This function takes an integer n as input and returns its factorial, denoted as n!. The factorial is the product of all positive integers less than or equal to n.
