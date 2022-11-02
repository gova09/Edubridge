package Decorator;

public class VegPizza {
	public class VegPizza implements Pizza
	{
		  @Override
		  public String size() {
		    return "Medium";
		  }
		  @Override
		  public String ingredients() {
		    return "Vegetables";
		  }
		}
}


