
public class Recursive {
	public static void message(int n){
		if (n > 0){
			System.out.println("This is a recursive method");
			message(n-1);
		}
	}
	public static void main(String[] args){
		Recursive.message(5);
	}

}
