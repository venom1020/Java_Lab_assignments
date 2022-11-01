//Author class
public class Author
{ 
	private String name,email;
 	private char gender;

 	//constructor
 	Author(String name, String email,char gender)
 	{ 	this.name=name;
 		this.email=email;
 		this.gender=gender;
 	}

 	//methods
 	@Override
 	public String toString()
 	{ return "\n-----------------"+"\nName: "+name+"\nEmail: "+email+"\nGender: "+gender+"\n-----------------";

 	}
}