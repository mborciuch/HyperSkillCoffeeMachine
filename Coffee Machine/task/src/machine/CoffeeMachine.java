package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need:");
        int cupsOfCoffee = scanner.nextInt();
        System.out.println(String.format("For %d cups of coffee you will need:", cupsOfCoffee));
        System.out.println(String.format("%d ml of water",countNeededWater(cupsOfCoffee)));
        System.out.println(String.format("%d ml of milk", countNeededMilk(cupsOfCoffee)));
        System.out.println(String.format("%d g of coffee bean", countNee1dedCoffeeBeans(cupsOfCoffee)));

    }

    public static int countNeededWater(int cupsOfCoffee){
        return cupsOfCoffee * 200;
    }

    public static int countNeededMilk(int cupsOfCoffee){
        return cupsOfCoffee * 50;
    }

    public static int countNee1dedCoffeeBeans(int cupsOfCoffee){
        return cupsOfCoffee * 15;
    }

}