package visitor;

public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男 评价 成功。。。");
    }

    @Override
    public void getWomanRestlt(Woman woman) {
        System.out.println("女 评价 成功。。。");
    }
}
