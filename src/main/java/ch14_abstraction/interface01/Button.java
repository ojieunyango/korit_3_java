package ch14_abstraction.interface01;
/*
    인터페이스는 다중 상속이 가능
    단일 상속을 위한 명령어 -> extends
    다중 상속을 위한 명령어 -> implements
 */
public abstract class Button implements Press, Up, Down {
    @Override
    public void onPressed() {
    }

    @Override
    public void onDown() {

    }

    @Override
    public String onUp() {

        return false;
    }
}

