package Controler;

import Model.Account;
import Model.Customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
    
    public static void addAccount(Account newAcc){
        PreparedStatement ps;
        String statement = "INSERT INTO Account(account_no, contact_number, email, password, address, " +
                "account_type) VALUES( ?, ?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(statement);
            ps.setString(1,JavaPB.userInfo.get(0));
            ps.setString(2,JavaPB.userInfo.get(1));
            ps.setString(3,JavaPB.userInfo.get(2));
            ps.setString(4,JavaPB.userInfo.get(3));
            ps.setString(5,JavaPB.userInfo.get(4));
            ps.setString(6,JavaPB.userInfo.get(5));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void addCustomer(Customer customerAcc){
        PreparedStatement ps;
        String statement = "INSERT INTO Customer(customer_no, customer_name, account_no)" +
                "VALUES( ?, ?, ?)";

        try {
            ps = con.prepareStatement(statement);
            ps.setString(1,JavaPB.userInfo.get(6));
            ps.setString(2,JavaPB.userInfo.get(7));
            ps.setString(3,JavaPB.userInfo.get(0));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    // More methods... Getters and setters of data etc..
}
