public class Stack{
  int arr[];
  int top;
  int size;

  //constructor....
  Stack(int size)
  { arr=new int[size]; 
  	top=-1;
  	this.size=size;
  }

  //methods
  Stack createNew(int n)
  { return new Stack(n);
  }
  
   void push(int ele)
   { if(top>=size-1) System.out.println("Stack full");
     else
     arr[++top]=ele;
   }

void pop()
{ if(top<0) System.out.println("Stack empty!!");
  else
  { System.out.println("Element popped:"+arr[top--]);
  }
}
void display()
{ for(int i=0;i<=top;i++)
	   System.out.print(arr[i]+" ");

}
}