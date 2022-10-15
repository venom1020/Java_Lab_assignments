import java.util.Scanner;
public class Ex3{
public static void main(String[] args) {
	Stack s1;
	Scanner sc=new Scanner(System.in);
	int size,choice=0,element;
	System.out.println("Enter size of stack:");
	size=sc.nextInt();
	s1= new Stack(size);
	while(true)
	{ System.out.print("\n1.Create new stack\n2.Push to stack\n3.Pop stack\n4.Display stack\n5.Empty stack\n6.exit\n");
	  choice=sc.nextInt();
	  switch(choice)
		{ case 1: System.out.println("Enter size of stack:");
				  size=sc.nextInt();
				  s1=s1.createNew(size);
				  break;
		  case 2: System.out.println("Enter element to push:");
		  		  element=sc.nextInt();
		  		  s1.push(element);
		  		  break;
		  case 3: s1.pop();
		  		  break;
		  case 4: s1.display();
		  		  break;
		  case 5: System.out.println("Stack Emptied!!!");
				  s1=s1.createNew(size);
				  break;	  
		  default : System.exit(0);
		  			break;		  
		  					  


		}
	}

}

}
