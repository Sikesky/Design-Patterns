public abstract class Operation {
    private double numberA = 0.0;
    private double numberB = 0.0;

    public abstract double GetResult();

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}

class OperationAdd extends Operation{
    @Override
    public double GetResult() {
        return getNumberA() + getNumberB();
    }
}

class OperationSub extends Operation{
    @Override
    public double GetResult() {
        return getNumberA() - getNumberB();
    }
}

class OperationMul extends Operation{
    @Override
    public double GetResult() {
        return getNumberA() * getNumberB();
    }
}

class OperationDiv extends Operation{
    @Override
    public double GetResult(){
        if (getNumberB() == 0)
            return 0.0;
        return getNumberA() / getNumberB();
    }
}