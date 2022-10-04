import java.util.Arrays;
import java.util.Scanner;
public class MyArray{
int arr[];
int length;

//constructor
MyArray(int length){
arr =new int[length];	
this.length=length;
}

//methods
void accept()
{ Scanner sc= new Scanner(System.in);
	for(int i=0;i<length;i++)
		arr[i]=sc.nextInt();

}
int getmax(){
int max=arr[0];
for(int i=0;i<length;i++) 
	if(arr[i]>max) max=arr[i];
return max;
}

int getmin(){
int min=arr[0];
for(int i=0;i<length;i++) 
	if(arr[i]<min) min=arr[i];
return min;
}

void sort(){
Arrays.sort(arr);
System.out.print("\nSorted array:");
for(int num:arr)
	System.out.print(num+" ");
}
}