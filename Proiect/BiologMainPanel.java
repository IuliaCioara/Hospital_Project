package Proiect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.HierarchyBoundsAdapter;

public class BiologMainPanel extends JPanel {

    private JButton buletinAnalize;
    private JButton cerereLaborator;

    private JButton logOut;

    GridBagConstraints constraints;

    public BiologMainPanel() {
        buletinAnalize = new JButton("Adauga buletin analize");
        cerereLaborator = new JButton("Vizualizeaza cerere laborator");
        logOut = new JButton("Log out");

        Color culoarebackground=new Color(0xFD6C9E); 
        setBackground(culoarebackground);
        Color culoarebuton=new Color(0xDB0073);
        
        buletinAnalize.setFont(new Font("Arial",Font.PLAIN,18));
        buletinAnalize.setBackground(culoarebuton);
        buletinAnalize.setForeground(Color.white);; 
        
        cerereLaborator.setFont(new Font("Arial",Font.PLAIN,18));
        cerereLaborator.setBackground(culoarebuton);
        cerereLaborator.setForeground(Color.white);
        
        logOut.setFont(new Font("Arial",Font.PLAIN,18));
        logOut.setBackground(culoarebuton);
        logOut.setForeground(Color.white);
        
        constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.weightx = 0.5;
        constraints.weighty = 0.5;
        constraints.ipadx = 100;

        add(buletinAnalize, constraints);
        //constraints.gridy++;
        constraints.gridx++;


        add(cerereLaborator, constraints);
        constraints.gridx++;

        add(logOut, constraints);
    }

    public void addBuletinAnalizeListener(ActionListener actionListener) {
        buletinAnalize.addActionListener(actionListener);
    }

    public void addShowCerereLaborator(ActionListener actionListener) {
        cerereLaborator.addActionListener(actionListener);
    }

    public void addLogOut(ActionListener actionListener) { logOut.addActionListener(actionListener); }
}
