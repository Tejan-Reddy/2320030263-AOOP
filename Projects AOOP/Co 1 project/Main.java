public class Main {
    public static void main(String[] args) {
        // Using TravelBookingFacade
        TravelBookingFacade travelFacade = new TravelBookingFacade();
        String flightDetails = "Flight Airbus to Paris";
        String hotelDetails = "Hotel Bonvoyage in Paris";
        String carDetails = "Rental Car Tata";

        String bookingConfirmation = travelFacade.bookTrip(flightDetails, hotelDetails, carDetails);
        System.out.println("Booking Confirmation:\n" + bookingConfirmation);

        // Using ExpenseTracker
        ExpenseTracker expenseTracker = new ExpenseTracker();
        expenseTracker.setBudget(1000);
        expenseTracker.addExpense(200, "Food");
        expenseTracker.addExpense(150, "Transport");

        System.out.println("Total Expenses: " + expenseTracker.getTotalExpenses());
        System.out.println("Budget Status: " + expenseTracker.getBudgetStatus());
    }
}

