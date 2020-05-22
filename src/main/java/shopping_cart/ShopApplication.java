package shopping_cart;

import java.util.Scanner;

public class ShopApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Cart myCart = new Cart();

        System.out.println("Enter the name of the item:");
        String newItemName = input.nextLine();

        System.out.println("Enter the quantity:");
        int newItemQuantity = input.nextInt();

        System.out.println("Enter the unit price:");
        int newItemPrice = input.nextInt();

        myCart.getTotalItems(new Item(newItemName, newItemQuantity, newItemPrice));
        System.out.println("Current Cart");

        myCart.showCart();
        input.nextLine();
        System.out.println("Continue shopping (y/n)?");
        String shoppingOption = input.nextLine();

        while (!shoppingOption.equals("n")) {
            if (shoppingOption.equals("y")) {
                System.out.println("Enter the name of the item:");
                String newItemName2 = input.nextLine();
                System.out.println("Enter the quantity:");
                int newItemQuantity2 = input.nextInt();
                System.out.println("Enter the unit price:");
                int newItemPrice2 = input.nextInt();
                myCart.getTotalItems(new Item(newItemName, newItemQuantity, newItemPrice));
            }

        }
    }
}

