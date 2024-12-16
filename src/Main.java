import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Массив с продуктами
        String[] products = {"Replit", "IDEA", "GitHuB"};
        int [] price = {300, 2000, 2200};

        System.out.println("Список возможных товаров для покупки:");

        //Выводим массив
        for (int i = 0; i < products.length; i++){
            System.out.printf("%d. %s %d руб/шт%n", i + 1, products[i], price[i]);
        }




    }
}