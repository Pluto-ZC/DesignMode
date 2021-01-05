package strategy.improve;

public class PekingDuck extends Duck {

    //假如可以飞  但是技术一般
    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }



    @Override
    public void display() {
        System.out.println("北京鸭~~~~");
    }


}
