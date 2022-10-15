import java.util.Scanner;
public class Ex1{
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int year=2022,input;
	boolean  flag=true;
	for(int i=0;i<3;i++){
		System.out.println("Which year is this?");
		input =s.nextInt();
		if(input ==year){
		flag=false;
		System.out.println("Good!");
		break;
		}		
	}
	if(flag==true) System.out.println("Correct answer was:"+year);
}
}