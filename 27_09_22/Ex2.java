 import java.util.Scanner;
 import java.util.Arrays;
 public class Ex2{
 	public static void main(String[] args) {
 		Scanner sc=new Scanner(System.in);
 		System.out.print("Enter the length of array: ");
 		int len=sc.nextInt();
 		System.out.println("Enter the array of integers");
 		int[] arr=new int[len];
 		for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
 		
 		System.out.println("Duplicate elements:");
 		for(int i=0;i<arr.length;i++)
 			{ for(int j=i;j<arr.length;j++)
 		        {
 			     if(i!=j & arr[i]==arr[j])
 			        System.out.print(arr[i]+" "); 
 			}
 			
 			}

 		
 	}
 }