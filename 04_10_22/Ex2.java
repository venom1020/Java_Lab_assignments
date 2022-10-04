public class Ex2{
public static void main(String[] args) {
 	//method to print the trinagle
 	floydTriangle(13,1);
    floydTriangle(13,2);
 	}	

static void floydTriangle(int lines,int mode)
 { int num=1;
 	//In mode 1 print numbers 1,2,3....
 	if(mode==1)
 	{
 		for(int i=0;i<lines;i++){
 		for(int j=0;j<i;j++)
 			System.out.print(num++ + " ");
 		System.out.println();
 		}	
	}
	else 
	// else prints 1,0,1....
	{ for(int i=0;i<lines;i++)
		{
 		for(int j=0;j<i;j++)
 			System.out.print((num++%2) + " ");
 		System.out.println();

		}
 	} 	
}
}