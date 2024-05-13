import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Вас вітає магазин продуктів! \nвкажіть товари та годину придбання які ви хочете придбати (3 товари)\n");

        System.out.println("Введіть час (у форматі години:хвилини): ");
        String timeTest = scanner.nextLine();

        System.out.println("перший товар: ");
        String productName1 = scanner.nextLine();

        System.out.println("другий товар: ");
        String productName2 = scanner.nextLine();

        System.out.println("третій товар: ");
        String productName3 = scanner.nextLine();

        Item item = new Item(productName1, productName2, productName3);
        Shop shop = new Shop(timeTest);
        Delivery delivery = new Delivery("20:00", shop.getTime());

        delivery.productPresent("морозиво", shop);
        System.out.println("|||||||||||||||||||||");
        item.checkProduct(delivery, productName1, shop);
        System.out.println("---------------------");
        item.checkProduct(delivery, productName2, shop);
        System.out.println("---------------------");
        item.checkProduct(delivery, productName3, shop);
        System.out.println("|||||||||||||||||||||");

        System.out.print("Введіть ваш вік: ");
        int age = scanner.nextInt();

        shop.ageDiscount(age);
        delivery.ageDiscount(age);
    }
}