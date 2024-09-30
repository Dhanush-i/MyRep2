package java_basics;

public class Arithmetic_operators {
	public static void main(String []args) {
		int a = 10, b =3;
		int sum= a+b;
		int sub= a-b;
		int prod=a*b;
		int div=a/b;
		int mod=a%b;
		String calc=String.format("Addition is %d  Subtraction is %d  Multiplication is %d  Division is %d  Modulus is %d", sum, sub, prod, div, mod);
		System.out.println(calc);
		
		
	}

}
