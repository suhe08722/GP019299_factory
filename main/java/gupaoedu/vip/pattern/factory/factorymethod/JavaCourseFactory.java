package gupaoedu.vip.pattern.factory.factorymethod;

import gupaoedu.vip.pattern.factory.ICourse;
import gupaoedu.vip.pattern.factory.JavaCourse;

/**
 * 2019/6/17
 * suh
 **/
public class JavaCourseFactory implements ICourseFactory{

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
