package lu;

import java.sql.*;

/**
 * Hello world!
 */
public final class App {

    public static void main(String[] args) {
        
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (Exception e) {
            e.printStackTrace();;
        }
            
        try (Connection con = DriverManager.getConnection("jdbc:sqlite:./my.db")) {
            
            try (Statement statement = con.createStatement()){
                String query = "ALTER TABLE users ADD surname TXT;";
                statement.executeUpdate(query);
                System.out.println("OK");
            } 
            
        } catch (SQLException e){
            e.printStackTrace();
        }
    }   
}

