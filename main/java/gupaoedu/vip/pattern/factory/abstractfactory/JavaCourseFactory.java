package gupaoedu.vip.pattern.factory.abstractfactory;

import gupaoedu.vip.pattern.factory.ICourse;
import gupaoedu.vip.pattern.factory.JavaCourse;

/**
 * 2019/6/18
 * suh
 **/
public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
