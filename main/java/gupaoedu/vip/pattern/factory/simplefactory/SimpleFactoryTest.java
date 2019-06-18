package gupaoedu.vip.pattern.factory.simplefactory;

import gupaoedu.vip.pattern.factory.ICourse;
import gupaoedu.vip.pattern.factory.JavaCourse;

/**
 * 2019/6/17
 * suh
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {

        CourseFactory factory = new CourseFactory();



//        ICourse course = factory.create("gupaoedu.vip.pattern.factory.JavaCourse");
        ICourse course = factory.create(JavaCourse.class);

        course.record();

    }
}
