package lu;

import java.sql.*;

/**
 * Hello world!
 */
public final class App {

    public static void main(String[] args) {
        
        try {
            
            Class.forName("org.sqlite.JDBC");
            System.out.println("Ok");
            Connection con = DriverManager.getConnection("jdbc:sqlite:./my.db");
            System.out.println("Ok");
            // DriverManager.registerDriver(new JDBC());
        } catch (Exception e) {
            e.printStackTrace();;
        }
        // DriverManager.registerDriver(new JDBC());
        // try () {
        //     System.out.println("Ok");
        // } catch (SQLException e1) {
        //     e1.printStackTrace();
        // }
    }   
}

