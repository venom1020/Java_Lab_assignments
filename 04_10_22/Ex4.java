public class Ex4{
 public static void main(String[] args) {
 	//MyArray class is defined in MyArray.java
    MyArray arr= new MyArray(10);
    System.out.println("Enter elements of array:");
 	arr.accept();
 	System.out.println("Max:"+arr.getmax()+"\nMin:"+arr.getmin());
 	arr.sort();
 }
}