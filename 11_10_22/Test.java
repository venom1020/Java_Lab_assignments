import java.util.Random;
public class Test{
	public static void main(String[] args) {
	 Random r= new Random();
	 int j=5;
	 while(--j>0)
	 {
	 	System.out.println(r.nextInt(5));
	 }
	}
}