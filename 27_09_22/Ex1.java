import java.util.Scanner;
public class Ex1{
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	long min;
	int year,days;
	//take input using Scanner methods
	System.out.println("Enter minutes:");
	min= sc.nextLong();
    //type cast long to integer as integer is 32 bit and long is 64 bit
    year=(int)min/(12*30*24*60);
    days=(int)min/(24*60);
    //print the output
    System.out.println("Year="+year+"\tDays="+days);
	}
}