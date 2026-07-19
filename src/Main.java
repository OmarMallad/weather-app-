import java.util.Locale;
import java.util.Scanner;

import org.json.simple.JSONArray ;
import org.json.simple.JSONObject ;
import org.json.simple.parser.JSONParser ;

import java.io.IOException ;
import java.net.HttpURLConnection ;
import java.net.URL ;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("      WEATHER APP      ");
        System.out.println("=======================");

        System.out.print("Enter a city: ");
        String city = scanner.nextLine().trim().toLowerCase();

        if (city.isEmpty()) {
            System.out.println("City name cannot be empty.");
            scanner.close();
            return;
        }

        System.out.println("Searching for weather in " + city + "...");

        try {
            for (int i = 0; i < 3; i++) {
                System.out.print(".");
                Thread.sleep(500);

            }
            JSONObject cityLocationData = (JSONObject) getLocationData(city) ;
            double latitude = (double) cityLocationData.get("latitude") ;
            double longitude = (double) cityLocationData.get("longitude") ;

            displayWeatherData(latitude , longitude) ;

        }
        catch (InterruptedException e) {
            System.out.println("An error occurred.");
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

    private static JSONObject getLocationData(String city){

        String urlString = "https://geocoding-api.open-meteo.com/v1/search?name=" + city + "&count=1&language=en&format=json" ;

        HttpURLConnection apuConnection = fetchApiResponse(urlString) ;

    }
}