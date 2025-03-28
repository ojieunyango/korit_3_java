package ch15_casting.centralcontrol;

public class Mouse implements Power{
    @Override
    public void on() {
        System.out.println("마우스가 켜집니다.");
    }

    @Override
    public void off() {
        System.out.println("마우스가 꺼집니다.");
    }
}
