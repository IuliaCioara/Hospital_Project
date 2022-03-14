package Proiect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LogInPanel extends JPanel{
    private JLabel id;
    private JLabel password;
    private JTextField idTextField;
    private JTextField passwordTextField;
    private JButton logInButton;
    private JButton cancelButton;
    private GridBagConstraints constraints;

    public LogInPanel() {
        id = new JLabel("ID: ");
        password = new JLabel("Password: ");
        idTextField = new JTextField();
        passwordTextField = new JTextField();
        constraints = new GridBagConstraints();
        logInButton = new JButton("Log In");
        cancelButton = new JButton("Cancel");
        Color culoarebuton=new Color(0xDB0073);
        Color culoarebackground=new Color(0xFD6C9E); 
        setBackground(culoarebackground);
        
        
        logInButton.setFont(new Font("Arial",Font.PLAIN,15));
        logInButton.setBackground(culoarebuton);
        logInButton.setForeground(Color.white);;
  
        
        cancelButton.setFont(new Font("Arial",Font.PLAIN,15));
        cancelButton.setBackground(culoarebuton);
        cancelButton.setForeground(Color.white);;
  
        
        setLayout(new GridBagLayout());

        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.weightx = 0.5;
        constraints.weighty = 0.5;
        add(id, constraints);

        // constraints for the id text field
        constraints.gridx++;
        constraints.ipadx = 100;
        add(idTextField, constraints);

        // constraints for the password label
        constraints.gridx--;
        constraints.gridy++;
        constraints.ipadx = 0;
        add(password, constraints);

        // constraints for the password text field
        constraints.gridx++;
        constraints.ipadx = 120;
        add(passwordTextField, constraints);

        // constraints for the log in button
        constraints.gridx--;
        constraints.gridy++;
        add(cancelButton, constraints);

        // constraints for the new account button
        constraints.gridx++;
        add(logInButton, constraints);
    }

    public void addLogInButtonActionListener(ActionListener actionListener) {
        logInButton.addActionListener(actionListener);
    }

    public void addCancelButtonActionListener(ActionListener actionListener) {
        cancelButton.addActionListener(actionListener);
    }

    public JTextField getIdTextField() {
        return idTextField;
    }

    public JTextField getPasswordTextField() {
        return passwordTextField;
    }
}

