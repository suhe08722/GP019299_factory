package gupaoedu.vip.pattern.factory.factorymethod;

import gupaoedu.vip.pattern.factory.ICourse;
import gupaoedu.vip.pattern.factory.JavaCourse;
import gupaoedu.vip.pattern.factory.PythonCourse;

/**
 * 2019/6/17
 * suh
 **/
public class PythonCourseFactory implements ICourseFactory{

    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
