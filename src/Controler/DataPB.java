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
    
    public static void addJobOrder(Account newAcc){
        PreparedStatement ps;
        String statement = "INSERT INTO JOB_ORDERS(job_id, service_id, customer_id, date_of_order, scheduled_date, request_id" +
                "clock_in, clock_out, total_hours, location, job_description, pay_status, job_status, em_id, b_id) +
                "VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(statement);
            ps.setString(1,JavaPB.orderInfo.get(0)); 
            ps.setString(2,JavaPB.orderInfo.get(1));
            ps.setString(3,JavaPB.orderInfo.get(2));
            ps.setString(4,JavaPB.orderInfo.get(3));
            ps.setString(5,JavaPB.orderInfo.get(4));
            ps.setString(6,JavaPB.orderInfo.get(5));
            ps.setString(7,JavaPB.orderInfo.get(6));
            ps.setString(8,JavaPB.orderInfo.get(7));
            ps.setString(9,JavaPB.orderInfo.get(8));
            ps.setString(10,JavaPB.orderInfo.get(9));
            ps.setString(11,JavaPB.orderInfo.get(10));
            ps.setString(12,JavaPB.orderInfo.get(11));
            ps.setString(13,JavaPB.orderInfo.get(12));
            ps.setString(14,JavaPB.orderInfo.get(13));
            ps.setString(15,JavaPB.orderInfo.get(14));
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
            ps.setString(1,JavaPB.userInfo.get(6)); // Latest customer_no + 1
            ps.setString(2,JavaPB.userInfo.get(7));
            ps.setString(3,JavaPB.userInfo.get(0)); // Latest account_no + 1
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    // A method that retrieves the latest job_id + 1
    // A method that retieves the latest account_no + 1
    // A method that retrieves the lastest customer_no + 1 
    // A method that retrieves the users current customer_no
    // A method that retrieves the employees who are currently available
    // A method that retrieves the entire data of the job order from the data base. This takes in the job Id entered by the user.
    // A method that compares the user typed username and password if there is a valid account with that.
    // A method that takes a service string and returns the respective service ID
    /** A method that if the account is a customer the details then get added to the userInfo arrayList
    *   userInfo = account_no(0), contact_no(1), email(2), password(3), address(4), account_type(5), customer_no(6), customer_name(7);
    */
   
}
