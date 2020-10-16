package iterator;

import java.util.Iterator;
import java.util.List;

public class InfoColleageIterator implements Iterator {

    //信息工程学院是以list方式存放系
    List<Department> departmentList;
    int index = -1;//索引

    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    //空实现remove
    public void remove(){

    }
}
