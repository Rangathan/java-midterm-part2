import Americano.Americano;
import Espresso.Espresso;
import Latte.Latte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("========================================================");
        System.out.println("Welcome to Adam's Cafe");
        System.out.println("========================================================");

        showOptions();
    }

    public static void showOptions() {
        Scanner sc = new Scanner(System.in);
        String option = "0";
        String option2 = "0";
        List<Espresso> coffeeList = new ArrayList<>();

        do {
            System.out.println("========================================================");
            System.out.println("1. Pick a Coffee");
            System.out.println("2. Print out receipt");
            System.out.println("3. EXIT");
            System.out.println("========================================================");

            System.out.println("Please choose an option");

            option = sc.next();

            System.out.println();

            switch (option) {
                case "1":
                        System.out.println("You choose to pick a coffee");
                        System.out.println("========================================================");
                        System.out.println("1. Espresso");
                        System.out.println("2. Americano");
                        System.out.println("3. Latte");
                        System.out.println("4. EXIT THIS MENU");

                        option2 = sc.next();
                        switch (option2) {
                            case "1":
                                Espresso newEspresso = enterEspresso();
                                coffeeList.add(newEspresso);
                                break;
                            case "2":
                                Americano newAmericano = enterAmericano();
                                coffeeList.add(newAmericano);
                                break;
                            case "3":
                                Latte newLatte = enterLatte();
                                coffeeList.add(newLatte);
                                break;
                            default:
                                System.out.println("I'm confused");
                                break;
                        }
                        break;

                case "2":
                    System.out.println("You choose to print out your receipt");
                    System.out.println("========================================================");
                    getReciept(coffeeList);
                    option = "3";
                    break;
                case "3":
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("I'm confused");
                    break;
            }

        } while (!option.equals("3"));

        System.out.println("Thank you for ordering coffee from us!");
        sc.close();
    }


    private static void getReciept(List<Espresso> coffeeList) {
        double totalprice = 0;
        for(Espresso espresso: coffeeList){
            totalprice += espresso.generateBill();
        }
        System.out.println("Total comes to: " + totalprice);
    }

    private static Latte enterLatte() {
        Scanner sc2 = new Scanner(System.in);
        int shots = 0;
        String flavour = "";
        String size ="";

        System.out.println("Enter how many extra espresso shots wanted");

        shots = sc2.nextInt();

        System.out.println("Enter which flavouring you want (plain, vanilla, caramel, or hazelnut)");

        flavour = sc2.next();

        System.out.println("Enter size wanted: small, medium, large");

        size = sc2.next();

        Latte newLatte = new Latte(shots, flavour, size);
        
        return newLatte;
    }

    private static Americano enterAmericano() {
        Scanner sc2 = new Scanner(System.in);
        int shots = 0;
        String size = "";
        int cream = 0;
        int milk = 0;
        int sugar = 0 ;
        
        System.out.println("Enter how many extra espresso shots wanted");

        shots = sc2.nextInt();

        System.out.println("Enter size wanted: small, medium, large");

        size = sc2.next();

        System.out.println("Enter how many creams wanted");

        cream = sc2.nextInt();

        System.out.println("Enter how many milk wanted");

        milk = sc2.nextInt();

        System.out.println("Enter how many sugar wanted");

        sugar = sc2.nextInt();


        

        Americano newAmericano = new Americano(shots,size,cream,milk,sugar);

        return newAmericano;
    }

    private static Espresso enterEspresso() {
        Scanner sc2 = new Scanner(System.in);
        String name = "Espresso";
        int shots = 1;
        boolean onIced = false;

        System.out.println("Enter how many espresso shots you want");

        shots = sc2.nextInt();

        System.out.println("Do you want ice? true/false");

        onIced = sc2.nextBoolean();

        Espresso newEspresso = new Espresso(name, shots, onIced);

    
        return newEspresso;
    }
}



