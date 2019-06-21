package machine;

import java.util.Scanner;

public class CoffeeMachine {

    static Scanner scanner = new Scanner(System.in);

    static int supplyOfWater = 1200;
    static int supplyOfMilk = 540;
    static int supplyOfCoffeeBeans = 120;
    static int disposableCups = 9;
    static int money = 550;

    public static void main(String[] args) {

        printState();
        String action = selectAction();

        switch (action) {
            case "buy":
                buy();
                break;

            case "fill":
                fill();
                break;

            case "take":
                take();
                break;

            default:
                System.out.println("Unsupported operation");
                break;
        }
        printState();
    }

    static void printState() {
        System.out.println("The coffee machine has:");
        System.out.println(String.format("%d of water", supplyOfWater));
        System.out.println(String.format("%d of milk", supplyOfMilk));
        System.out.println(String.format("%d of Coffee beans", supplyOfCoffeeBeans));
        System.out.println(String.format("%d of disposable cups", disposableCups));
        System.out.println(String.format("%d of money", money));
    }

    static String selectAction() {
        System.out.println("Write action (buy, fill, take):");
        return scanner.nextLine();
    }

    private static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: 3");
        String coffeeType = scanner.nextLine();
        switch (coffeeType) {
            case "1":
                makeEspresso();
                break;
            case "2":
                makeLatte();
                break;
            case "3":
                makeCappucino();
                break;
            default:
                System.out.println("Unavailable coffee type");
        }
    }

    private static void makeEspresso() {
        supplyOfWater -= 250;
        supplyOfCoffeeBeans -= 16;
        disposableCups -= 1;
        money += 4;
    }

    private static void makeLatte() {
        supplyOfWater -= 350;
        supplyOfMilk -= 75;
        supplyOfCoffeeBeans -= 20;
        disposableCups -= 1;
        money += 7;
    }

    private static void makeCappucino() {
        supplyOfWater -= 200;
        supplyOfMilk -= 100;
        supplyOfCoffeeBeans -= 12;
        disposableCups -= 1;
        money += 6;
    }

    private static void fill(){
        System.out.println("Write how many ml of water do you want to add:");
        supplyOfWater += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        supplyOfMilk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add");
        supplyOfCoffeeBeans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        disposableCups += scanner.nextInt();
    }

    private static void take(){
        System.out.println(String.format("I gave you #d", money));
        money = 0;
    }
}