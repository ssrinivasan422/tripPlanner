package src.main.models;

import java.util.ArrayList;

public class Budget {
    private double totalAmount = 1000.0; // example total amount
    private ArrayList<Expense> expenses;

    public Budget() {
        this.expenses = new ArrayList<>();
    }

    public void trackExpense(Expense expense) {
        expenses.add(expense);
    }

    public double viewBalance() {
        double spent = 0.0;
        for (Expense expense : expenses) {
            spent += expense.getAmount();
        }
        return totalAmount - spent;
    }
}