public class SimpleCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java SimpleCalculator <operand1> <operator> <operand2>");
            System.exit(1);
        }
        
        double operand1 = Double.parseDouble(args[0]);
        String operator = args[1];
        double operand2 = Double.parseDouble(args[2]);
        
        double result = 0;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Error: Division by zero");
                    System.exit(1);
                }
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Error: Invalid operator");
                System.exit(1);
        }
        System.out.println("Result: " + result);
    }
}

