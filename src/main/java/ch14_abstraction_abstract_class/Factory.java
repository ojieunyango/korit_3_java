package ch14_abstraction_abstract_class;

public abstract class Factory {

    private String name;

    //메서드 정의
    public abstract void produce(String model);

    public abstract void manage();


    public Factory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


        /*
        아까 팝업 뜨는거 확인해보니까 method body 라느 부분이 저희가 말하는 구현부에 해당하고 코드로는 {} 라는 사실을 확인할수있었습니다

        근데 abstract가 접근 지정자와 리턴 타입 사이에 명시가 되면 클래스도 동일하게 접근 지정자와 class사이에 abstract가 있어야만
        합니다
        왜?
        추상 메서드가 하나라도 있으면 추상 클래스가 되야하니까

         */

        public void displayInfo() {
            System.out.println("이제 오류 안나야 합니다");
        }
    }

