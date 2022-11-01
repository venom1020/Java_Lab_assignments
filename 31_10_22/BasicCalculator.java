public class BasicCalculator implements Calculator{

private int[] arr;
private int index;

BasicCalculator()
{ arr= new int[3];
  index=0;
}

public static Calculator getInstance()
{ 
	Calculator c= new BasicCalculator();
	return c;
}

public Calculator put(int n)
{  if(index>1)
		System.out.println("Operands already exist!! Clear before putting again");
	else
		arr[index++]=n;

	return this;
}

public Calculator clear()
{ if(index>-1)
	arr[index--]=0;
  else
  System.out.println("Nothing to clear!!");	
  return this;
}

public Calculator clearAll()
{ 
	return BasicCalculator.getInstance();
}


public int read()
{  return arr[2];	
}

public Calculator neg()
{ arr[index]=-arr[index];
  return this;
}

public Calculator add()
{ if(index>1)
	arr[2]=arr[0]+arr[1];
	else
	System.out.println("Insufficient Operands!!");
  return this;	
}

public Calculator sub()
{ if(index>1)
	arr[2]=arr[0]-arr[1];
	else
	System.out.println("Insufficient Operands!!");
  return this;	
}

public Calculator mul()
{ if(index>1)
	arr[2]=arr[0]*arr[1];
	else
	System.out.println("Insufficient Operands!!");
  return this;
}

public Calculator div()
{ if(index>1)
	arr[2]=arr[0]/arr[1];
	else
	System.out.println("Insufficient Operands!!");
  return this;	
}

}