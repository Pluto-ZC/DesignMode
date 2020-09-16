package decorator;

public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj) { //组合
        this.obj = obj;
    }

    //getPrice 自己价格
    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        //obj.getDes()被装饰着的信息
        return super.des +" "+super.getPrice()+"&&"+obj.getDes();
    }
}
