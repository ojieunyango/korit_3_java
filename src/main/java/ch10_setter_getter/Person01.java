package ch10_setter_getter;

public class Person01 {
    private String name;
    private int age;

    //기본생성자, 매개변수가 하나인 생성자 두개
    //매개변수가 두개인 생성자 하나 총네개를 정의 하시오


    public Person01() {
    }

    public Person01(String name) {
        this.name = name;
    }

    public Person01(int age) {
        this.age = age;
    }

    public Person01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Setter의 명칭: set + 필드명으로 짓는편
    //구조: call2() 유형으로 정의됨

    public void setName(String name1) {
        //이름이 글자수가 4 초과라면 입력이 불가능하게끔 로직을 추가하시오
        //"불가능한 이름입력입니다" 라고 출력되도록하고
        //이름 바꾸는데 성공했다면
        //변경전이름:
        //변경후이름:
        //이 출력되도록하세요, 여기서 name.length()응용해야합니다
        //그리고 이거 다끝나셧으면  라고 입력하고 person1.setName("레오나르도 디카프리오")
        //불가능한 이름 입력입니다를 출력시키시오
        //그리고 person1.setName()에 여러분 이름을 입력하어0
        //변경전이름:
        //변경후이름: 여러분 이름이 나올수있도록 작성하시오
        //getAge() 메서드도 정의하시오

        if (name.length() > 4) ;
        System.out.println("불가능한 이름 입력입니다.");
        return;
//
//        System.out.println("방금전이름: "+this.name);
//        this.name =name;
//        System.out.println("변경후이름: "+name);
}
        public void setAge(int age){
        //0미만, 200초과의 값이 입력되엇을 경우 "불가능한 나이 입력입니다.
            //라고 출력하고 값을 바꾸지 않도록 작성할 예정
            if (age < 0 || age >200){
                System.out.println("불가능한 나이 입력입니다.");
                return;// 메서드내에서 리턴하면 메서드 그대로 종료
            }
            System.out.println("나이가 입력되었습니다.");
            System.out.println("방금전나이: "+this.age);
            this.age =age;
            System.out.println("변경후나이: "+age);


    }
   //Getter 명칭 : get + 필드명으로 짓는 편
    //구조: call3() -> 매개변수 없음/ 리턴 잇음
    //데이터의 조회만하면 되기 때문에 매개변수가 요구되지않음
    //필드와 동일한 자료형의 리턴값이 요구됨 -> void 아님
    public String getName(){
        return name;
    }
}
