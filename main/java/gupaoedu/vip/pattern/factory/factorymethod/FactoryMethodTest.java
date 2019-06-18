package gupaoedu.vip.pattern.factory.factorymethod;

import gupaoedu.vip.pattern.factory.ICourse;

/**
 * 2019/6/17
 * suh
 * 創建對象需要大量重複的代碼，遵循開閉原則，不修改其他代碼，只新增代碼
 **/
public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();
        ICourse course = factory.create();
        course.record();
    }
}
