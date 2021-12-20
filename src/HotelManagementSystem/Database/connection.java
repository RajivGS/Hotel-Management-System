package HotelManagementSystem.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connection {

    Connection c;
    public Statement s;

    public connection() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
             c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms", "root", "");
            //c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms?autoReconnect = true&useSSL=false", "root",
            //        "");
            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
