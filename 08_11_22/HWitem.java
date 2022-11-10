public class HWitem extends Sales{
private String category;
private String oem;

//get-set methods
public void setCategory(String s)
{ category=s;

}
public void setOEM(String s)
{  oem=s;
}

public String getCategory()
{ return category;
}
public String getOEM()
{return oem;
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

    //to-String method
    @Override
    public String toString()
    { return "\nTitle: "+getTitle()+"\nPrice: "+getPrice()+"\nCategory:"+getCategory()+"\nOEM:"+getOEM();

    }
}