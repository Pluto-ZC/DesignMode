package composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {

    //lsit中存放的是department
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    //构造器
    public College(String name, String des) {
        super(name, des);
    }

    //重写add
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        //在将来的的实际业务中，college的add和university的add不一定完全一致
        organizationComponents.add(organizationComponent);
    }

    //重写remove
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //print方法就是输出University 包含的学校
    @Override
    protected void print() {
        System.out.println("---" + getName() + "---");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
