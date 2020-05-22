package shopping_cart;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartTest {


    @Test
    public void ShouldAddItemAfterUserInput() {
        Cart underTest = new Cart();
        Item itemTest = new Item("Shirt", 1, 25);
        underTest.addItem(itemTest);
        int newItemQuantity = 1;
        String newItemName = "Shirt";
        int newItemPrice = 25;
        int check = underTest.getTotalItems(new Item(newItemName, newItemQuantity, newItemPrice));
        assertEquals(1, check);
    }

    @Test
    public void ShouldRemoveItemAfterNameGiven() {
        Cart underTest = new Cart();
        Item itemTest = new Item("Shirt", 1, 25);
        underTest.removeItem(itemTest);
        String newItemName = "Shirt";
        int newItemQuantity = 0;
        int newItemPrice = 0;
        int check = underTest.getTotalItems(new Item(newItemName, newItemQuantity, newItemPrice));
        assertEquals(0, check);
    }

}

