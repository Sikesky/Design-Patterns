public class CashRebate extends CashSuper {

    private double rate;

    public CashRebate(double rate) {
        this.rate = rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double acceptCash(double money) {
        return money * rate;
    }
}
