public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Error: Item already selected.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        machine.addBalance(amount);
        System.out.println("Inserted: $" + amount + ". Current Balance: $" + machine.getBalance());
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Starting dispensing process...");
        machine.setState(machine.getDispensingState());

        machine.dispenseItem();
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now Out of Order. Refunding balance: $" + machine.getBalance());
        machine.setBalance(0);
        machine.setState(machine.getOutOfOrderState());
    }
}