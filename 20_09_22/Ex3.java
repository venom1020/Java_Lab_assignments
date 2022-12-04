public class Ex3{
	public static void main(String[] args) {
			//check if there are less than 3 input arguments to main function.
			if(args.length!=3){
				System.out.println("Input args Incorrect!");
				return;
			}
			
			//store sum in a variable 
			int sum=0;
			//find sum using loop
			for (int i=0;i<args.length;i++) {
			// Integer class is used with method parseInt() which converts String into int type	
			sum+=Integer.parseInt(args[i]);	
			}
			System.out.println("Sum of the numbers:"+sum);

		}	
		
}