public class Item {
    // інкапсуляція
    private String iceCream;
    private String bread;
    private String butter;

    public Item(String iceCream, String bread, String butter) {
        this.iceCream = iceCream;
        this.bread = bread;
        this.butter = butter;
    }

    public void checkProduct(Delivery e, String choice, Shop shop) {
        if (e.productPresent(choice, shop) == 2) {
            System.out.println("Ви не зможете купити " + choice + "\nТовар " + choice + " відсутній");
        } else if (e.productPresent(choice, shop) == 1){
            System.out.println("Ви не зможете купити " + choice + "\nМагазин закритий в такій годині");
        } else if (e.productPresent(choice, shop) == 3) {
            System.out.println("Ви не зможете купити " + choice + "\nВ магазині немає " + choice);
        }else {
            System.out.println("Ви зможете купити " + choice + " в такій годині !");
        }
    }

    // інкапсуляція
    public String getIceCream() {
        return iceCream;
    }

    public void setIceCream(String iceCream) {
        this.iceCream = iceCream;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getButter() {
        return butter;
    }

    public void setButter(String butter) {
        this.butter = butter;
    }
}
