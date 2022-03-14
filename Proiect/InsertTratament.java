package Proiect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class InsertTratament extends JPanel {
    private JLabel denumireMedicamentLabel;
    private JLabel denumireSanitarLabel;
    private JTextField denumireMedicamentTextField;
    private JTextField denumireSanitarTextField;
    private JButton cancelButton;
    private JButton insertTratament;

    GridBagConstraints constraints;

    public InsertTratament() {
        setLayout(new GridBagLayout());

        denumireMedicamentLabel = new JLabel("Medicament:");
        denumireSanitarLabel = new JLabel("Sanitar:");
        denumireMedicamentTextField = new JTextField();
        denumireSanitarTextField = new JTextField();

        cancelButton = new JButton("Cancel");
        insertTratament = new JButton("Adauga tratamentul");

        constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.weightx = 0.5;
        constraints.weighty = 0.5;
        constraints.ipadx = 100;

        Color culoarebackground=new Color(0xFD6C9E); 
        setBackground(culoarebackground);
        Color culoarebuton=new Color(0xDB0073);
        
        cancelButton.setFont(new Font("Arial",Font.PLAIN,15));
        cancelButton.setBackground(culoarebuton);
        cancelButton.setForeground(Color.white);; 
        
        insertTratament.setFont(new Font("Arial",Font.PLAIN,15));
        insertTratament.setBackground(culoarebuton);
        insertTratament.setForeground(Color.white);
        
        add(denumireMedicamentLabel, constraints);

        constraints.gridx++;
        add(denumireMedicamentTextField, constraints);

        constraints.gridy++;
        constraints.gridx--;
        add(denumireSanitarLabel, constraints);

        constraints.gridx++;
        add(denumireSanitarTextField, constraints);

        constraints.gridy++;
        constraints.gridx--;
        add(cancelButton, constraints);

        constraints.gridx++;
        add(insertTratament, constraints);
    }

    public void addCancelButtonActionListener(ActionListener actionListener) {
        cancelButton.addActionListener(actionListener);
    }

    public void addInsertTratamentActionListener(ActionListener actionListener) {
        insertTratament.addActionListener(actionListener);
    }

    public JTextField getDenumireMedicamentTextField() {
        return denumireMedicamentTextField;
    }

    public JTextField getDenumireSanitarTextField() {
        return denumireSanitarTextField;
    }
}
