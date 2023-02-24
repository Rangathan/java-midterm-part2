package Latte;
import Espresso.Espresso;
public class Latte extends Espresso{
    private String flavour;
    private String size;
    public Latte(int shots, String flavour, String size) {
        super("Latte", shots, false);
        this.flavour = flavour;
        this.size = size;
    }
    public Latte(String flavour, String size) {
        this.flavour = flavour;
        this.size = size;
    }
    public String getFlavour() {
        return flavour;
    }
    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
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
    

        System.out.println("Latte (" + size + "): $" + totalPrice);
        System.out.println("Flavour: " + flavour);
        
        if (getShots() > 0) {
            System.out.println("Extra Espresso shots: " + getShots() + " $" + (extraShot * getShots()));
            totalPrice += (extraShot * getShots());
        }
        System.out.println("Drink total: $" + totalPrice);
        return totalPrice;
    }

    
}
