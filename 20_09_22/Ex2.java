public class Ex2{
	public static void main(String[] args) {
			//check if there are less than 3 input arguments to main function.
			if(args.length!=3){
				System.out.println("Input arguments Incorrect!");
				return;
				//return from main avoid further lines of code.
			}

			//print input arguments one after other using loop 
			for (int i=0;i<args.length ;i++ ) {
			System.out.println(args[i]);	
			}

		}	
}