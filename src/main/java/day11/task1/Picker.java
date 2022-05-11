package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.increaseCountPickedOrders();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() < 10000 || warehouse.getCountPickedOrders() % 10000 != 0) {
            System.out.println("Бонус пока недоступен");
        }else if (isPayed){
            System.out.println("Бонус уже был выплачен");
        }else {
            salary += 70000;
            isPayed = true;
        }
    }
}
