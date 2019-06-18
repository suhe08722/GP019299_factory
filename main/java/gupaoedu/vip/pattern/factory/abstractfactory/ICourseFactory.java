package gupaoedu.vip.pattern.factory.abstractfactory;

import gupaoedu.vip.pattern.factory.ICourse;

/**
 * 2019/6/18
 * suh
 **/
public interface ICourseFactory {

    ICourse createCourse();

    INote createNote();

    IVideo createVideo();


}
