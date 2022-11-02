class Customer
{
	String cname;
	int cid;
	long cphoneno;

public Customer() {
	cname="gova";
	cid=119;
	cphoneno=99665230;
}
}
public class DefaultConst {
	public static void main(String[] args)
	{
		Customer customer=new Customer();
		System.out.println(customer.cname);
		System.out.println(customer.cid);
		System.out.println(customer.cphoneno);
	}
}