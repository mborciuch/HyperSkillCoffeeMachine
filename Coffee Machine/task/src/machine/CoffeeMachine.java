package machine;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int supplyOfWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int supplyOfMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int supplyOfCoffeeBeans = scanner.nextInt();

        int availableCupsOfCoffee = countMaximumCupsOfCoffee(supplyOfWater, supplyOfMilk, supplyOfCoffeeBeans);

        System.out.println("Write how many cups of coffee you will need:");
        int requiredCupsOfCoffee = scanner.nextInt();

        if (requiredCupsOfCoffee == availableCupsOfCoffee) {
            System.out.println("Yes, I can make that amount of coffee ");
        } else if (requiredCupsOfCoffee < availableCupsOfCoffee) {
            System.out.println(String.format("Yes, I can make that amount of coffee( and even %d more than that)", availableCupsOfCoffee - requiredCupsOfCoffee));
        }
        else{
            System.out.println(String.format("No, I can make only %d cup(s) of coffee", availableCupsOfCoffee));
        }
    }

    public static int countMaximumCupsOfCoffee(int supplyOfWater, int supplyOfMilk, int supplyOfCoffeeBeans) {
        Integer[] availableCoffees = {supplyOfWater / 200, supplyOfMilk / 50, supplyOfCoffeeBeans / 15};
        return Collections.min(Arrays.asList(availableCoffees));
    }
}