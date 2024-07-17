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