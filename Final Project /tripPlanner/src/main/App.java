package src.main;

import src.main.models.*;
import src.main.services.*;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to My Trip Planner Demonstration!");

        // initialize services
       ItineraryService itineraryService = new ItineraryService();
       BudgetService budgetService = new BudgetService();

        // Collect user information
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        User user = new User(username, email);
        TripPlanner tripPlanner = new TripPlanner(user);
       

        // for iteraries
        System.out.println("\n--- Itinerary Management ---");
        System.out.print("Enter itinerary title: ");
        String itineraryTitle = scanner.nextLine();
        System.out.print("Enter start date (YYYY-MM-DD): ");
        String startDate = scanner.nextLine();
        System.out.print("Enter end date (YYYY-MM-DD): ");
        String endDate = scanner.nextLine();
        Itinerary itinerary = new Itinerary(itineraryTitle, startDate, endDate);
        tripPlanner.addItinerary(itinerary);
        System.out.print("Itinerary created: " + itinerary.getTitle() + "\n");

        // For destiantions
        System.out.print("How many destinations do you want to add? ");
        int destinationCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < destinationCount; i++) {
            System.out.print("Enter destination name: ");
            String destinationName = scanner.nextLine();
            System.out.print("Enter destination country: ");
            String destinationCountry = scanner.nextLine();
            Destination destination = new Destination(destinationName, destinationCountry);

            System.out.print("How many activities for this destination? ");
            int activityCount = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < activityCount; j++) {
                System.out.print("Enter activity name: ");
                String activityName = scanner.nextLine();
                System.out.print("Enter activity time: ");
                String activityTime = scanner.nextLine();
                destination.addActivity(new Activity(activityName, activityTime));
            }

            itinerary.addDestination(destination);
        }


       System.out.println("Itinerary created:");
       itineraryService.displayItinerary(itinerary);

        // For budget management
        System.out.println("\n--- Budget Management ---");
        Budget budget = tripPlanner.getBudget();
        System.out.print("How many expenses do you want to track? ");
        int expenseCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < expenseCount; i++) {
            System.out.print("Enter expense description : ");
            String expenseDescription = scanner.nextLine();
            System.out.print("Enter expense amount: ");
            double expenseAmount = Double.parseDouble(scanner.nextLine());
            budget.trackExpense(new Expense(expenseDescription, expenseAmount));
        }

       System.out.println("Expenses tracked");
       budgetService.displayBalance(budget);


        // demo travel diary
        System.out.println("\n--- Travel Diary ---");
        Diary diary = tripPlanner.getDiary();
        System.out.print("How many diary entries do you want to add? ");
        int diaryEntryCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < diaryEntryCount; i++) {
            System.out.print("Enter diary entry date (YYYY-MM-DD): ");
            String entryDate = scanner.nextLine();
            System.out.print("Enter diary entry text: ");
            String entryText = scanner.nextLine();
            DiaryEntry entry = new DiaryEntry(entryDate, entryText);

            System.out.print("How many photos for this entry? ");
            int photoCount = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < photoCount; j++) {
                System.out.print("Enter photo file path: ");
                String photoPath = scanner.nextLine();
                entry.addPhoto(new Photo(photoPath));
            }

            diary.addEntry(entry);
        }


       System.out.println("Diary entries added:");
       for (DiaryEntry entry : diary.getEntries()) {
           System.out.println("Date: " + entry.getDate());
           System.out.println("Text: " + entry.getText());
           System.out.println("Photos: ");
           for (Photo photo : entry.getPhotos()) {
               System.out.println("- " + photo.getFilePath());
           }
       }


       System.out.println("\n--- Data Management ---");
       DataService dataService = new DataService();
       String itineraryData = "Itinerary: " + itinerary.getTitle() + "\n" +
               "Start Date: " + itinerary.getStartDate() + "\n" +
               "End Date: " + itinerary.getEndDate() + "\n";
       dataService.saveData("itinerary.txt", itineraryData);
       System.out.println("Itinerary data saved to 'itinerary.txt'.");


       System.out.println("\nTrip Planner demonstration completed!");

    }
}