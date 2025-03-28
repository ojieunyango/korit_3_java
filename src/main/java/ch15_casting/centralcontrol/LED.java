package ch15_casting.centralcontrol;

public class LED implements Power{
    @Override
    public void on() {
        System.out.println("LED가 켜집니다.");
    }

    @Override
    public void off() {
        System.out.println("LED가 꺼집니다.");
    }
}
