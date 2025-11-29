// File: Problem1.java
import java.util.Scanner;

 class Calculator {
    public static double calculate(double a, double b, String op) {
        op = op.trim().toLowerCase();
        switch (op) {
            case "add":
            case "+":
                return a + b;
            case "subtract":
            case "sub":
            case "-":
                return a - b;
            case "multiply":
            case "mul":
            case "*":
                return a * b;
            case "divide":
            case "div":
            case "/":
                if (b == 0) throw new ArithmeticException("Division by zero");
                return a / b;
            default:
                throw new IllegalArgumentException("Unsupported operation: " + op);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a (double): ");
            double a = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Enter b (double): ");
            double b = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Enter operation (add/+ , sub/- , mul/* , div/ /): ");
            String op = sc.nextLine().trim();
            double result = calculate(a, b, op);
            System.out.println("Result: " + result);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid number format. " + nfe.getMessage());
        } catch (ArithmeticException ae) {
            System.out.println("Error: " + ae.getMessage());
        } catch (IllegalArgumentException ie) {
            System.out.println("Error: " + ie.getMessage());
        } finally {
            sc.close();
        }
    }
}

