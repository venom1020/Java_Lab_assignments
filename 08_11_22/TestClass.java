public class TestClass
{ public static void main(String[] args) {
	SWitem s1= new SWitem();
	HWitem h1= new HWitem();

	//Software items
	//test Set methods
	s1.setTitle("Photoshop");
	s1.setPrice(2000.0);
	s1.setType("Editing Software");
	s1.setOS("Windows");
	//set Sale details
	s1.setDetails(0,150.0);
	s1.setDetails(1,115.0);
	s1.setDetails(2,120.0);

	//get methods are a part of toString method
	System.out.println(s1+"\n\nSale Details");
	for(int i=0;i<3;i++) 
		System.out.println(s1.getDetails(i));

	//Hardware Items
	//test Set methods
	h1.setTitle("M300 Mouse");
	h1.setPrice(1000.0);
	h1.setCategory("Peripheral Device");
	h1.setOEM("Lenovo");
	//set Sale details
	h1.setDetails(0,12.0);
	h1.setDetails(1,121.0);
	h1.setDetails(2,15.0);

	//get methods are a part of toString method
	System.out.println(h1+"\n\nSale Details");
	for(int i=0;i<3;i++) 
		System.out.println(h1.getDetails(i));
}

}