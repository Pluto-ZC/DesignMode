package strategy.improve;

public abstract class Duck {

    //属性  策略接口
    FlyBehavior flyBehavior;
    //其他属性  策略接口

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public Duck() {
    }

    public abstract void display();//显示鸭子的信息

    public void quack(){
        System.out.println("鸭子叫~~~~");
    }

    public void swim(){
        System.out.println("鸭子游泳~~~~");
    }

    public void fly(){
        if (flyBehavior!=null)
            flyBehavior.fly();
        else
            System.out.println("鸭子飞——————");
    }
}
