package mypack;

public class MyAction {

	private String ID;
	private String Password;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	public String execute()
	{
		if(ID.equals("Shivam") && Password.equals("Mittal"))
		{
			return "success";
		}
		else 
			return "error";
	}
}
