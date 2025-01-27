/*
ChatGPT code to find the short name.
*/

import java.util.Scanner;

 class ShortNameProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        
        String[] nameParts = fullName.split(" ");
        StringBuilder shortName = new StringBuilder();
        
        for (String part : nameParts) {
            if (!part.isEmpty()) {
                shortName.append(part.charAt(0)).append(". ");
            }
        }
        
        System.out.println("Short name: " + shortName.toString().trim());
    }
}