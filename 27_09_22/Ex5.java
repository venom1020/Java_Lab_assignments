import java.util.Scanner;
import java.util.Arrays;

public class Ex5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input the array
		System.out.println("Enter the size of array:");
		int size= sc.nextInt();	
		System.out.println("Enter the integer array:");
		int[] arr= new int[size];
		for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
		/*use sort() method of the Arrays class (java.util) to sort in ascending order.
		Other specific sorting algorithm can also be implemented manually.*/
		Arrays.sort(arr);
		//print the array 
		System.out.println("Sorted array:");
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
	}
}