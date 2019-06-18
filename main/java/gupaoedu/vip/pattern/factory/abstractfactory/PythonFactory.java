package gupaoedu.vip.pattern.factory.abstractfactory;

import gupaoedu.vip.pattern.factory.ICourse;

/**
 * 2019/6/18
 * suh
 **/
public class PythonFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return null;
    }

    @Override
    public INote createNote() {
        return null;
    }

    @Override
    public IVideo createVideo() {
        return null;
    }
}
