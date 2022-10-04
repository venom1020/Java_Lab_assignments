public class Ex5
{ public static void main(String[] args) {
  int count=0,sum=0;
  for(int i=101;i<=200;i++) {
  	 if(i%7==0){
  	 	count++;
  	 	sum+=i;
  	 }
  }
  System.out.println("Number of integers divisible by 7 in [100,200]:"+count+"\nSum of Integers:"+sum);
 
 }

}