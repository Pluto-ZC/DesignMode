package flyweight;

public class ConcreteWebSite extends WebSite {

    //共享的部分  内部状态
    private String type = "";//往回走哪发布的形式（类型）

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式:"+type+"，在使用："+user.getName());
    }
}
