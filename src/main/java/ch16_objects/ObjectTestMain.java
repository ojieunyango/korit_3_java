package ch16_objects;

import org.w3c.dom.ls.LSOutput;

public class ObjectTestMain {
    public static void main(String[] args) {
        String strExample1 = "양지은";
        String strExample2 = new String("양지은");

        boolean result1 = strExample1 == strExample2;
        System.out.println(result1); //false
        boolean result2 = strExample1.equals(strExample2);
        System.out.println(result2); //true

        ObjectTest objectTest = new ObjectTest("양지은", "부산광역시 연제구");
        objectTest.displayInfo();

        ObjectTest objectTest1 = new ObjectTest();
        objectTest.setName("김일");
        objectTest.setAddress("서울특별시 마포구");

        System.out.println(objectTest1.displayInfo1());
        System.out.println(objectTest1);

    }

}
