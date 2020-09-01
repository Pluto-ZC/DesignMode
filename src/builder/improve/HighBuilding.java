package builder.improve;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼的地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼的墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼的屋顶");
    }
}
