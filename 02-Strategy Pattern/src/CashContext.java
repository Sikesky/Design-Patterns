public class CashContext {
    private CashSuper cashSuper;

    public CashContext(String pattern) {
        switch (pattern){
            case "normal":
                cashSuper = new CashNormal();
                break;
            case "rebate":
                cashSuper = new CashRebate(0.8);
                break;
            case "return":
                cashSuper = new CashReturn(300,100);
                break;
            default:
                System.out.println("Pattern doesn't exist.");
                break;
        }
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
