import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] newPrices = new int[]{100, 200, 300, 150};
        String[] newProducts = new String[]{"Хлеб", "Яблоки", "Молоко", "Сыр"};
        Basket basket = new Basket(newPrices, newProducts);
        basket.addToCart(3, 7);
        basket.addToCart(0, 4);

        basket.printCart();

        File file = new File("basket.txt");
        basket.saveTxt(new File("basket.txt"));
        basket.addToCart(2, 6);
        basket.saveTxt(new File("basket.txt"));
        Basket newBasket = Basket.loadFromTxtFile(file);

        newBasket.printCart();


    }
}