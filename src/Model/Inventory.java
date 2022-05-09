package Model;

public class Inventory {
    private int id;
    private Boolean isConsumable;
    private String name;
    private int stock;

    // Constructor
    public Inventory(){

    }

    public Inventory(int id, Boolean consumable, String name, int stock){
        this.id = id;
        this.isConsumable = consumable;
        this.name = name;
        this.stock = stock;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getConsumable() {
        return isConsumable;
    }

    public void setConsumable(Boolean consumable) {
        isConsumable = consumable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
