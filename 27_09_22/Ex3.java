import java.util.Scanner;
public class Ex3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input the array.
		System.out.println("Enter the size of array:");
		int size= sc.nextInt();	
		System.out.println("Enter the integer array:");
		int[] arr= new int[size];
		for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
		
		// initialise max and min as first element of array 
		//compare max and min to all other elements to get the new values of max and min
		int max=arr[0],min=arr[0];
		for(int i=0;i<arr.length;i++)
			{  if(arr[i]>max) max=arr[i];
		       if(arr[i]<min) min=arr[i];
     		}
     	//print the max and min values once the whole array is traversed.	
		System.out.println();
		System.out.print("Maximum element= "+max+" Minimum element= "+min);
}

}