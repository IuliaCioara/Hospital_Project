package Proiect;

import javax.swing.*;
import java.sql.*;

/////// In clasa DatabaseLogicController realizam apelurile apelurile de proceduri si vizualizari din baza de date si preluam rezultatele ///////

public class DatabaseLogicController {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private CallableStatement callableStatement;

    public DatabaseLogicController(Connection connection) throws SQLException {
        this.connection = connection;
    }

    //Verificam ID-ul si parola pentru admin//

    public boolean verifyLogInConditionsAsAdmin(String email, String password) {
        if ((email.equals("admin") && (password.equals("admin")))) {
            return true;
        }
        return false;
    }

    //Verificam ID-ul si parola pentru asistenta//

    public boolean verifyLogInConditionsAsAsistenta(String email, String password) {
        if ((email.equals("asistenta") && (password.equals("asistenta")))) {
            return true;
        }
        return false;
    }

    //Verificam ID-ul si parola pentru biolog//

    public boolean verifyLogInConditionsAsBiolog(String email, String password) {
        if ((email.equals("biolog") && (password.equals("biolog")))) {
            return true;
        }
        return false;
    }

    public String insertNewPacient(String CNP, String nume, String data_n, String profesie, String adresa, String telefon, String grup_sangvin, boolean asigurat, String sex, String provenienta, String categorie) {
        String result = new String();
       try {
           callableStatement = connection.prepareCall("{call Adauga_Pacient(?,?,?,?,?,?,?,?,?,?,?)}");
           callableStatement.setString(1, CNP);
           callableStatement.setString(2, nume);
           callableStatement.setString(3, data_n);
           callableStatement.setString(4, profesie);
           callableStatement.setString(5, adresa);
           callableStatement.setString(6, telefon);
           callableStatement.setString(7, grup_sangvin);
           callableStatement.setBoolean(8, asigurat);
           callableStatement.setString(9, sex);
           callableStatement.setString(10, provenienta);
           callableStatement.setString(11, categorie);
           callableStatement.execute();

           resultSet = callableStatement.getResultSet();
           while (callableStatement.getMoreResults()) {
               resultSet = callableStatement.getResultSet();
               resultSet.next();
               result = resultSet.getString(1);
               System.out.println(result);
           }

       }
       catch (SQLException e) {
           result="eroare";
           JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
       }
       return result;
    }

