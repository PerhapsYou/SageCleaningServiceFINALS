package Model;

import java.sql.Date;

public class Employee {
    private int id;
    private String name;
    private String job;
    private String status;
    private Date dateHired;
    private Date dateQuit;
    private int accountNo;
    private int bID;

    // Constructor
    public Employee(){

    }

    public Employee(int id, String name, String job, String status, Date dHired,
                    Date dQuit, int aNo, int bID)
    {
        this.id = id;
        this.name = name;
        this.job = job;
        this.status = status;
        this.dateHired = dHired;
        this.dateQuit = dQuit;
        this.accountNo = aNo;
        this.bID = bID;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public Date getDateQuit() {
        return dateQuit;
    }

    public void setDateQuit(Date dateQuit) {
        this.dateQuit = dateQuit;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getbID() {
        return bID;
    }

    public void setbID(int bID) {
        this.bID = bID;
    }
}
