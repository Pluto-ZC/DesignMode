package factory.absfactory.pizzastore.pizza;

//将pizza类做成抽象的
public abstract class Pizza {
    protected String name;

    //准备原料  种类不同  准备的材料不同
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}

