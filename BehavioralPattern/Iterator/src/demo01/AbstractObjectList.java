package demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yu
 * @version 1.0
 * @date Create in 23:02 2021/5/27
 * @description
 */
public abstract class AbstractObjectList {

    protected List<Object> objects = new ArrayList<Object>();

    public AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    public void addObject(Object object){
        objects.add(object);
    }

    public void removeObject(Object object){
        objects.remove(object);
    }

    public List<Object> getObjects() {
        return objects;
    }

    public abstract Iterator getIterator();
}
