import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int[] newPrices = new int[]{100, 200, 300, 150};
        String[] newProducts = new String[]{"Хлеб", "Яблоки", "Молоко", "Сыр"};
        Basket basket = new Basket(newPrices, newProducts);
        basket.addToCart(3, 7);
        basket.addToCart(0, 4);

        basket.printCart();
        basket.saveBin(new File("basket.bin"), basket);
        basket.addToCart(2, 6);
        basket.printCart();
        Basket newBasket = Basket.loadFromBin(new File("basket.bin"));
        newBasket.printCart();


    }
}