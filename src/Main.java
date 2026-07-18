import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("       JAVA WEATHER APP");
        System.out.println("================================");

        System.out.print("Enter a city: ");
        String city = scanner.nextLine().trim();

        if (city.isEmpty()) {
            System.out.println("\n❌ City name cannot be empty.");
            scanner.close();
            return;
        }

        System.out.println("\nSearching for weather in " + city + "...");

        // Small loading animation
        try {
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("\nAn error occurred.");
        }

        System.out.println("\n");
        System.out.println("================================");
        System.out.println("City: " + city);
        System.out.println("Status: API connection coming soon...");
        System.out.println("Temperature: -- °C");
        System.out.println("Humidity: -- %");
        System.out.println("Condition: --");
        System.out.println("================================");

        scanner.close();
    }
}