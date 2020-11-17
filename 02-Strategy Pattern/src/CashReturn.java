public class CashReturn extends CashSuper {

    private int scale;
    private int ret;

    public CashReturn(int scale, int ret) {
        this.scale = scale;
        this.ret = ret;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    @Override
    public double acceptCash(double money) {
        int times = (int)(money / scale);
        money -= times * ret;
        return money;
    }
}
