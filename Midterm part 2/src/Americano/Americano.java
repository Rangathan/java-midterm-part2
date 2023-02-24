package Americano;
import Espresso.Espresso;
public class Americano extends Espresso{
    private String size;
    private int cream;
    private int milk;
    private int sugar;
    public Americano( int shots, String size, int cream, int milk, int sugar) {
        super("Americano", shots, false);
        this.size = size;
        this.cream = cream;
        this.milk = milk;
        this.sugar = sugar;
    }
    public Americano(String size, int cream, int milk, int sugar) {
        this.size = size;
        this.cream = cream;
        this.milk = milk;
        this.sugar = sugar;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public int getCream() {
        return cream;
    }
    public void setCream(int cream) {
        this.cream = cream;
    }
    public int getMilk() {
        return milk;
    }
    public void setMilk(int milk) {
        this.milk = milk;
    }
    public int getSugar() {
        return sugar;
    }
    public void setSugar(int sugar) {
        this.sugar = sugar;
    }
    @Override
    public double generateBill() {
        double smallPrice = 2.0; 
        double mediumPrice = 2.5; 
        double largePrice = 3.0; 
        double basePrice = 2.0; 
        double extraShot = 1.25;
        double totalPrice = basePrice; 

        if (size.equalsIgnoreCase("small")) {
            totalPrice = smallPrice;
        } else if (size.equalsIgnoreCase("medium")) {
            totalPrice = mediumPrice;
        } else if (size.equalsIgnoreCase("large")) {
            totalPrice = largePrice;
        }
    

        System.out.println("Americano (" + size + "): $" + totalPrice);
        if (sugar > 0) {
            System.out.println("Sugar: " + sugar);
        }
        if (cream > 0) {
            System.out.println("Cream: " + cream);
        }
        if (milk > 0) {
            System.out.println("Milk: " + milk);
        }
        if (getShots() > 0) {
            System.out.println("Extra Espresso shots: " + getShots() + " $" + (extraShot * getShots()));
            totalPrice += (extraShot * getShots());
        }
        System.out.println("Drink total: $" + totalPrice);
        return totalPrice;
    }
}
