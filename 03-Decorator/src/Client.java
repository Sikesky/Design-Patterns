public class Client {
    public static void main(String[] args) {
        Person person = new Person("小明");

        System.out.println("第一种装扮：");
        Tshirts tshirts = new Tshirts();
        Shoes shoes = new Shoes();

        /*装饰过程*/
        tshirts.Decorator(person);
        shoes.Decorator(tshirts);
        /*显示*/
        shoes.show();

        System.out.println("第二种装扮 :");
        Jacket jacket = new Jacket();
        Tie tie = new Tie();

        jacket.Decorator(person);
        tie.Decorator(jacket);
        tie.show();
    }
}
