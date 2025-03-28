package ch14_abstraction.interface01;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController (
                new PowerButton(), new ChannelDownButton(), new ChannelUpButton(), new VolumeDownButton(), new VolumUpButton());

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onUpChannelUpButton();

        //VolumUpButton volumUpButton = new VolumUpButton();
        //System.out.println(volumUpButton.onUp());
        tvRemoteController.onPressedVolumeUpButton(); //위에거 대신 이렇게 쓰는게...
        tvRemoteController.onDownVolumeUpButton();

        //ACCcontroller acCcontroller = new ACCcontroller(new TempDownButton(),new TempUpButton());


    }
}
/*
과제 TempDownButton, TempUpButton, ACCcontroller 파일 생성하고 정의하여
Main에 ACCcontroller 객체 생성하고
전원이 켜졌습니다
온도를 한칸 내립니다
온도를 계속 내립니다
온도를 한 칸 올립니다
온도를 계속 내립니다
 */
