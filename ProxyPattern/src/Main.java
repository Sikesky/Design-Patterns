public class Main {
    public static void main(String[] args) {
        SchoolGirl jiaojiao = new SchoolGirl("李娇娇");

        //娇娇并不认识卓贾易，有问题
        Pursuit zhuojiayi = new Pursuit(jiaojiao);

        zhuojiayi.GiveDolls();
        zhuojiayi.GiveFlowers();
        zhuojiayi.GiveChocolate();
    }
}
