package Exercise2;

public class Factorial {
	public static long fact(int n) {
		if(n==1) {
			return 1;
		}
		else return n*fact(n-1);
	}
public static void main(String[] args) {
	System.out.println("Long factorials: ");
	for(int i=1;i<=20;i++) {
		System.out.println("The factorial of "+i+" is "+fact(i));	
	}
	System.out.println("The factorial of 21 is out of range");
}
}
