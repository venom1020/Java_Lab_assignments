import java.util.Scanner;
public class Ex2{
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter number of employee details to be stored");
 int num=sc.nextInt();
 Employee[] emp=new Employee[num];
 int ID;
 double salary;
 String name,des;
 for(int i=0;i<num;i++)
  { System.out.println("---------------------------------");
    System.out.print("Enter Employee ID:");
    ID=sc.nextInt();
    System.out.print("Enter Employee Name:");
    name=sc.next();
    System.out.print("Enter Employee Designation:");
    des=sc.next();
    System.out.print("Enter Employee salary:");
    salary=sc.nextDouble();
    emp[i]= new Employee(ID,name,des,salary);
  } 


 int choice;
 while(true)
 { System.out.println("1.Search Employee by ID:\n2.Salary Increment\n3.Display\n4.Exit");
   choice=sc.nextInt();
   boolean flag=false;
   switch(choice)
   { case 1: System.out.print("Enter ID to search");
             ID=sc.nextInt();
             for(int i=0;i<num;i++)
                { if(emp[i].searchEmp(ID)) 
                    { flag=true; 
                      System.out.println("\nEmployee found!!");
                      break;  

                    }
                }
             if(!flag) System.out.println("Employee not found!");   
             break;
      case 2: System.out.println("Enter employee ID to Increment(10%)");
              ID=sc.nextInt();
              for(int i=0;i<num;i++)
                { if(emp[i].searchEmp(ID)) 
                    { flag=true; 
                      emp[i].incrementSal();
                      break;  

                    }
                }  
               if(!flag) System.out.println("Employee not found!"); 
               break;
      case 3:  System.out.println("---------------Employee Details-------------");
               for(int i=0;i<num;i++)
                    emp[i].displayDetails();
                break;
      default : System.exit(0);                            

   }

 }
}
}