public class SWitem extends Sales{

private String type;
private String os;

//get-set methods
public void setType(String s)
{ type=s;

}

public void setOS(String s)
{  os=s;
}

public String getType()
{ return type;
}

public String getOS()
{return os;
}

 //overridden Methods
  	@Override
  	public void setTitle(String title)
	{ super.setTitle(title);
	}
  	@Override
	public void setPrice(double price)
	{ super.setPrice(price);
	}

 	@Override
	public String getTitle()
	{ return super.getTitle();
	}
	@Override
	public double getPrice()
	{ return super.getPrice();
	}

	@Override
	 public void setDetails(int nth_month, double saleFigure)
	{ super.setDetails(nth_month,saleFigure);
	}  
	@Override
  	public double getDetails(int nth_month)
  	{ return super.getDetails(nth_month);
    }

    @Override
    public String toString()
    { return "\nTitle: "+getTitle()+"\nPrice: "+getPrice()+"\nType:"+getType()+"\nOS:"+getOS();

    }
}