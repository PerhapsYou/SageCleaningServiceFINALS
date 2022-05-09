package Model;

import java.sql.Date;
import java.sql.Time;


public class JobOrder {
    private int id;
    private int serviceID;
    private int customerID;
    private Date dateOrdered;
    private int scheduledDateReqID;
    private Time clockIn;
    private Time clockOut;
    private Time totalHours;
    private String location;
    private String description;
    private String paymentStatus;
    private int employeeID;
    private int bID;

    // Constructor
    public JobOrder(){

    }

    public JobOrder(int id, int sID, int cID, Date dOrdered, int schedDate,
                    Time cIn, Time cOut, Time totalHours, String location,
                    String description, String pStatus, int eID, int bID)
    {
        this.id = id;
        this.serviceID = sID;
        this.customerID = cID;
        this.dateOrdered = dOrdered;
        this.scheduledDateReqID = schedDate;
        this.clockIn = cIn;
        this.clockOut = cOut;
        this.totalHours = totalHours;
        this.location = location;
        this.description = description;
        this.paymentStatus = pStatus;
        this.employeeID = eID;
        this.bID = bID;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Date getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public int getScheduledDateReqID() {
        return scheduledDateReqID;
    }

    public void setScheduledDateReqID(int scheduledDateReqID) {
        this.scheduledDateReqID = scheduledDateReqID;
    }

    public Time getClockIn() {
        return clockIn;
    }

    public void setClockIn(Time clockIn) {
        this.clockIn = clockIn;
    }

    public Time getClockOut() {
        return clockOut;
    }

    public void setClockOut(Time clockOut) {
        this.clockOut = clockOut;
    }

    public Time getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(Time totalHours) {
        this.totalHours = totalHours;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getbID() {
        return bID;
    }

    public void setbID(int bID) {
        this.bID = bID;
    }
}
