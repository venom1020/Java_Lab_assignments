import java.util.Scanner;
import java.util.Arrays;
public class Ex5{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string value:");
		String str=sc.next();
		char[] ch=str.toCharArray();
		/*flag is used to identify if char[] is palindrome or not
        compare char[i] with char[length-1-i] and iterate till i=length/2
        if the elements are not equal raise flag=1
        check character array from both sides to see if they are symmetric*/
		int flag=0;
		for(int i=0;i<ch.length/2;i++){
			if(ch[i]!=ch[ch.length-1-i]){
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println( str+" is not a palindrome");
		else
			System.out.println(str+ " is a palindrome");
	}
}