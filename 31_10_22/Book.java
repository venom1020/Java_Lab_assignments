public class Book{
	//fields
	private String name;
	private Author author;
	private double price;
	private int qty=0;

	//constructors
	Book(String name,Author author, double price){
		this.name=name;
		this.author=author;
		this.price=price;
	}

	Book(String name,Author author, double price, int qty){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}

	//methods
	public String getName()
	{ return name;
	}

	public Author getAuthor()
	{ return author;
	}

	public double getPrice()
	{ return price;
	}

	public void setPrice(double price)
	{ this.price=price;
	}	

	public int getQty()
	{ return qty;
	}

	public void setQty(int qty)
	{ this.qty=qty;
	}

	@Override
	public String toString()
	{ return "Name:"+name+"\nAuthor:"+author.toString()+"\nPrice: "+price+"\nQty: "+qty;
	}

}

