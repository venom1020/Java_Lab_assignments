import java.util.Scanner;
public class Ex3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size= sc.nextInt();	
		System.out.println("Enter the integer array:");
		int[] arr= new int[size];
		for(int i=0;i<arr.length;i++) arr[i]=sc.nextInt();
		int max=arr[0],min=arr[0];
		for(int i=0;i<arr.length;i++)
			{  if(arr[i]>max) max=arr[i];
		       if(arr[i]<min) min=arr[i];
     		}
		System.out.println();
		System.out.print("Maximum element= "+max+" Minimum element= "+min);
}

}