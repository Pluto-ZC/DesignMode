package composite;

//组合模式  java 的集合类hashmap使用了组合模式
public class Client {
    public static void main(String[] args) {
        //从小到大创建对象
        OrganizationComponent university = new University("清华大学", "顶级大学");

        //创建学院
        OrganizationComponent computerCollege = new College("计算机学院", "计算机学院des");
        OrganizationComponent infoEngineerCollege = new College("信息工程学院", "信息工程学院des");

        //创建各个学院下面的系（专业）
        computerCollege.add(new Department("软件工程", "软件工程des"));
        computerCollege.add(new Department("网络工程", "网络工程des"));
        computerCollege.add(new Department("计算机科学与技术", "计算机科学与技术des"));

        infoEngineerCollege.add(new Department("通信工程", "通信工程des"));
        infoEngineerCollege.add(new Department("信息工程", "信息工程des"));

        university.add(computerCollege);
        university.add(infoEngineerCollege);

        university.print();
    }
}
