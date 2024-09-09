import java.util.ArrayList;
import java.util.List;

public class ExpenseTracker {
    private List<Expense> expenses;
    private double budget;

    public ExpenseTracker() {
        this.expenses = new ArrayList<>();
        this.budget = 0;
    }

    public void setBudget(double amount) {
        this.budget = amount;
    }

    public void addExpense(double amount, String category) {
        expenses.add(new Expense(amount, category));
    }

    public double getTotalExpenses() {
        return expenses.stream().mapToDouble(Expense::getAmount).sum();
    }

    public double getBudgetStatus() {
        return budget - getTotalExpenses();
    }
}
