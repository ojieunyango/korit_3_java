package ch14_abstraction.interface01;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(), new ChannelDownButton(), new ChannelUpButton());

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onUpChannelUpButton();

    }
}
