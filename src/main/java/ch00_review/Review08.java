package ch00_review;
/*
Constructor (생성자): 객체가 생성될때 호출되는 특별한 메서드
특징: 클래스명과 생성자명은 동일, 기본생성자/매개변수 생성자
-기본생성자
정의하지않아도 default로 있지만 생성자를 하나라도 정의하는 순간 기본생성자도 적어야함
-매개변수 생성자
객체를 생성할때 필수적으로 요구되어지는 속성을 명시한 생성자
*리턴이 없으면 기본생성자나 매개변수 생성자
형식

-기본생성자: 클래스명(){}
-매개변수 생성자: 클래스명(매개변수1, 매개변수2){
                this.매개변수1 =매개변수1;
                this.매개변수2 =매개변수2;
                }

 생성방법
 1 일일이 타이핑한다
 2 alt + ins
 */
class Building {
    //필드선언
    int wall;
    int door;
    int window;
    boolean elevator;
    boolean stair;
    String title;
    //기본 생성자 정의'
    //이름만 아는 매개변수 정의
    //전부다 있는 매개변수 생성자 정의
    /*
      Review08 클래스에서 Building 클래스의 객체를 생성
        1. building1 -> 기본생성자로 정의
            엘리베이터 - 없음
            계단 - 없음
            벽 - 5
            문 - 2
            창문 - 6
            이름 - 재팬아이티타운

        2. building2 -> 이름만 있는 매개변수 생성자로 정의
            엘리베이터 - 있음
            계단 - 있음
            벽 - 8
            문 - 4
            창문 - 230
            이름 - 코리아아이티타운

        3. building3 -> 전부 다 사용한 매개변수 생성자로 정의
            엘리베이터 - 없음
            계단 - 있음
            벽 - 3
            문 - 1
            창문 - 0
            이름 - 컴퓨터타운

        4. showInfo() 메서드를 정의 -> call1() 유형으로 정의
        building3.showInfo(); 와 같은 방식으로 호출
        실행 예
        이 건물은 컴퓨터타운이고, 벽이 3개, 문이 1개, 창문이 0개 있습니다.
        엘리베이터 유무 : false
        계단 유무 : true

   */

    public Building() {
    }

    public Building(int wall, int door, int window, String title) {
        this.wall = wall;
        this.door = door;
        this.window = window;
        this.title = title;
    }

    public Building(int wall, int door, int window, boolean elevator, boolean stair, String title) {
        this.wall = wall;
        this.door = door;
        this.window = window;
        this.elevator = elevator;
        this.stair = stair;
        this.title = title;
    }

    public int getWall() {
        return wall;
    }

    public int getDoor() {
        return door;
    }

    public int getWindow() {
        return window;
    }

    public String getTitle() {
        return title;
    }

    public boolean isElevator() {
        return elevator;
    }

    public boolean isStair() {
        return stair;
    }

    public void setWall(int wall) {
        this.wall = wall;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public void setElevator(boolean elevator) {
        this.elevator = elevator;
    }

    public void setStair(boolean stair) {
        this.stair = stair;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void showInfo() {
        System.out.println("이건물은 "+ title+"이고, 벽이 "+wall+"개, 문이 "+door+"창문이 "+window+"개있습니다.");
        System.out.println("엘레베이트: "+elevator+"계단: "+stair);
    }
}
public class Review08 {
    public static void main(String[] args) {
        Building building = new Building();
        Building building1 = new Building(8,4,230,"코리아아이티타운");
        Building building2 = new Building(3,1,0,false,true,"컴퓨터타운");

        building.setWall(5);
        building.setDoor(2);
        building.setWindow(6);
        building.setElevator(false);
        building.setStair(false);
        building.setTitle("재패아이티타운");


        building1.setElevator(true);
        building1.setStair(true);



        building.showInfo();
        building1.showInfo();
        building2.showInfo();


    }
}
