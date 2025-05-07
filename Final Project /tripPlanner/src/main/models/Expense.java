package src.main.models;

public class Expense {
    private String category;
    private double amount;

    public String getCategory() {
        return category;
    }

    public Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void updateAmount(double newAmount) {
        this.amount = newAmount;
    }
}
