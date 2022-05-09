package Controler;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataPB {
    private static Connection con;

    private DataPB(){

    }

    public static void setCon() {
        try {
            String conStr = ""; //"Source"; TBD
            con = DriverManager.getConnection(conStr);
        } catch (Exception e){
            System.out.println("No such connection try again..");
        }
    }

    // More methods... Getters and setters of data etc..
}
