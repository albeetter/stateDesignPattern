public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Please wait, currently dispensing.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Please wait, currently dispensing. Coin rejected.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        if (machine.getInventory() > 0) {
            machine.decreaseInventory();
            System.out.println("Item dispensed! Remaining inventory: " + machine.getInventory());
            machine.setBalance(0);

            if (machine.getInventory() == 0) {
                System.out.println("Inventory empty. Going Out of Order.");
                machine.setState(machine.getOutOfOrderState());
            } else {
                machine.setState(machine.getIdleState());
            }
        } else {
            System.out.println("Error: Out of stock.");
            machine.setState(machine.getOutOfOrderState());
        }
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Cannot change state during dispensing.");
    }
}