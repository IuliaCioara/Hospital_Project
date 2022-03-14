package Proiect;

import javax.swing.*;
import java.sql.*;

/////// Cream conexiunea la baza de date (ne conectam prin intermediul utilizatorilor) ///////

public class DatabaseConnectionController {
    private Connection connection;
	private String url = "jdbc:mysql://localhost/hospital";
	private	String user = "root";
	private	String password = "root";
	

    public DatabaseConnectionController() { loadDriver(); }

    public void loadDriver() {
        try {
            Class.forName("java.sql.Driver");
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Connection driver loading failed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void connectToDatabaseAsAdmin() {
        try {
        	connection = DriverManager.getConnection(url, user , password);
           // connection = DriverManager.getConnection("jdbc:mysql://localhost/hospital?user=admin&password=&noAccessToProcedureBodies=true","root","");
        }
        
        catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Establising database connection failed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void connectToDatabaseAsAsistenta() {
        try {
        	connection = DriverManager.getConnection(url, user , password);
           // connection = DriverManager.getConnection("jdbc:mysql://localhost/hospital?user=asistenta&password=&noAccessToProcedureBodies=true","root","");
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Establising database connection failed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void connectToDatabaseAsBiolog() {
        try {
        	connection = DriverManager.getConnection(url, user , password);
            //connection = DriverManager.getConnection("jdbc:mysql://localhost/hospital?user=biolog&password=&noAccessToProcedureBodies=true","root","");
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Establising database connection failed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void deconnectFromDatabase() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Closing database connection failed", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * @return conexiune la baza de date.
     */
    public Connection getConnection() {
        return connection;
    }
}
