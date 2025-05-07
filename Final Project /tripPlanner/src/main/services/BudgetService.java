package src.main.services;
import src.main.models.Budget;
public class BudgetService {
    public void displayBalance(Budget budget) {
        System.out.println("Remaining Balance: " + budget.viewBalance());
    }
}