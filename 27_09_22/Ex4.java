import java.util.Scanner;

public class Ex4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size= sc.nextInt();	
		System.out.println("Enter the integer array:");
		int[] arr= new int[size];
		for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();

		float avg=0;
		for(int i=0;i<arr.length;i++) avg+=arr[i];
		avg/=size;

		System.out.println("Average of the Array: "+avg);
		System.out.println("ELements greater than Average:");
		for(int i=0;i<arr.length;i++)
		{ if(arr[i]>avg) System.out.print(arr[i]+"\t");

		}


	}
}