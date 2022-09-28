import java.util.Scanner;
import java.util.Arrays;
public class Ex4{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string value:");
		
		//use .next() method of Scanner class to obtain input from the user
		String str=sc.next();
		
		//convert string to char array using .toCharArray() from Array class present in java.util pkg
		char[] ch=str.toCharArray();
		
		//use bubble sort to sort the character array
		for(int i=0;i<ch.length-1;i++){
			for(int j=1;j<ch.length;j++){
				if(ch[j-1]>ch[j]){
					char temp= ch[j-1];
					ch[j-1]=ch[j];
					ch[j]=temp;
				}
			}
		}	
		String s= new String(ch);
		System.out.println(s);
		
		//Alternate method using .sort() method defined in Array class
		/*
		Arrays.sort(ch);
		String s= new String(ch);
		System.out.println(s);
		*/

	}

}