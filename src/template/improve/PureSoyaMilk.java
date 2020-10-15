package template.improve;

public class PureSoyaMilk extends SoyaMilk {

    @Override
    void addCondiments() {
        System.out.println("纯豆浆。。。");
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
