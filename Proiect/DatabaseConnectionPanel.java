package Proiect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DatabaseConnectionPanel extends JPanel {
    private JButton connectAsAsistenta;
    private JButton connectAsAdmin;
    private JButton connectAsBiolog;
    private GridBagConstraints constraints;
    private JLabel welcomeLabel;
    
    public DatabaseConnectionPanel() {
        setLayout(new GridBagLayout());
        
        Color culoarebackground=new Color(0xFD6C9E); 
        Color culoarebuton=new Color(0xDB0073);

        setBackground(culoarebackground);
        welcomeLabel = new JLabel("Welcome to the hospital DataBase!");
        connectAsAsistenta = new JButton("Log in Asistenta");
        connectAsAdmin = new JButton("Log in Admin");
        connectAsBiolog = new JButton("Log in Biolog");

        connectAsAsistenta.setFont(new Font("Arial",Font.PLAIN,15));
        connectAsAsistenta.setBackground(culoarebuton);
        connectAsAsistenta.setForeground(Color.white);

        connectAsAdmin.setFont(new Font("Arial",Font.PLAIN,15));
        connectAsAdmin.setBackground(culoarebuton);
        connectAsAdmin.setForeground(Color.white);

        connectAsBiolog.setFont(new Font("Arial",Font.PLAIN,15));
        connectAsBiolog.setBackground(culoarebuton);
        connectAsBiolog.setForeground(Color.white);
        
        welcomeLabel.setFont(new Font("Arial",Font.BOLD,20));

        constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(20, 110, 20, 5);
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.weightx = 0.5;
        constraints.weighty = 0.5;
        connectAsAsistenta.setPreferredSize(new Dimension(200, 50));
        connectAsAdmin.setPreferredSize(new Dimension(200, 50));
        connectAsBiolog.setPreferredSize(new Dimension(200,50));

        constraints.gridwidth = 1;
        welcomeLabel.setSize(new Dimension(100,100));
        
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.gridwidth = 1;
        constraints.gridy++;
        add(connectAsAsistenta, constraints);
   
        constraints.gridx++;
        constraints.gridy--;
        add(welcomeLabel, constraints);
        constraints.gridy++;
        add(connectAsAdmin, constraints);

        constraints.gridx++;
        add(connectAsBiolog, constraints);
    }

    public void addConnectAsAsistentaButtonActionListener(ActionListener actionListener) {
        connectAsAsistenta.addActionListener(actionListener);
    }

    public void addConnectAsAdminButtonActionListener(ActionListener actionListener) {
        connectAsAdmin.addActionListener(actionListener);
    }

    public void addConnectAsBiologButtonActionListener(ActionListener actionListener) {
        connectAsBiolog.addActionListener(actionListener);
    }
}
