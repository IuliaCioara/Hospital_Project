package Proiect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AdaugaRegistru extends JPanel {
    private JLabel ParafaLabel;
    private JTextField ParafaTextField;
    private JButton cancelButton;
    private JButton adaugaRegistru;

    private GridBagConstraints constraints;

    public AdaugaRegistru() {
        setLayout(new GridBagLayout());

        ParafaLabel = new JLabel("Parafa:");
        ParafaTextField = new JTextField();
        cancelButton = new JButton("Cancel");
        adaugaRegistru = new JButton("Adauga in registru");

        Color culoarebackground=new Color(0xFD6C9E); 
        setBackground(culoarebackground);
        
        Color culoarebuton=new Color(0xDB0073);
        
        cancelButton.setFont(new Font("Arial",Font.PLAIN,15));
        cancelButton.setBackground(culoarebuton);
        cancelButton.setForeground(Color.white);; 
        
        adaugaRegistru.setFont(new Font("Arial",Font.PLAIN,15));
        adaugaRegistru.setBackground(culoarebuton);
        adaugaRegistru.setForeground(Color.white);
        
        constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.weightx = 0.5;
        constraints.weighty = 0.5;
        constraints.ipadx = 100;

        add(ParafaLabel, constraints);

        constraints.gridx++;
        add(ParafaTextField, constraints);

        constraints.gridy++;
        constraints.gridx--;
        add(cancelButton, constraints);

        constraints.gridx++;
        add(adaugaRegistru, constraints);
    }

    public void addCancelButtonActionListener(ActionListener actionListener) {
        cancelButton.addActionListener(actionListener);
    }

    public void addAdaugaRegistruActionListener(ActionListener actionListener) {
        adaugaRegistru.addActionListener(actionListener);
    }

    public JTextField getParafaTextField() {
        return ParafaTextField;
    }
}
