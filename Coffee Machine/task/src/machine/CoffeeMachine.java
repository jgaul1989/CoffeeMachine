package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PerformTask dailyOperations = new PerformTask();

        while (dailyOperations.getMachineState() != MachineState.EXIT) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String userAction = scanner.nextLine();

            dailyOperations.setMachineState(userAction);

            switch (dailyOperations.getMachineState()) {
                case BUY:
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String menuItem = scanner.nextLine();
                    if("1".equals(menuItem)) {
                        dailyOperations.buyEspresso();

                    } else if ("2".equals(menuItem)) {
                        dailyOperations.buyLatte();

                    } else if ("3".equals(menuItem)) {
                        dailyOperations.buyCappuccino();

                    } else if("back".equals(menuItem)) {
                        break;
                    } else {
                        System.out.println("Invalid input");
                    }
                    break;

                case FILL:
                    System.out.println("Write how many ml of water you want to add:");
                    int waterToAdd = Integer.valueOf(scanner.nextLine());
                    System.out.println("Write how many ml of milk you want to add:");
                    int milkToAdd = Integer.valueOf(scanner.nextLine());
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    int beansToAdd = Integer.valueOf(scanner.nextLine());
                    System.out.println("Write how many disposable cups you want to add:");
                    int cupsToAdd = Integer.valueOf(scanner.nextLine());
                    dailyOperations.fillMachine(waterToAdd, milkToAdd, beansToAdd, cupsToAdd);

                    break;

                case TAKE:
                    System.out.printf("I gave you $%d%n", dailyOperations.getCashRegister());
                    dailyOperations.setCashRegister(0);
                    break;

                case REMAINING:
                    dailyOperations.printRemaining();
                    break;

                case EXIT:
                    break;

                default:
                    System.out.println("Invalid input");
                    break;

            }
        }

    }
}
