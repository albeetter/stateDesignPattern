public class VendingMachineDemo {
    public static void main(String[] args) {
        // Initialize a new vending machine with an inventory of 2 items
        VendingMachine machine = new VendingMachine(2);

        System.out.println("--- Transaction 1 ---");
        //Select, insert coin, dispense
        machine.selectItem();
        machine.insertCoin(2);
        machine.dispenseItem();

        System.out.println("\n--- Transaction 2 ---");
        // Testing invalid operations during ItemSelected state
        machine.selectItem();
        machine.selectItem(); // Should trigger an error message
        machine.insertCoin(3);
        machine.dispenseItem();

        System.out.println("\n--- Transaction 3 (Empty Inventory) ---");
        // The machine should now be Out of Order because inventory is 0
        machine.selectItem();
        machine.insertCoin(1);
    }
}