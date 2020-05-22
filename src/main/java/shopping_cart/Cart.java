package shopping_cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Item> cart = new ArrayList<>();

    public void addItem(Item item) {
        cart.add(item);
    }

    public int getTotalItems(Item item) {
        int items = 0;
        for (Item cart : cart) {
            items += cart.getNumOfItems();
        }
        return items;
    }

    public void removeItem(Item item) {
        cart.remove(item);
    }

    public void showCart() {
        for(Item item: cart){
            System.out.println("Item: " + item.getItemName() +  "  Quantity: " + item.getItemQuantity() + "  Price: " + item.getItemPrice());
        }
    }


}



