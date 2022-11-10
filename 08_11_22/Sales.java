public class Sales extends Item{
  private double[] saleDetails= new double[3];

  //get-set methods
  public void setDetails(int nth_month, double saleFigure)
  { if(nth_month<3)
  	saleDetails[nth_month]=saleFigure;
  }

  public double getDetails(int nth_month)
  { if(nth_month<3)
  	return saleDetails[nth_month];
  	else
  	return 0;
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

	
}