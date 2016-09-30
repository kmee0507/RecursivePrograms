import java.util.*;
public class GCDdemo {
	
	public static void main(String[] args){
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		num1 = sc.nextInt();
		
		System.out.print("Enter another integer: ");
		num2 = sc.nextInt();
		
		System.out.println("The greatest common divisor of these two numbers is " + gcd(num1,num2));
		
	}
	
	public static int gcd(int x, int y){
		if (x%y == 0)
			return y;
		else
			return gcd(y,x%y);
	}
}
