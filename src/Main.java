import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Массив с продуктами
        String[] products = {"Replit", "IDEA", "GitHuB"};
        int [] price = {300, 2000, 2200};

        // Массив для хранения количества выбранных товаров
        int[] selectedProducts = new int[products.length];

        //Переменная для суммы продуктов
        int sumProducts = 0;

        System.out.println("Список возможных товаров для покупки:");

        //Выводим массив
        for (int i = 0; i < products.length; i++){
            System.out.printf("%d. %s %d руб/шт%n", i + 1, products[i], price[i]);
        }

        //Действия с товарами
        while (true) {
            System.out.print("Введите номер продукта (или 'end' для завершения): ");
            String inputString = scanner.nextLine();

            if (inputString.equals("end")) {
                break;
            }

            try {
                int productNumber = Integer.parseInt(inputString) - 1; // Приведение к индексу массива
                if (productNumber < 0 || productNumber >= products.length) { // Исправлено условие
                    System.out.println("Некорректный номер продукта. Попробуйте снова.");
                    continue;
                }

                System.out.print("Введите количество: ");
                int productCount = Integer.parseInt(scanner.nextLine());

                if (productCount <= 0) {
                    System.out.println("Количество должно быть положительным. Попробуйте снова.");
                    continue;
                }

                // Сохраняем количество выбранного товара
                selectedProducts[productNumber] += productCount;
                // Обновляем общую сумму
                sumProducts += price[productNumber] * productCount;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Введите число");
            }

            //Выводим корзину с покупками и итоговую сумму
            System.out.println("\nКорзина с покупками:");
            for (int i = 0; i < products.length; i++) {
                if (selectedProducts[i] > 0) {
                    System.out.printf("%s: %d шт. по %d руб/шт, итого: %d руб%n",
                            products[i], selectedProducts[i], price[i],
                            selectedProducts[i] * price[i]);
                }
            }
        }


        System.out.printf("Итоговая сумма: %d руб%n", sumProducts);

        scanner.close();
    }
}