package projeto;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Main {
	public static boolean checkuser(String tryuser1,ArrayList<Account> acc) {
		for (int x = 0; x < acc.size(); x++) {
			if (acc.get(x).username.equals(tryuser1)) {
				return true;
				
			}else {
				return false;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		ArrayList<Account> Accounts = new ArrayList<Account>();
		String choice = "-1";
		while (choice.equals("0") == false) {
			choice = JOptionPane.showInputDialog("1-Login\n2-Create a new Account");
			if (choice == null) {
				JOptionPane.showMessageDialog(null,Account.logmessagealert,"Alert",JOptionPane.WARNING_MESSAGE);
				break;
			}
			if (choice.equals("1") == true || choice.equals("2") == true) {
				if (choice.equals("1") == true) {
					String tryuser = JOptionPane.showInputDialog("Username:");
					for (int x = 0; x < Accounts.size(); x++) {
						if (Accounts.get(x).username.equals(tryuser) == true) {
							String trypass = JOptionPane.showInputDialog("Password:");
							if (Accounts.get(x).password.equals(trypass) == true) {
								JOptionPane.showMessageDialog(null,"Logged in succesfully");
							}else {
								JOptionPane.showMessageDialog(null,"Wrong password. Try again");
							}
						}
					}
				}
				if(choice.equals("2") == true){
					Account account1 = new Account();
					account1.username = JOptionPane.showInputDialog("Create your username:");
					boolean tryuser = checkuser(account1.username,Accounts);
					if (tryuser == true) {
						JOptionPane.showMessageDialog(null,"Username already taken. Try again.","Error", JOptionPane.ERROR_MESSAGE);
					}else {
						account1.password = JOptionPane.showInputDialog("Create a password");
						Accounts.add(account1);
						JOptionPane.showMessageDialog(null,Account.logmessage,"Info",JOptionPane.INFORMATION_MESSAGE);
						
					}
					
				}
				
			}else {
				if (choice.equals("0") == true){
					JOptionPane.showMessageDialog(null, "Exiting program", "Alert",JOptionPane.WARNING_MESSAGE);
				}
			}
		}
	}
}