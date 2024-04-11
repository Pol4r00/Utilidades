package projeto;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Account {
	public String username;
	
	public String password;
	
	public double balance;
	
	public static final String logmessage = "Action Executed succesfully";
	
	public static final String logmessageerror= "An error occurred";
	
	public static final String logmessagealert = "Exiting program";
	
	
	
	
	
	
	
	
	public String getusername() {
		return username;
	}
	
	public String getpassword() {
		return password;
	}
	
	public String useruppercase() {
		return username.toUpperCase();
	}
	
	public String passuppercase() {
		return password.toUpperCase();
	}
	

		
	}


