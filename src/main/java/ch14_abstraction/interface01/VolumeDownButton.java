package ch14_abstraction.interface01;

public class VolumeDownButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("음량을 한칸내립니다.");
    }

    @Override
    public void onDown() {
        System.out.println("음량을 계속 내립니다.");
    }

    @Override
    public String onUp() {
        return super.onUp();
    }
}
