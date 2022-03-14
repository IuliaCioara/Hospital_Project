package Proiect;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;



public class AsistentaMainPanel extends JPanel {

    private JButton insertPacient;
    private JButton insertConsult;
    private JButton adaugaRegistru;
    private JButton adaugaIntertnare;
    private JButton adaugaFisaPacient;
    private JButton insertTratament;
    private JButton cerereLaborator;
    private JButton cerereMedicamente;
    private JButton fisaExternare;
    private JButton modificaPacient;
    private JButton istoric;
    private JButton cautarePacient;
    private JButton showPacienti;
    private JButton showRegistru;
    private JButton showConsult;
    private JButton showInternare;
    private JButton showFisaPacient;
    private JButton showSectii;
    private JButton showAnalize;
    private JButton showTratament;
    private JButton showProduse;
    private JButton showExternari;
    private JButton showIstoric;
    private JButton logOut;
    private  GridLayout layout;
    
    public AsistentaMainPanel() {
        

        Color culoarebackground=new Color(0xFD6C9E);
        setBackground(culoarebackground);
        insertPacient = new JButton("Adauga pacient");
        insertConsult = new JButton("Adauga consult");
        adaugaRegistru = new JButton("Adauga in registru");
        adaugaIntertnare = new JButton("Internare noua");
        adaugaFisaPacient = new JButton("Adauga fisa pacient");
        insertTratament = new JButton("Adauga tratament");
        cerereLaborator = new JButton("Cerere laborator noua");
        cerereMedicamente = new JButton("Cerere medicamente");
        fisaExternare = new JButton("Fisa de externare noua");
        modificaPacient = new JButton("Modificare stare pacient");
        istoric = new JButton("Adauga in istoric");
        cautarePacient = new JButton("Cauta pacient");
        showPacienti = new JButton("Vizualizeaza pacientii");
        showRegistru = new JButton("Vizualizeaza registrul");
        showConsult = new JButton("Vizualizeaza consulturile");
        showInternare = new JButton("Vizualizeaza internarile");
        showFisaPacient = new JButton("Vizualizeaza fisele pacientilor");
        showSectii = new JButton("Vizualizeaza sectiile");
        showAnalize = new JButton("Vizualizeaza analizele");
        showTratament = new JButton("Vizualizeaza tratamentele");
        showProduse = new JButton("Vizualizeaza produsele");
        showExternari = new JButton("Vizualizeaza externarile");
        showIstoric = new JButton("Vizualizeaza istoricul");
        logOut = new JButton("Log out");
        GridLayout layout = new GridLayout(0,4);

        Color culoarebuton=new Color(0xDB0073);
     
        insertPacient.setFont(new Font("Arial",Font.PLAIN,18));
        insertPacient.setBackground(culoarebuton);
        insertPacient.setForeground(Color.white);;

        showPacienti.setFont(new Font("Arial",Font.PLAIN,18));
        showPacienti.setBackground(culoarebuton);
        showPacienti.setForeground(Color.white);

        showRegistru.setFont(new Font("Arial",Font.PLAIN,18));
        showRegistru.setBackground(culoarebuton);
        showRegistru.setForeground(Color.white);
        
        showConsult.setFont(new Font("Arial",Font.PLAIN,18));
        showConsult.setBackground(culoarebuton);
        showConsult.setForeground(Color.white);

        showInternare.setFont(new Font("Arial",Font.PLAIN,18));
        showInternare.setBackground(culoarebuton);
        showInternare.setForeground(Color.white);

        showFisaPacient.setFont(new Font("Arial",Font.PLAIN,18));
        showFisaPacient.setBackground(culoarebuton);
        showFisaPacient.setForeground(Color.white);

        showSectii.setFont(new Font("Arial",Font.PLAIN,18));
        showSectii.setBackground(culoarebuton);
        showSectii.setForeground(Color.white);
        
        showAnalize.setFont(new Font("Arial",Font.PLAIN,18));
        showAnalize.setBackground(culoarebuton);
        showAnalize.setForeground(Color.white);
        
        showTratament.setFont(new Font("Arial",Font.PLAIN,18));
        showTratament.setBackground(culoarebuton);
        showTratament.setForeground(Color.white);
        
        showProduse.setFont(new Font("Arial",Font.PLAIN,18));
        showProduse.setBackground(culoarebuton);
        showProduse.setForeground(Color.white);
        
        showExternari.setFont(new Font("Arial",Font.PLAIN,18));
        showExternari.setBackground(culoarebuton);
        showExternari.setForeground(Color.white);
        
        showIstoric.setFont(new Font("Arial",Font.PLAIN,18));
        showIstoric.setBackground(culoarebuton);
        showIstoric.setForeground(Color.white);

        logOut.setFont(new Font("Arial",Font.PLAIN,18));
        logOut.setBackground(culoarebuton);
        logOut.setForeground(Color.white);
        
        insertConsult.setFont(new Font("Arial",Font.PLAIN,18));
        insertConsult.setBackground(culoarebuton);
        insertConsult.setForeground(Color.white);

        adaugaRegistru.setFont(new Font("Arial",Font.PLAIN,18));
        adaugaRegistru.setBackground(culoarebuton);
        adaugaRegistru.setForeground(Color.white);
        
        adaugaIntertnare.setFont(new Font("Arial",Font.PLAIN,18));
        adaugaIntertnare.setBackground(culoarebuton);
        adaugaIntertnare.setForeground(Color.white);
        
        adaugaFisaPacient.setFont(new Font("Arial",Font.PLAIN,18));
        adaugaFisaPacient.setBackground(culoarebuton);
        adaugaFisaPacient.setForeground(Color.white);
        
        insertTratament.setFont(new Font("Arial",Font.PLAIN,18));
        insertTratament.setBackground(culoarebuton);
        insertTratament.setForeground(Color.white);

        cerereLaborator.setFont(new Font("Arial",Font.PLAIN,18));
        cerereLaborator.setBackground(culoarebuton);
        cerereLaborator.setForeground(Color.white);

        cerereMedicamente.setFont(new Font("Arial",Font.PLAIN,18));
        cerereMedicamente.setBackground(culoarebuton);
        cerereMedicamente.setForeground(Color.white);

        fisaExternare.setFont(new Font("Arial",Font.PLAIN,18));
        fisaExternare.setBackground(culoarebuton);
        fisaExternare.setForeground(Color.white);
        
        modificaPacient.setFont(new Font("Arial",Font.PLAIN,18));
        modificaPacient.setBackground(culoarebuton);
        modificaPacient.setForeground(Color.white);

        istoric.setFont(new Font("Arial",Font.PLAIN,18));
        istoric.setBackground(culoarebuton);
        istoric.setForeground(Color.white);

        cautarePacient.setFont(new Font("Arial",Font.PLAIN,18));
        cautarePacient.setBackground(culoarebuton);
        cautarePacient.setForeground(Color.white);
        
        setLayout(layout); 
        add(cautarePacient);
        add(insertPacient);
        add(showRegistru);
        add(showSectii);
        add(insertConsult);
        add(adaugaRegistru);
       add(showAnalize);
       add(showPacienti);
      add(insertTratament);   
      add(cerereLaborator);
      add(showConsult);
      add(showTratament);
      add(adaugaIntertnare);
      add(adaugaFisaPacient);
      add(showExternari);
      add(showInternare); 
      add(fisaExternare);
      add(modificaPacient);
      add(showFisaPacient);
      add(showIstoric);
      add(istoric); 
      add(cerereMedicamente);
      add(showProduse);
      add(logOut);
        
    }

