package flyweight;

import java.util.HashMap;

//网站工厂类，根据需求 返回一个网站
public class WebSiteFactory {
    //集合 充当池的作用
    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();
    //根据网站类型，返回一个网站，如果没有就创建一个 并放入到池中并返回
    public WebSite getWebSiteCategory(String type){
        if (!pool.containsKey(type)) {
            //创建一个网站并放到池中
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }
    //获取网站分类的总数（池中有多少个网站类型）
    public int getWebSiteCount(){
        return pool.size();
    }
}
