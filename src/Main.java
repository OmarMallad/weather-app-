import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Java Weather App ===");
        System.out.print("Enter a city: ");

        String city = scanner.nextLine();

        System.out.println("\nSearching for weather in " + city + "...");

//        TODO: Connect to a weather API
//        TODO: Display temperature, humidity, and condition

        scanner.close();
            }
        }


