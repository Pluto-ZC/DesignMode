package bridge;

public class Phone {

    //组合品牌
    private Brand brand;

    //构造器
    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open(){
        this.brand.open();
    }

    protected void close(){
        this.brand.close();
    }

    protected void call(){
        brand.call();
    }
}










