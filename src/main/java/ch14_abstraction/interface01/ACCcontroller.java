package ch14_abstraction.interface01;

public class ACCcontroller {
    private PowerButton powerButton;
    private TempDownButton tempdownbutton ;
    private TempUpButton tempUpButton;

    public ACCcontroller(PowerButton powerButton, TempDownButton tempdownbutton, TempUpButton tempUpButton) {
        this.powerButton = powerButton;
        this.tempdownbutton = tempdownbutton;
        this.tempUpButton = tempUpButton;
    }

    public void onPressedTempDownButton() {
       tempdownbutton.onPressed();
    }
    public void onDownTempDownButton() {
        tempdownbutton.onDown();
    }
    public void onPressedTempUpButton(){
        tempUpButton.onPressed();
    }
    public void onUpTempUpButton(){
        tempUpButton.onUp();
    }

}
