package machine;

public class PerformTask {

    private MachineState machineState;
    private int cashRegister;
    private int waterInventory;
    private int milkInventory;
    private int beanInventory;
    private int cupInventory;

    public PerformTask() {

        this.machineState = MachineState.READY;
        this.cashRegister = 550;
        this.waterInventory = 400;
        this.milkInventory = 540;
        this.beanInventory = 120;
        this.cupInventory = 9;
    }

    public MachineState getMachineState() {
        return machineState;
    }

    public void setMachineState(String machineState) {
        machineState = machineState.toUpperCase();
        this.machineState = MachineState.valueOf(machineState);
    }

    public int getCashRegister() {
        return cashRegister;
    }

    public void setCashRegister(int cashRegister) {
        this.cashRegister = cashRegister;
    }

    public void buyEspresso() {
        if (this.waterInventory >= 250 && this.beanInventory >= 16 && this.cupInventory >= 1) {
            this.waterInventory -= 250;
            this.beanInventory -= 16;
            this.cupInventory -= 1;
            this.cashRegister += 4;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            if (waterInventory < 250) {
                System.out.println("Sorry, not enough water!");
            } else if (beanInventory < 16) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (cupInventory < 1){
                System.out.println("Sorry, not enough disposable cups!");
            }
        }
    }

    public void buyLatte() {
        if (this.waterInventory >= 350 && this.milkInventory >= 75 && this.beanInventory >= 20 && this.cupInventory >= 1) {
            this.waterInventory -= 350;
            this.milkInventory -= 75;
            this.beanInventory -= 20;
            this.cupInventory -= 1;
            this.cashRegister += 7;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            if (this.waterInventory < 350) {
                System.out.println("Sorry, not enough water!");
            } else if (this.milkInventory < 75) {
                System.out.println("Sorry, not enough milk!");
            } else if (this.beanInventory < 20) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (this.cupInventory < 1){
                System.out.println("Sorry, not enough disposable cups!");
            }
        }
    }

    public void buyCappuccino() {
        if (this.waterInventory >= 200 && this.milkInventory >= 100 && this.beanInventory >= 12 && this.cupInventory >= 1) {
            this.waterInventory -= 200;
            this.milkInventory -= 100;
            this.beanInventory -= 12;
            this.cupInventory -= 1;
            this.cashRegister += 6;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            if (this.waterInventory < 200) {
                System.out.println("Sorry, not enough water!");
            } else if (this.milkInventory < 100) {
                System.out.println("Sorry, not enough milk!");
            } else if (this.beanInventory < 12) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (this.cupInventory < 1){
                System.out.println("Sorry, not enough disposable cups!");
            }
        }
    }

    public void fillMachine(int water, int milk, int beans, int cups) {
        this.waterInventory += water;
        this.milkInventory += milk;
        this.beanInventory += beans;
        this.cupInventory += cups;
    }

    public void printRemaining() {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water%n", this.waterInventory);
        System.out.printf("%d ml of milk%n", this.milkInventory);
        System.out.printf("%d g of coffee beans%n", this.beanInventory);
        System.out.printf("%d disposable cups%n", this.cupInventory);
        System.out.printf("$%d of money%n", this.cashRegister);
    }
}

