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
            ps.setString(1,String.valueOf(newAcc.getAccountNo())); // Latest account_no + 1
            ps.setString(2,String.valueOf(newAcc.getContactNo()));
            ps.setString(3,newAcc.getEmail());
            ps.setString(4,newAcc.getPassword());
            ps.setString(5,newAcc.getAddress());
            ps.setString(6,newAcc.getAccountType());
        }  catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void addCustomer(Customer customerAcc){
        PreparedStatement ps;
        String statement = "INSERT INTO Customer(customer_no, customer_name, account_no)" +
                "VALUES( ?, ?, ?)";

        try {
            ps = con.prepareStatement(statement);
            ps.setString(1,String.valueOf(customerAcc.getId())); // Latest customer_no + 1
            ps.setString(2,customerAcc.getName());
            ps.setString(3,String.valueOf(customerAcc.getAccountNo())); // Latest account_no + 1
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void addJobOrder(JobOrder newJobOrder){
        PreparedStatement ps;
        String statement = "INSERT INTO JOB_ORDERS(job_id, service_id, customer_id, date_of_order, scheduled_date," +
                "clock_in, clock_out, total_hours, location, job_description, pay_status, job_status, em_id, b_id)"+
                "VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(statement);
            ps.setString(1, String.valueOf(newJobOrder.getId()));
            ps.setString(2, String.valueOf(newJobOrder.getServiceID()));
            ps.setString(3, String.valueOf(newJobOrder.getCustomerID()));
            ps.setString(4, String.valueOf(newJobOrder.getDateOrdered()));
            ps.setString(5, String.valueOf(newJobOrder.getScheduledDate()));
            ps.setString(6,newJobOrder.getClockIn().toString());
            ps.setString(7,newJobOrder.getClockOut().toString());
            ps.setString(8,newJobOrder.getTotalHours().toString());
            ps.setString(9,newJobOrder.getLocation());
            ps.setString(10,newJobOrder.getDescription());
            ps.setString(11,newJobOrder.getPaymentStatus());
            ps.setString(12, String.valueOf(newJobOrder.getEmployeeID()));
            ps.setString(13, String.valueOf(newJobOrder.getbID()));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    // A method that retrieves the latest job_id + 1
    // A method that retieves the latest account_no + 1
    // A method that retrieves the lastest customer_no + 1 
    // A method that retrieves the employees who are currently available
    // A method that retrieves the entire data of the job order from the data base. This takes in the job Id entered by the user.
    // A method that retrieves the entire data of the job order from the data base that the em_id mathes with the current employee logged in.
    /** A method that compares the user typed username and password if there is a valid account.
    *    if valid and a customer then it retrieves the users current customer_no
    *    if valid and a employee then it retrieves the users current employee_id
    *       the id/no will be added to loggedInUserDetails(2).
    */
    
    // A method that takes a service string and returns the respective service ID
    /** A method that if the account is a customer the details then get added to the userInfo arrayList
    *   userInfo = account_no(0), contact_no(1), email(2), password(3), address(4), account_type(5), customer_no(6), customer_name(7);
    */
    
    // NOTE: You can add anything that you deem necessary but please add a comment as to what they do or is linked to
   
}
