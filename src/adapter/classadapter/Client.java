package adapter.classadapter;

//类适配器
public class Client {
    public static void main(String[] args) {
        System.out.println("适配器模式");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
