public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item selected. Please insert coins.");
        machine.setState(machine.getItemSelectedState());
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Error: Please select an item first.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Error: Please select an item and insert coins first.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now Out of Order.");
        machine.setState(machine.getOutOfOrderState());
    }
}