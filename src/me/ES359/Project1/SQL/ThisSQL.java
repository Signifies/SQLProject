package me.ES359.Project1.SQL;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by ES359 on 11/25/14.
 */
public class ThisSQL {

    public Connection connection;

       public ThisSQL(String ip, String userName, String pass, String db) {
           try {
               Class.forName("com.mysql.jdbc.Driver");
               connection = DriverManager.getConnection("jdbc:mysql://" +ip + "/" + db + "?user=" + userName + "&password=" + pass);
           }catch (Exception e) {
               e.printStackTrace();

           }
      }
}
