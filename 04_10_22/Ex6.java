import java.util.Scanner;
public class Ex6{

public static void main(String[] args) {
	long num;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter Number to be reversed:");
	num=s.nextLong();
	num=reverse(num);
	System.out.println("Reversed number:"+num);			
}

//method to reverse number
static long reverse(long num)
{ long temp=0;
	while(num>0)
	{ temp=temp*10+(num%10);
	  num/=10;
	}
	return temp;

}

}