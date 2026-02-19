public class VendingMachine {

    private VendingMachineState idleState;
    private VendingMachineState itemSelectedState;
    private VendingMachineState dispensingState;
    private VendingMachineState outOfOrderState;

    private VendingMachineState currentState;

    private int inventory;
    private int balance;

    public VendingMachine(int inventory) {
        idleState = new IdleState();
        itemSelectedState = new ItemSelectedState();
        dispensingState = new DispensingState();
        outOfOrderState = new OutOfOrderState();

        this.inventory = inventory;
        this.balance = 0;

        if (inventory > 0) {
            currentState = idleState;
        } else {
            currentState = outOfOrderState;
        }
    }

    public void selectItem() {
        currentState.selectItem(this);
    }

    public void insertCoin(int amount) {
        currentState.insertCoin(this, amount);
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

    public void setOutOfOrder() {
        currentState.setOutOfOrder(this);
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public VendingMachineState getIdleState() {
        return idleState;
    }
    public VendingMachineState getItemSelectedState() {
        return itemSelectedState;
    }
    public VendingMachineState getDispensingState() {
        return dispensingState;
    }
    public VendingMachineState getOutOfOrderState() {
        return outOfOrderState;
    }

    public int getInventory() {
        return inventory;
    }
    public void decreaseInventory() {
        this.inventory--;
    }

    public int getBalance() {
        return balance;
    }
    public void addBalance(int amount) {
        this.balance += amount;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}