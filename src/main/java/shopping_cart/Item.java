package shopping_cart;

public class Item {

    private String itemName;
    private int itemQuantity;
    private int itemPrice;

    public Item(String localItemName, int localItemQuantity, int localItemPrice) {
        this.itemName = localItemName;
        this.itemQuantity = localItemQuantity;
        this.itemPrice = localItemPrice;
    }

    public int getNumOfItems() {
        return this.itemQuantity;
    }

    public String getItemName() {
        return this.itemName;
    }

    public int getItemPrice() {
        return this.itemPrice;
    }

    public int getItemQuantity() {
        return this.itemQuantity;
    }
}






