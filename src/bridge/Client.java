package bridge;

public class Client {
    public static void main(String[] args) {
        //获取折叠式手机（样式+品牌）
        FlodedPhone phone1 = new FlodedPhone(new XiaoMi());
        phone1.open();
        phone1.close();
        phone1.call();

        FlodedPhone phone2 = new FlodedPhone(new Vivo());
        phone2.open();
        phone2.close();
        phone2.call();

        UpRightPhone phone3 = new UpRightPhone(new XiaoMi());
        phone3.open();
        phone3.close();
        phone3.call();

        UpRightPhone phone4 = new UpRightPhone(new Vivo());
        phone4.open();
        phone4.close();
        phone4.call();
    }
}
