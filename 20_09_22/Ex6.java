import java.util.Scanner;
import java.util.Arrays;
public class Ex6{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		char[] ch=str.toCharArray();
		//Store vowels in a character array
		char[] vow={'a','e','i','o','u','A','E','I','O','U'};
		//use count variable to count number of occurenece of vowels
		int count=0;
		//compare each element of string to the character array and check for vowels
		//increment count if elements of vow are found
		for(int i=0;i<ch.length-1;i++){
			for(int j=0;j<vow.length-1;j++){
				if(ch[i]==vow[j])
					count++;
			}
		}
		System.out.println(count);
	}
}