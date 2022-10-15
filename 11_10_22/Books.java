import java.util.Random;
import java.util.Scanner;
public class Books{
 //private fields of inventory
 private String[] author={"HC_Verma","BP_Pandey","SN_Dhawan","RD_Sharma","RP_Jain"};
 private String[] title={"Physics","Biology","Chemistry","Maths","Electronics"};
 private String [] publisher={"Arihant","Jaico","Pearson","Arihant","Jaico"};
 private int[] stock = new int[5];;
 private float[] price={550.25f,618.65f,450.2f,560.1f,840.28f};


// constructor randmizes the stock when new Inventory is made every time
Books(int max_size)
{ Random r= new Random();
  for(int i=0;i<5;i++)
      stock[i]=r.nextInt(max_size+1); // bound is set to max_size+1 
  // this initialises the stock to random integer between zero and max_size
}

//methods
public void searchByTitle(String s){
  for(int i=0;i<5;i++)
    { if(title[i].equals(s))
        { getDetails(i);
          checkout(i);
          return;
        }

    }
  System.out.println("No books with title: "+s);   
}

public void searchByAuthor(String s){
  for(int i=0;i<5;i++)
    { if(author[i].equals(s))
        { getDetails(i);
          checkout(i);
          return;
        }

    }
  System.out.println("No books with author: "+s);   
}

//print details of the books
void getDetails(int i)
{ System.out.println("-----------------------------------------");
  System.out.println("Title:"+title[i]);
  System.out.println("Author:"+author[i]);
  System.out.println("Publisher:"+publisher[i]);
  System.out.println("Stock:"+stock[i]);
  System.out.println("Price:"+price[i]);


}
void getDetails()
{ System.out.println("Title\t\t Author\t\tStock");
  for(int i=0;i<5;i++)
    { System.out.printf("%-15s  %s \t%d\n",title[i],author[i],stock[i]);
    }
  System.out.println("-----------------------------------------");
}

void checkout(int i)
{ int copies;
  Scanner s =new Scanner(System.in);
  System.out.println("-----------------Checkout-----------------");
  System.out.println("How many copies required:");
  copies=s.nextInt();
  if(copies>stock[i]) System.out.println("Required Copies not in stock!!!");
  else {
   System.out.println("Total cost:"+ copies*price[i]); 
   stock[i]-=copies;
  }
  System.out.println("------------------------------------------");
}
}