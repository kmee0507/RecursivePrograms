import java.util.*;
public class FibNumbers {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		System.out.println();
		sc.close();
		System.out.println("The first " + number + " numbers in the Fibonacci series are:");
		
		for (int i = 0;i<number;i++)
			System.out.print(fib(i) + " ");
		System.out.println();
	}
	
	public static int fib(int n){
		if (n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			return fib(n-1) + fib(n-2);
	}

}
