import java.util.Scanner;
public class CalcTest{

	public static void main(String[] args) {
		Calculator c= BasicCalculator.getInstance();
		Scanner s= new Scanner(System.in);
		int choice,n;
		while(true)
		{ System.out.println("--------Test Calculator-------");
		  System.out.print("1.Put\n2.Read\n3.Neg\n4.Add\n5.Sub\n6.Mul\n7.Div\n8.Clear\n9.Clear all\n0.Exit\n:");
		  choice=s.nextInt();
		  switch(choice)
		  { case 1: System.out.println("Enter number:");
		  			n=s.nextInt();
		  			c=c.put(n);
		  			break;
			case 2: System.out.println("Result of previous operation ="+c.read());
					break;
			case 3: c=c.neg();
					break;
			case 4: c=c.add();
					break;					  			
			case 5: c=c.sub();
					break;
			case 6: c=c.mul();
					break;
			case 7: c=c.div();
					break;
			case 8: c=c.clear();
					break;	
			case 9: c=c.clearAll();
					break;
			default: System.exit(0);
										
		  }

		}


	}
}