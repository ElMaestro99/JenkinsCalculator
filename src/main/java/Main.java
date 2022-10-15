import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        Calculator calc = new Calculator();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("welcome to the calculator\nEnter a command:");


        while (true) {
            String input = reader.readLine();
            String[] arguments = input.split(" ");

            switch(arguments[0]) {
                case "add":
                    System.out.println(calc.add(Integer.valueOf(arguments[1]), Integer.valueOf(arguments[2])));
                    break;
                case "subtract":
                    System.out.println(calc.subtract(Integer.valueOf(arguments[1]), Integer.valueOf(arguments[2])));
                    break;
                case "multiply":
                    System.out.println(calc.multiply(Integer.valueOf(arguments[1]), Integer.valueOf(arguments[2])));
                    break;
                case "divide":
                    System.out.println(calc.divide(Integer.valueOf(arguments[1]), Integer.valueOf(arguments[2])));
                    break;
                case "fibonacci":
                    System.out.println(calc.fibonacciNumberFinder(Integer.valueOf(arguments[1])));
                    break;
                case "binary":
                    System.out.println(calc.intToBinaryNumber(Integer.valueOf(arguments[1])));
                    break;
                case "quit":
                    return;
                default:
                    System.out.println("Invalid arguments: please only use add, subtract, multiply, divide, fibonacci, binary, or quit");
            }
        }
    }
}
