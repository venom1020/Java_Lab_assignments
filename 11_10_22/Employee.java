
//definigc class Employee
class Employee{

	//instance variables
	private int empID;
	private String empName;
	private String empDes;
	private double salary;

	//constructor
	Employee(){

	}

	Employee(int empID, String empName, String empDes, double salary)
	{
		this.empID  = empID;
		this.empName  = empName;
		this.empDes  = empDes;
		this.salary = salary;
	}

	//methods
	public void displayDetails(){
		System.out.println("ID: " + empID);
		System.out.println("Name: " + empName);
		System.out.println("Designation: " + empDes);
		System.out.println("salary: " + salary);
	}

	//search an employee based on ID
	public boolean searchEmp(int id){

		if(id == empID){
			return true;
		}
		return false;
	}

	//increment salary by 10%
	public void incrementSal(){
		salary+=salary*0.1;
	}

}
