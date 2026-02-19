public class OutOfOrderState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Machine is Out of Order.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Machine is Out of Order. Coin returned.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Machine is Out of Order.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is already Out of Order.");
    }
}