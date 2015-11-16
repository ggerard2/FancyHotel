import javax.swing.JOptionPane;

public class Login {
	public static void main(String[] args) {
		String user = JOptionPane.showInputDialog(null, "user");
		String password = JOptionPane.showInputDialog(null, "password");
		
		//compare with db value
		if ("user".equals(user) && "password".equals(password)) {
			//activate listener to allow login
			JOptionPane.showMessageDialog(null, "login ok");
		}else {
			JOptionPane.showMessageDialog(null, "Login Failed");
		}
	}
}