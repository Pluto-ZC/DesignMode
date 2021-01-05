package strategy;

public class PekingDuck extends Duck {
    @Override
    public void display() {
        System.out.println("北京鸭~~~~");
    }

    //因为北京鸭不能飞 所以要重写fly
    @Override
    public void fly() {
        System.out.println("北极鸭不能飞~~~~");
    }
}
