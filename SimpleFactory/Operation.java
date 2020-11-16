public class Operation {
    public static double GetResult(double numberA, double numberB, String operator){
        double result = 0d;
        switch (operator){
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                result = numberA / numberB;
                break;
        }
        return result;
    }
}
