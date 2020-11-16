public class OperationFactory {
    public static Operation createOperation(String operator){
        Operation op = null;
        switch (operator){
            case "+":
                op = new OperationAdd();
                break;
            case "-":
                op = new OperationSub();
                break;
            case "*":
                op = new OperationMul();
                break;
            case "/":
                op = new OperationDiv();
                break;
        }
        return op;
    }
}
