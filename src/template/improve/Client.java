package template.improve;

//模板方法模式的钩子方法
public class Client {
    public static void main(String[] args) {
        //制作红豆豆浆
        System.out.println("----制作红豆豆浆----");
        RedBeanSoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        //制作花生豆浆
        System.out.println("----制作花生豆浆----");
        PeanutSoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

        //制作纯豆浆
        System.out.println("----制作纯豆浆----");
        PureSoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
