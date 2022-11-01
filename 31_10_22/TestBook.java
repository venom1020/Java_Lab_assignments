public class TestBook{

	public static void main(String[] args) {
		Author au= new Author("JK Rowling","jkrowling@gmail.com",'F');
		Book b1= new Book("Harry Potter",au,1000);
		
		//test getter methods..
		System.out.println("\nName:"+b1.getName()+"\nAuthor:"+b1.getAuthor().toString()+"\nPrice:"+b1.getPrice()+"\nQty:"+b1.getQty());

		//test setter methods...
		b1.setPrice(2000);
		b1.setQty(10);
		
		//toString after setting fields...
		System.out.println(b1.toString());
	}
}