package memento.game;

public class GameRole {

    private int vit;
    private int def;

    //创建Memento 即根据当前状态得到Memrnto
    public Memento createMemento(){
         return new Memento(vit, def);
    }

    //从备忘录对象，恢复GameRole的状态
    public void recoverGameRoleFromMemento(Memento memento){
        vit = memento.getVit();
        def = memento.getDef();
    }
    //显示当前游戏角色的状态
    public void display(){
        System.out.println("攻击力："+vit +"，防御力："+def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}












