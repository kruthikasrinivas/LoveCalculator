import java.util.Scanner;

public class LoveCalculator1 {
    
    // Method to calculate love percentage based on names
    public static int calculateLove(String name1, String name2) {
        int sum = 0;
        
        // Add ASCII value of each character in name1
        for (char c : name1.toLowerCase().toCharArray()) {
            sum += c;
        }
        
        // Add ASCII value of each character in name2
        for (char c : name2.toLowerCase().toCharArray()) {
            sum += c;
        }
        
        // A simple calculation of love percentage
        return sum % 100;  // Gives a value between 0-99
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Love Calculator!");
        
        // Get names from user
        System.out.print("Enter your name: ");
        String name1 = scanner.nextLine();
        

		
        System.out.print("Enter your partner's name: ");
        String name2 = scanner.nextLine();
        
        // Calculate love percentage
        int lovePercentage = calculateLove(name1, name2);
        
        // Display the result
        System.out.println("Your love percentage is: " + lovePercentage + "%");
        
        scanner.close();
    }
}