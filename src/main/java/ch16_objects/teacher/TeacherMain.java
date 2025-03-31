package ch16_objects.teacher;

import ch16_objects.Teacher;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher01 teacher01 = new Teacher01("안근수", "코리아아이티");
        Teacher01 teacher02 = new Teacher01("안근수", "코리아아이티");

        boolean result1 = teacher01.equals(teacher02);
        System.out.println(result1); //true  equals 주소지가 아니라 속성값이 같은지 확인
        boolean result2 = teacher01 == teacher02;
        System.out.println(result2); //false  주소지까지 같은지 확인

        //String 상에서 지난번에 굳이 new String("안녕하세요")와 "안녕하세요" 가 false 인걸 증명했는데 누가 굳이 new String()만듬??

        String[] strArray = {"안녕하세요", "안녕하세요"};
        boolean result3 = strArray[0].equals(strArray[1]);
        System.out.println(result3);  //true
        boolean result4 = strArray[0] == strArray[1];
        System.out.println(result4);//true

        String[] strArray2 = {"안녕하세요", "안녕하세요"};
        boolean result5 = strArray[0].equals(strArray2[0]);
        System.out.println(result5); //true
        boolean result6 = strArray[0] == strArray2[0];
        System.out.println(result6);  //true

        System.out.println(teacher01);
        System.out.println(teacher02);

        Class tClass = teacher01.getClass();
        System.out.println(tClass);
        System.out.println(teacher01.getClass().getSimpleName());
        System.out.println(tClass.getSimpleName());

        Field[] fields = tClass.getDeclaredFields();
        System.out.println(fields);
        for (int i = 0; i < fields.length; i++) {
            System.out.println("필드명 출력: " + fields[i].getName());
            System.out.println("패키지 + 클래스 명 출력: " + fields[i].getType());
            System.out.println("클래스명 출력: " + fields[i].getType().getSimpleName());
        }
        for (Field field : fields) {
        System.out.println("필드명 출력: " + field.getName());
        System.out.println("패키지 + 클래스 명 출력: " + field.getType());
        System.out.println("클래스명 출력: " + field.getType().getSimpleName());
        }

        Method[] methods = tClass.getDeclaredMethods();
        for (int i = 0; i< methods.length; i ++){
                System.out.println("메서드명 출력: "+ methods[i].getName());
                System.out.println("리턴 타입 출력: "+methods[i].getReturnType());
            }
        for (Method method:methods){
                System.out.println("메서드명 출력: "+ method.getName());
                System.out.println("리턴 타입 출력: "+method.getReturnType());
            }
        ch16_objects.Teacher teacher=new ch16_objects.Teacher("안근수", "코리아아이티");


        }


    }