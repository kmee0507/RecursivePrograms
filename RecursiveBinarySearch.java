import java.util.*;
public class RecursiveBinarySearch {
	
	public static void main(String[] args){
		int searchValue, result;
		String input;
		
		
		int numbers[] = {101, 130, 150, 175, 190, 200, 300, 350, 360, 370, 390, 400,500};
		
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.print("Enter a value to search for: ");
			searchValue = sc.nextInt();
			
			result = binarySearch(numbers, 0, numbers.length-1, searchValue);
			
			if (result == -1)
				System.out.println(searchValue + " was not found");
			else 
				System.out.println(searchValue + " was found at element " + result);
			
			System.out.print("Do you want to search again?(Y or N): ");
			sc.nextLine();
			input = sc.nextLine();
			
		}while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');
		
		
	}
	
	public static int binarySearch(int[] array, int first, int last, int value){
		int middle;
		
		if(first > last)
			return -1;
		middle = (first + last) / 2;
		
		if(array[middle] == value)
			return middle;
		else if(array[middle] < value)
			return binarySearch(array, middle + 1, last, value);
		else
			return binarySearch(array, first, middle - 1, value);
	}

}