    public void addInsertPacientListener(ActionListener actionListener) {
        insertPacient.addActionListener(actionListener);
    }

    public void addInsertConsultListener(ActionListener actionListener) {
        insertConsult.addActionListener(actionListener);
    }

    public void addAdaugaRegistruListener(ActionListener actionListener) {
        adaugaRegistru.addActionListener(actionListener);
    }

    public void addAdaugaInternareListener(ActionListener actionListener) {
        adaugaIntertnare.addActionListener(actionListener);
    }

    public void addAdaugaFisaPacient(ActionListener actionListener) {
        adaugaFisaPacient.addActionListener(actionListener);
    }

    public void addInsertTratament(ActionListener actionListener) {
        insertTratament.addActionListener(actionListener);
    }

    public void addCerereLaboratorListener(ActionListener actionListener) {
        cerereLaborator.addActionListener(actionListener);
    }

    public void addCerereMedicamenteListener(ActionListener actionListener) {
        cerereMedicamente.addActionListener(actionListener);
    }

    public void addFisaExternareListener(ActionListener actionListener) {
        fisaExternare.addActionListener(actionListener);
    }

    public void addModificaPacientListener(ActionListener actionListener) {
        modificaPacient.addActionListener(actionListener);
    }

    public void addIstoricListener(ActionListener actionListener) {
        istoric.addActionListener(actionListener);
    }

    public void addCautarePacient(ActionListener actionListener) {
        cautarePacient.addActionListener(actionListener);
    }

    public void  addShowPacient(ActionListener actionListener) {
        showPacienti.addActionListener(actionListener);
    }

    public void addShowRegistru(ActionListener actionListener) {
        showRegistru.addActionListener(actionListener);
    }

    public void addShowConsult(ActionListener actionListener) {
        showConsult.addActionListener(actionListener);
    }

    public void addShowInternare(ActionListener actionListener) {
        showInternare.addActionListener(actionListener);
    }

    public void addShowFisaPacient(ActionListener actionListener) {
        showFisaPacient.addActionListener(actionListener);
    }

    public void addShowAnalize(ActionListener actionListener) {
        showAnalize.addActionListener(actionListener);
    }

    public void addShowTratament(ActionListener actionListener) {
        showTratament.addActionListener(actionListener);
    }

    public void addShowExternari(ActionListener actionListener) {
        showExternari.addActionListener(actionListener);
    }

    public void addShowIstoric(ActionListener actionListener) {
        showIstoric.addActionListener(actionListener);
    }

    public void addShowProduse(ActionListener actionListener) {
        showProduse.addActionListener(actionListener);
    }

    public void addShowSecii(ActionListener actionListener) {
        showSectii.addActionListener(actionListener);
    }

    public void addLogOut(ActionListener actionListener) { logOut.addActionListener(actionListener);}
}
