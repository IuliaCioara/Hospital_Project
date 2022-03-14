package Proiect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BuletinAnalize extends JPanel {
    private JLabel numeBiologL;
    private JLabel evaluareCalitateL;
    private JLabel rezultatL;
    private JLabel observatiiL;
    private JLabel pretL;
    private JTextField numeBiologTF;
    private JComboBox evaluareCalitateCB;
    private JTextField rezultatTF;
    private JTextField observatiiTF;
    private JTextField pretTF;
    private JButton cancelButton;
    private JButton insertBuletin;

    private GridBagConstraints constraints;

    public BuletinAnalize() {
        setLayout(new GridBagLayout());

        numeBiologL = new JLabel("Biolog:");
        evaluareCalitateL = new JLabel("Evaluarea calitatii:");
        rezultatL = new JLabel("Rezultat:");
        observatiiL = new JLabel("Observatii:");
        pretL = new JLabel("Pret:");
        numeBiologTF = new JTextField();
        evaluareCalitateCB = new JComboBox(new String[]{"Satisfacatoare", "Buna", "Rea"});
        rezultatTF = new JTextField();
        observatiiTF = new JTextField();
        pretTF = new JTextField();

        Color culoarebackground=new Color(0xFD6C9E); 
        setBackground(culoarebackground);
        
        cancelButton = new JButton("Cancel");
        insertBuletin = new JButton("Adauga analiza");
        Color culoarebuton=new Color(0xDB0073);
        
        cancelButton.setFont(new Font("Arial",Font.PLAIN,15));
        cancelButton.setBackground(culoarebuton);
        cancelButton.setForeground(Color.white);; 
        
        insertBuletin.setFont(new Font("Arial",Font.PLAIN,15));
        insertBuletin.setBackground(culoarebuton);
        insertBuletin.setForeground(Color.white);

        constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.weightx = 0.5;
        constraints.weighty = 0.5;
        constraints.ipadx = 100;

        add(numeBiologL, constraints);

        constraints.gridx++;
        add(numeBiologTF, constraints);

        constraints.gridy++;
        constraints.gridx--;
        add(evaluareCalitateL, constraints);

        constraints.gridx++;
        add(evaluareCalitateCB, constraints);

        constraints.gridy++;
        constraints.gridx--;
        add(rezultatL, constraints);

        constraints.gridx++;
        add(rezultatTF, constraints);

        constraints.gridy++;
        constraints.gridx--;
        add(observatiiL, constraints);

        constraints.gridx++;
        add(observatiiTF, constraints);

        constraints.gridy++;
        constraints.gridx--;
        add(pretL, constraints);

        constraints.gridx++;
        add(pretTF, constraints);

        constraints.gridy++;
        constraints.gridx--;
        add(cancelButton, constraints);

        constraints.gridx++;
        add(insertBuletin, constraints);
    }

    public void addCancelButtonActionListener(ActionListener actionListener) {
        cancelButton.addActionListener(actionListener);
    }

    public void addInsertBuletinActionListener(ActionListener actionListener) {
        insertBuletin.addActionListener(actionListener);
    }

    public JTextField getNumeBiologTF() {
        return numeBiologTF;
    }

    public String getEvaluareCalitateCB() {
        return evaluareCalitateCB.getSelectedItem().toString();
    }

    public JTextField getRezultatTF() {
        return rezultatTF;
    }

    public JTextField getObservatiiTF() {
        return observatiiTF;
    }

    public int getPretTF() {
        return Integer.parseInt(pretTF.getText().trim());
    }
}
