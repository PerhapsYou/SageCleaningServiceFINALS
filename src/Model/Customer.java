package Model;

public class Customer {
    private int id;
    private String name;
    private int accountNo;

    // Constructor
    public Customer(){

    }

    public Customer(int id, String name, int aNo){
        this.id = id;
        this.name = name;
        this.accountNo = aNo;
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

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
}
