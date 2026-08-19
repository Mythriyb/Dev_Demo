package cse_sjc;

import java.util.ResourceBundle;

public class App {
	public int userlogin(String in_uer,String in pwd)
	{
		ResourceBundle rd=ResourceBundle.getBundle("config");
		String userName=rb.getString("username");
		String Password=rb.getString("password");
	    
		if(in_user.equals(username)&& in_pwd.equals(password))
			return 1;
		else
			return 0;
	}

}
