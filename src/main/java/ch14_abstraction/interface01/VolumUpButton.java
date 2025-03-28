package ch14_abstraction.interface01;

public class VolumUpButton extends Button {
    @Override
    public void onPressed() {
        super.onPressed();
        System.out.println("볼륨을 높여주세요.");
    }


    @Override
    public String onUp() {
        return "볼륨 높이기"+ super.onUp();
    }
}
