package composite;

public class Department extends OrganizationComponent {
    public Department(String name, String des) {
        super(name, des);
    }

    //add remove不用写了 因为他是叶子节点


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
