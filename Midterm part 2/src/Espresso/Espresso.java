package Espresso;

public class Espresso {
    private String espresso;
    private int shots;
    private boolean onIced;
    
    public Espresso(String espresso, int shots, boolean onIced) {
        this.espresso = "Espresso";
        this.shots = shots;
        this.onIced = onIced;
    }

    public Espresso() {
    }

    public String getEspresso() {
        return espresso;
    }

    public void setEspresso(String espresso) {
        this.espresso = espresso;
    }

    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public boolean isOnIced() {
        return onIced;
    }

    public void setOnIced(boolean onIced) {
        this.onIced = onIced;
    }
    
    public double generateBill() {
        double singleShot = 1.25;
        double basePrice = 1.25; 
        double totalPrice = basePrice; 

        if (shots >= 1) {
            System.out.println(espresso +" shots: " + shots +" $" + (singleShot* shots));
            totalPrice = (singleShot * shots);
        }
        if(onIced){
            System.out.println("With ice");
        }
        System.out.println("Drink total: $" + totalPrice);

        return totalPrice;
    }
}