    public boolean insertNewConsult(int idSectie, String medic, String tipTrimitere, String tipConsult, String Diagnostic, String Decizie) {
        try {
            callableStatement = connection.prepareCall("{call Creare_Consult(?,?,?,?,?,?)}");
            callableStatement.setInt(1, idSectie);
            callableStatement.setString(2, medic);
            callableStatement.setString(3, tipTrimitere);
            callableStatement.setString(4, tipConsult);
            callableStatement.setString(5, Diagnostic);
            callableStatement.setString(6, Decizie);
            callableStatement.execute();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean insertNewRegistru(int parafa) {
        try {
            callableStatement = connection.prepareCall("{call Adauga_Registru(?)}");
            callableStatement.setInt(1, parafa);
            callableStatement.execute();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean insertUpdateRegistru(int parafa) {
        try {
            callableStatement = connection.prepareCall("{call Update_Registru(?)}");
            callableStatement.setInt(1, parafa);
            callableStatement.execute();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean insertNewInternare(String tipInternare, String motivInternare) {
        try {
            callableStatement = connection.prepareCall("{call Creare_internare(?,?)}");
            callableStatement.setString(1, tipInternare);
            callableStatement.setString(2, motivInternare);
            callableStatement.execute();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean insertNewFisaPacient(float temp, String tens, int puls, String evolutie) {
        try {
            callableStatement = connection.prepareCall("{call Creare_fisaPacient(?,?,?,?)}");
            callableStatement.setFloat(1, temp);
            callableStatement.setString(2, tens);
            callableStatement.setInt(3, puls);
            callableStatement.setString(4, evolutie);
            callableStatement.execute();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean insertNewTratament(String DenumireMedicament, String DenumireSanitar) {
        try {
            callableStatement = connection.prepareCall("{call Creare_tratament(?,?)}");
            callableStatement.setString(1, DenumireMedicament);
            callableStatement.setString(2, DenumireSanitar);
            callableStatement.execute();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public String insertNewCerereMedicament(int idTratament, int cantitate) {
        String result = new String();
        try {
            callableStatement = connection.prepareCall("{call Cerere_medicament(?,?)}");
            callableStatement.setInt(1, idTratament);
            callableStatement.setInt(2, cantitate);
            callableStatement.execute();

            resultSet = callableStatement.getResultSet();
            while (callableStatement.getMoreResults()) {
                resultSet = callableStatement.getResultSet();
                resultSet.next();
                result = resultSet.getString(1);
            }
            System.out.println(result);

        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

    public String newCerereLaborator(int nrFisa, String prioritate, String tip) {
        String result = new String();
        try {
            callableStatement = connection.prepareCall("{call Creare_Cerere_Laborator(?,?,?)}");
            callableStatement.setInt(1, nrFisa);
            callableStatement.setString(2, prioritate);
            callableStatement.setString(3, tip);
            callableStatement.execute();

            resultSet = callableStatement.getResultSet();
            if (callableStatement.getMoreResults()) {
                resultSet = callableStatement.getResultSet();
                resultSet.next();
                result = resultSet.getString(1);
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
        finally {
            return result;
        }
    }

    public boolean newBuletinAnalize(String numeBiolog, String Evaluarea_Calitatii, String Rezultat, String Observatii, int Pret) {
        try {
            callableStatement = connection.prepareCall("{call Creare_Buletin_Analize(?,?,?,?,?)}");
            callableStatement.setString(1, numeBiolog);
            callableStatement.setString(2, Evaluarea_Calitatii);
            callableStatement.setString(3, Rezultat);
            callableStatement.setString(4, Observatii);
            callableStatement.setInt(5, Pret);
            callableStatement.execute();
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        finally {
            return true;
        }
    }

    public String newFisaExternare(int nrFisa, String epicriza, String recomandari) {
        String result = new String();
        try {
            callableStatement = connection.prepareCall("{call Creare_Fisa_Externare(?,?,?)}");
            callableStatement.setInt(1, nrFisa);
            callableStatement.setString(2, epicriza);
            callableStatement.setString(3, recomandari);
            callableStatement.execute();

            resultSet = callableStatement.getResultSet();
            if (callableStatement.getMoreResults()) {
                resultSet = callableStatement.getResultSet();
                resultSet.next();
                result = resultSet.getString(1);
            }
        }
        catch (SQLException e) {
            result = "Eroare!";
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
        finally {
            return result;
        }
    }

    public String newModificaPacient(int nrfisa, float temp, String tens, int puls, String evolutie) {
        String result = new String();
        try {
            callableStatement = connection.prepareCall("{call Modifica_Pacient(?,?,?,?,?)}");
            callableStatement.setInt(1, nrfisa);
            callableStatement.setFloat(2, temp);
            callableStatement.setString(3, tens);
            callableStatement.setInt(4, puls);
            callableStatement.setString(5, evolutie);
            callableStatement.execute();

            resultSet = callableStatement.getResultSet();
            if (callableStatement.getMoreResults()) {
                resultSet = callableStatement.getResultSet();
                resultSet.next();
                result = resultSet.getString(1);
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
        finally {
            return result;
        }
    }

    public boolean newIstoric(String CNP) {
        try {
            callableStatement = connection.prepareCall("{call Istoric_Pacient(?)}");
            callableStatement.setString(1, CNP);
            callableStatement.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public String newModificarePaturi(int id, int nrpaturi) {
        String result = new String();
        try {
            callableStatement = connection.prepareCall("{call Modificare_NrPaturi(?,?)}");
            callableStatement.setInt(1, id);
            callableStatement.setInt(2, nrpaturi);
            callableStatement.execute();

            resultSet = callableStatement.getResultSet();
            if (callableStatement.getMoreResults()) {
                resultSet = callableStatement.getResultSet();
                resultSet.next();
                result = resultSet.getString(1);
            }
        }
        catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
            return result;
    }

    public String newModificarePret(int id, int pret) {
        String result = new String();
        try {
            callableStatement = connection.prepareCall("{call Modificare_Pret_medicamente(?,?)}");
            callableStatement.setInt(1, id);
            callableStatement.setInt(2, pret);
            callableStatement.execute();

            resultSet = callableStatement.getResultSet();
            if (callableStatement.getMoreResults()) {
                resultSet = callableStatement.getResultSet();
                resultSet.next();
                result = resultSet.getString(1);
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
        finally {
            return result;
        }
    }

    public ResultSet cautarePacient(String CNP) {
        String result = new String();
        try {
            callableStatement = connection.prepareCall("{call Cautare_Pacient(?)}");
            callableStatement.setString(1, CNP);
            callableStatement.execute();
            resultSet = callableStatement.getResultSet();

            resultSet = callableStatement.getResultSet();
            if (callableStatement.getMoreResults()) {
                resultSet = callableStatement.getResultSet();
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
        finally {
            return resultSet;
        }
    }

    public ResultSet showPacientiInfo() {
        String query="select * from Vizualizare_Pacienti;";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Show information query failed!", null,
                    JOptionPane.ERROR_MESSAGE);
        }
        return resultSet;
    }

    public ResultSet showConsultInfo() {
        String query="select * from Vizualizare_Consult;";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Show information query failed!", null,
                    JOptionPane.ERROR_MESSAGE);
        }
        return resultSet;
    }

    public ResultSet showInternariInfo() {
        String query="select * from Vizualizare_Internare;";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Show information query failed!", null,
                    JOptionPane.ERROR_MESSAGE);
        }
        return resultSet;
    }

    public ResultSet showFisaPacientInfo() {
        String query="select * from Vizualizare_FisaPacient;";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Show information query failed!", null,
                    JOptionPane.ERROR_MESSAGE);
        }
        return resultSet;
    }

    public ResultSet showSectiiInfo() {
        String query="select * from Vizualizare_Sectii;";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Show information query failed!", null,
                    JOptionPane.ERROR_MESSAGE);
        }
        return resultSet;
    }

    public ResultSet showAnalizeInfo() {
        String query="select * from Vizualizare_Buletinanalize;";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Show information query failed!", null,
                    JOptionPane.ERROR_MESSAGE);
        }
        return resultSet;
    }

    public ResultSet showTratamentInfo() {
        String query="select * from Vizualizare_Tratament;";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Show information query failed!", null,
                    JOptionPane.ERROR_MESSAGE);
        }
        return resultSet;
    }

    public ResultSet showProduseInfo() {
        String query="select * from Vizualizare_Produse;";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Show information query failed!", null,
                    JOptionPane.ERROR_MESSAGE);
        }
        return resultSet;
    }

    public ResultSet showExternariInfo() {
        String query="select * from Vizualizare_FisaExternare;";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Show information query failed!", null,
                    JOptionPane.ERROR_MESSAGE);
        }
        return resultSet;
    }

    public ResultSet showIstoricInfo() {
        String query="select * from Vizualizare_IstoricPacient;";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Show information query failed!", null,
                    JOptionPane.ERROR_MESSAGE);
        }
        return resultSet;
    }

    public ResultSet showRegistruInfo() {
        String query="select * from Vizualizare_Registru;";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Show information query failed!", null,
                    JOptionPane.ERROR_MESSAGE);
        }
        return resultSet;
    }

    public ResultSet showCerereLaboratorInfo() {
        String query="select * from Vizualizare_CerereLaborator;";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        }
        catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Show information query failed!", null,
                    JOptionPane.ERROR_MESSAGE);
        }
        return resultSet;
    }
}



