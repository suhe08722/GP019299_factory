package gupaoedu.vip.pattern.factory.abstractfactory;

import javax.swing.*;

/**
 * 2019/6/18
 * suh
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        factory.createCourse().record();
        factory.createNote().record();
        factory.createVideo().record();

        ICourseFactory factory1 = new PythonFactory();
        factory1.createVideo().record();
        factory1.createNote().record();
        factory1.createCourse().record();

    }
}
