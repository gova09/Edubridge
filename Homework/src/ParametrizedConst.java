
public class ParametrizedConst {
	String customername;
	int customerid;
	long customerphoneno;
	ParametrizedConst(String cname,int cid,long cphoneno)
	{
		customername=cname;
		customerid=cid;
		customerphoneno=cphoneno;
		
	}
	void display()
	{
		System.out.println("The Customer name is"+customername+ "\nThe Customer Id is "+customerid+ "\nThe Customer phoneno is "+ customerphoneno);
	}
	public static void main(String args[])
	{
		ParametrizedConst mycustomer=new ParametrizedConst("Gova",21,986531);
		mycustomer.display();
	}
}
	


