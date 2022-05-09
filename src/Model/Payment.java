package Model;

import java.sql.Date;

public class Payment {
    private int transactionNumber;
    private int customerID;
    private int jobID;
    private Date paymentDate;
    private double amount;
    private int paymentMethodID;
    private String orderDetails;
    private String status;

    // Constructor
    public Payment(){

    }

    public Payment(int tNo, int cID, int jID, Date pDate, double amount,
                   int pMID, String oDetails, String status)
    {
        this.transactionNumber = tNo;
        this.customerID = cID;
        this.jobID = jID;
        this.paymentDate = pDate;
        this.amount = amount;
        this.paymentMethodID = pMID;
        this.orderDetails = oDetails;
        this.status = status;
    }

    // Getters and Setters
    public int getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getPaymentMethodID() {
        return paymentMethodID;
    }

    public void setPaymentMethodID(int paymentMethodID) {
        this.paymentMethodID = paymentMethodID;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
