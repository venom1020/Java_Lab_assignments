import java.util.Scanner;
public class Ex3{
 
 public static void main(String[] args) {
 Scanner s= new Scanner(System.in);	
 int choice;
 float celcius,fahrenheit;
 while(true)
 	{ System.out.println("1.Convert from celcius to fahrenheit?\n2.Convert from fahrenheit to celcius?\n3.Exit\n:");
 	  choice=s.nextInt();
 	  switch(choice){
 	  case 1: System.out.print("Enter temperature:");
 	  		  celcius=s.nextFloat();
 	  		  convertT(celcius,0);
 	  		  break;
 	  case 2: System.out.print("Enter temperature:");
 	  		  fahrenheit=s.nextFloat();
 	  		  convertT(fahrenheit,1);
 	  		  break; 
 	  default: System.exit(0);		  		  
 	  }
 	  System.out.flush();
 	}	
 
 }

 static void convertT(float temp,int mode){
 //mode 0 converts from Celcius to Fahrenheit
 //mode 1 does the opposite	
 if(mode==0){
   temp=1.8f*temp+32;
   System.out.println("Fahrenheit: "+temp);
 }
 else 
 { temp=(temp-32)/1.8f;
   System.out.println("Celcius: "+temp);

 }
 }


}