package me.ES359.Project1;

import me.ES359.Project1.SQL.ThisSQL;

import java.sql.SQLException;

/**
 * Created by ES359 on 11/25/14.
 */
public class Main {

    private static ThisSQL sql;

    public static void main(String args[]) {

         try {
            sql = new ThisSQL("198.23.148.50", "mc_66881", "2k0kz585om ", "mc_66861");
             System.out.println("Connection is Correct!");
         }catch (Exception se) {
             se.printStackTrace();
         }
    }
}

