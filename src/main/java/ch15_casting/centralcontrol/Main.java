package ch15_casting.centralcontrol;

public class Main {
    public static void main(String[] args) {
        //각 클래스의 객체를 생성하겠습니다
        Computer computer1=new Computer();
        LED led1 = new LED();
        Mouse mouse1 = new Mouse();

        CentralControl centralControl = new CentralControl(new Power[2]);
        centralControl.addDevice(computer1);  // 업캐스팅이 암시적으로 일어남
        centralControl.addDevice(led1);
        centralControl.addDevice(mouse1);

        centralControl.powerOn();
    }
}
