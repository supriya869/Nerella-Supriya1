// File: Problem2.java
import java.util.Scanner;

 class Problem2 {
    public static String firstNOdds(int a) {
        if (a <= 0) return "";
        StringBuilder sb = new StringBuilder();
        int odd = 1;
        for (int i = 0; i < a; i++) {
            if (i > 0) sb.append(", ");
            sb.append(odd);
            odd += 2;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a (positive integer): ");
        try {
            int a = Integer.parseInt(sc.nextLine().trim());
            System.out.println(firstNOdds(a));
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }
}
