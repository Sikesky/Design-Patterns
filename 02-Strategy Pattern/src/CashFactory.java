public class CashFactory {
    public static CashSuper cashFactory(String pattern){
        CashSuper cashSuper = null;
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
        return cashSuper;
    }
}
