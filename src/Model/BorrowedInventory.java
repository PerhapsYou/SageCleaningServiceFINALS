package Model;

public class BorrowedInventory {
    private int id;
    private String name;
    private int qtyBorrowed;
    private int assignedEmployeeID;

    // Constructor
    public BorrowedInventory(){

    }

    public BorrowedInventory(int id, String name, int qBorrowed, int aEID){
        this.id = id;
        this.name = name;
        this.qtyBorrowed = qBorrowed;
        this.assignedEmployeeID = aEID;
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

    public int getQtyBorrowed() {
        return qtyBorrowed;
    }

    public void setQtyBorrowed(int qtyBorrowed) {
        this.qtyBorrowed = qtyBorrowed;
    }

    public int getAssignedEmployeeID() {
        return assignedEmployeeID;
    }

    public void setAssignedEmployeeID(int assignedEmployeeID) {
        this.assignedEmployeeID = assignedEmployeeID;
    }
}
