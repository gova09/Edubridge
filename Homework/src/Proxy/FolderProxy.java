package Proxy;

public class FolderProxy implements Ifolder {
	Folder folder;
	User user;
	public FolderProxy(User user)
	{
		this.user=user;
	}
	public void performOperations()
	{
		if(user.getUserName().equalsIgnoreCase("dev") && user.getPassword().equalsIgnoreCase("dev"))
		{
			folder=new Folder();
			folder.performOperations();
		}
		else
		{
			System.out.println("You dont have acces to thiss folder");
		}
	}

}
