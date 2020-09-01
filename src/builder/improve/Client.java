package builder.improve;

public class Client {
    public static void main(String[] args) {
        // 盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        // 准备创建房子的指挥者
        HousesDirector housesDirector = new HousesDirector(commonHouse);
        //完成盖房子 返回产品
        House house = housesDirector.constructHouse();

        //盖高楼
        HighBuilding highBuilding = new HighBuilding();
        //重置建造者
        housesDirector.setHouseBuilder(highBuilding);
        //完成盖房子 返回产品
        housesDirector.constructHouse();
    }
}
