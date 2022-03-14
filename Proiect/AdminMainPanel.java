package Proiect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.HierarchyBoundsAdapter;

public class AdminMainPanel extends JPanel {

    private JButton modificaMedicamente;
    private JButton modificaPaturi;
    private JButton showProduse;
    private JButton showSectii;
    private JButton logOut;
    private  GridLayout layout = new GridLayout(0,2);

    GridBagConstraints constraints;

    public AdminMainPanel() {
        
    	setLayout(layout);
    	
    	modificaMedicamente = new JButton("Actualizare pret medicamente");
        modificaPaturi = new JButton("Actualizare numar paturi");
        showSectii = new JButton("Vizualizeaza sectiile");
        showProduse = new JButton("Vizualizeaza produsele");
        logOut = new JButton("Log out");

        Color culoarebackground=new Color(0xFD6C9E); 
        setBackground(culoarebackground);
        Color culoarebuton=new Color(0xDB0073);
        
        modificaMedicamente.setFont(new Font("Arial",Font.PLAIN,18));
        modificaMedicamente.setBackground(culoarebuton);
        modificaMedicamente.setForeground(Color.white);;
         
        
        modificaPaturi.setFont(new Font("Arial",Font.PLAIN,18));
        modificaPaturi.setBackground(culoarebuton);
        modificaPaturi.setForeground(Color.white);
        
        
        showSectii.setFont(new Font("Arial",Font.PLAIN,18));
        showSectii.setBackground(culoarebuton);
        showSectii.setForeground(Color.white);
        
        showProduse.setFont(new Font("Arial",Font.PLAIN,18));
        showProduse.setBackground(culoarebuton);
        showProduse.setForeground(Color.white);
        
        logOut.setFont(new Font("Arial",Font.PLAIN,18));
        logOut.setBackground(culoarebuton);
        logOut.setForeground(Color.white);
        
        add(showSectii);
        

        add(modificaPaturi);
        

        add(modificaMedicamente);
        
        
        
        
       

        add(showProduse);
        add(logOut);
        
       
    }

    public void addModificaMedicamenteListener(ActionListener actionListener) {
        modificaMedicamente.addActionListener(actionListener);
    }

    public void addModificaPaturiListener(ActionListener actionListener) {
        modificaPaturi.addActionListener(actionListener);
    }

    public void addShowProduse(ActionListener actionListener) {
        showProduse.addActionListener(actionListener);
    }

    public void addShowSecii(ActionListener actionListener) {
        showSectii.addActionListener(actionListener);
    }

    public void addLogOut(ActionListener actionListener) { logOut.addActionListener(actionListener); }
}
