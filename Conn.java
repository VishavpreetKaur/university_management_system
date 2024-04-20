package university_management_system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    Conn () {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem", "root", "vishu");
            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}