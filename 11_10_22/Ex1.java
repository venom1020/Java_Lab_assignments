import java.util.Scanner;
public class Ex1{
	public static void main(String[] args) {
	Books b1= new Books(50);
	Scanner s= new Scanner(System.in);
	int ch;
	String title,auth;
	while(true)
	{ System.out.println("1.Get Inventory Details");
	  System.out.println("2.Search by title\n3.Search by author\n4.Randomise inventory\n5.Exit");
	  ch=s.nextInt();
	  switch(ch)
	  { case 1: b1.getDetails();
	  			break;
	  	case 2:	System.out.println("Enter Title to search");
	  			title=s.next();
	  			b1.searchByTitle(title);
	  			break;
	  	case 3: System.out.println("Enter Author to search");
	  			auth=s.next();
	  			b1.searchByAuthor(auth);
	  			break;		
	  	case 4: b1= new Books(50);
	  			break;			
	  	default: System.exit(0);				

	  }


	}

	}
}