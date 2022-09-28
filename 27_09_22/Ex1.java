import java.util.Scanner;
public class Ex1{
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	long min;
	int year,days;
	System.out.println("Enter minutes:");
	min= sc.nextLong();
    year=(int)min/(12*30*24*60);
    days=(int)min/(24*60);
    System.out.println("Year="+year+"\tDays="+days);
	}
}