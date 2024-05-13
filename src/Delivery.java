import java.util.Random;
// наслідування
public class Delivery extends Shop {

    // інкапсуляція
    private String presence;

    public Delivery(String time, String presence) {
        super(time);
        this.presence = presence;
    }

    public int productPresent(String choice, Shop e) {
        String[] parts = e.getTime().split(":");
        String firstPart = parts[0];
        int time = Integer.parseInt(firstPart);
        if (choice.equalsIgnoreCase("морозиво") ) {
            return 2;
        } else if (time >= 20) {
            return 1;
        } else if (choice.equalsIgnoreCase("хліб") || choice.equalsIgnoreCase("масло") || choice.equalsIgnoreCase("пиво")) {
            return 0;
        } else {
            return 3;
        }
    }

    //Перевизначення методу
    @Override
    public void ageDiscount(int age) {
        if (age <= 18) {
            System.out.println("Також вам не доступні алкогольні та табачні вироби !");
        } else {
            System.out.println("Ви можете купувати алкогольні та табачні вироби !");
        }
    }

    // інкапсуляція
    public String getPresence() {
        return presence;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }
}
