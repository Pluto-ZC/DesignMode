package strategy;

public abstract class Duck {
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
        System.out.println("鸭子飞~~~~");
    }
}
