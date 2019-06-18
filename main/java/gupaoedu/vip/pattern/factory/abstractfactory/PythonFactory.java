package gupaoedu.vip.pattern.factory.abstractfactory;

import gupaoedu.vip.pattern.factory.ICourse;
import gupaoedu.vip.pattern.factory.PythonCourse;

/**
 * 2019/6/18
 * suh
 **/
public class PythonFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }

    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonViedo();
    }
}
