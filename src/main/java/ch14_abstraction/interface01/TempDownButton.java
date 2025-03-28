package ch14_abstraction.interface01;

public class TempDownButton extends Button{
    @Override
    public void onPressed() {
        super.onPressed();
        System.out.println("온도를 한칸 내립니다.");
    }

    @Override
    public void onDown() {
        System.out.println("온도를 계속 내립니다.");
    }

}
