import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LoginScreen extends JFrame{
	JPanel loginPanel, registerPanel;
	
	public LoginScreen(){
		createPanel();
        addPanel();
	}
	
	private void createPanel() {
		loginPanel = new JPanel();
		registerPanel= new JPanel();
		
	}
	
	private void addPanel() {
        add(loginPanel);
        loginPanelComponents(loginPanel);
    }

	public void loginPanelComponents(JPanel panel) {
		panel.setLayout(null);

		JLabel userLabel = new JLabel("Username");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(15);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(30);
		passwordText.setBounds(100, 40, 160, 25);
		panel.add(passwordText);

		JButton registerButton = new JButton("Register");
		registerButton.addActionListener(new addButtonListener());
		registerButton.setBounds(10, 80, 80, 25);
		panel.add(registerButton);
		
		// If the user provides invalid login credentials then the 
		// system should throw an error message to the user.
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(180, 80, 80, 25);
		loginButton.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent e){
				  JOptionPane.showMessageDialog((Component) e.getSource(),
							"Login button has been pressed");
			  }
			});
		
		panel.add(loginButton);
	}
	
	private static void registerPanelComponents(JPanel panel) {

		panel.setLayout(null);
		panel.setSize(350, 200);
		
		
		JLabel userLabel = new JLabel("Username");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(15);
		userText.setBounds(150, 10, 160, 25);
		panel.add(userText);

		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(30);
		passwordText.setBounds(150, 40, 160, 25);
		panel.add(passwordText);
		
		
		JLabel confirmPasswordLabel = new JLabel("Confirm Password");
		confirmPasswordLabel.setBounds(10, 70, 130, 25);
		panel.add(confirmPasswordLabel);

		JPasswordField confirmPasswordText = new JPasswordField(30);
		confirmPasswordText.setBounds(150, 70, 160, 25);
		panel.add(confirmPasswordText);

		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setBounds(10, 100, 80, 25);
		panel.add(emailLabel);

		JTextField emailText = new JTextField(30);
		emailText.setBounds(150, 100, 160, 25);
		panel.add(emailText);
		
		
		JButton submitButton = new JButton("Submit");
		submitButton.setBounds(150, 140, 80, 25);
		submitButton.addActionListener(new ActionListener(){
			  public void actionPerformed(ActionEvent e){
				  JOptionPane.showMessageDialog((Component) e.getSource(),
							"Submit button has been pressed");
			  }
			});
		panel.add(submitButton);
		// After the user clicks Submit, the system should verify that all fields are filled and that the 
		// username is not already registered, that the Password and Confirm Password fields are same, and 
		// that the email is valid. In case any of these validations fail, an appropriate error message 
		// should be displayed for the user.
		
	}

	
	class addButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ae) 
        {
            getContentPane().removeAll();
            getContentPane().add(registerPanel);//Adding to content pane, not to Frame
            registerPanelComponents(registerPanel);
            validate();
            repaint();
            printAll(getGraphics());//Export print all content
        }
    }

	public static void main(String[] args) {
		LoginScreen frame = new LoginScreen();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}