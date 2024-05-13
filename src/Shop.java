import java.util.Random;

public class Shop {
    // інкапсуляція
    private String time;

    public Shop(String time) {
        this.time = time;
    }

    public void ageDiscount(int age) {
        if (age >= 50) {
            Random random = new Random();
            int discount = random.nextInt(13) + 3; // Рандомне число від 3 до 15 відсотків
            System.out.println("Вам випала знижка у розмірі " + discount + "%.");
        } else {
            System.out.println("На жаль, вам не випала знижка.");
        }
    }
    // інкапсуляція
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
