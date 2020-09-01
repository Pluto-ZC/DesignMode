package prototype.improve;

//原型模式  克隆羊问题
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();

        //使用原型模式完成对象的克隆
        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
    }
}
