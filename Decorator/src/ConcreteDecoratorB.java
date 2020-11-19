public class ConcreteDecoratorB extends Decorator{

    @Override
    public void Operation() {
        super.Operation();
        addedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addedBehavior(){
        System.out.println("B独有的操作");
    }
}
