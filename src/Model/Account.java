package Model;

public class Account {
    private int accountNo;
    private int contactNo;
    private String email;
    private String password;
    private String address;
    private String accountType;

    // Constructor
    public Account(){

    }

    public Account(int aNo, int cNo, String email, String pass, String aType){
        this.accountNo = aNo;
        this.contactNo = cNo;
        this.email = email;
        this.password = pass;
        this.accountType = aType;
    }

    // Getters and Setters
    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    Public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
