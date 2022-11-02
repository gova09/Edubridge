package Proxy;

public class ProxyPatternTest {
	public static void main(String[] args)
	{
		User user=new User("dev","dev");
		FolderProxy folderProxy=new FolderProxy(user);
		System.out.println("When username and password are correct:");
		folderProxy.performOperations();
		System.out.println("--------------------");
		User userWrong=new User("abc","abc");
		FolderProxy folderProxyWrong=new FolderProxy(userWrong);
		System.out.println("When username and password are oncorrect:");
		folderProxyWrong.performOperations();
	}

}
