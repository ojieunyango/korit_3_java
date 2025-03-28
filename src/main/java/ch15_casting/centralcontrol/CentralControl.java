package ch15_casting.centralcontrol;

public class CentralControl {
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }
    //전자제품들을 centralcontrol의 객체의 필드인 배열에 집어넣는 메서드
    public void addDevice(Power device){
    // 왜 매개변수가 power인지 고려할 필요
        int emptyIndex = checkEmpty();
        if (emptyIndex==-1){
            System.out.println("더이상 장치를 연결할수없습니다.");
            return;
        }
        deviceArray[emptyIndex]=device;
        System.out.println(device.getClass().getSimpleName()+"장치가 연결되었습니다. ");
        /*
        객체명.getClass()-> 패키지명을 포함한 클래스명이 출력되는 getter
        객체명.getClass().getSimpleName() -> 클래스명만 출력되는 getter
         */
    }
    //배열갯수는 정해져있는데 객체가 너무 많으면 문제 생길것 같아서 메서드를 정의하겠습니다
   private int checkEmpty() {  //비어있는 배열의 index넘버를 반환
       // 반복문을 사용하게 될겁니다. 배열 내부에서 비어있는 index를 가져와야하니깐 순서대로 작동하는 반복문 특성상 가장빠른 index가 return이 되겠습니다
       for (int i = 0; i < deviceArray.length; i++) {

       }
       for (int i = 0; i < deviceArray.length; i++) {
           if (deviceArray[i] == null) {
               return i;
           }
       }
       return -1;
   }
        /*
        java의 index 넘버에는 음수값이 없기 때문에 (파이썬에서는 마이너스 인덱스있음) 실패를 나타낼때는 -1 을 쓰는 경우가 많습니다
        하지마 0과 가까운 수이다보니 -100이든 아예 return값으로 나올수없을만한 음수를 지정하는 경우도 있는데 나중에 addDevice()메서드를
        if(checkEmpty() == - 45643)로 쓰고 싶지않으면 -1을 쓰는게 가장 보편적입니다.
         */

    public void powerOn(){
           //배열내부에 있는 element들은 (Power의 서브클래스들의 인스턴스) Power를 implement 했기때문에
       //전부 .on()과 .off()를 공통적으로 가집니다.
       //그러면 배열내부를 반복문으로 돌려서 각각 .on()을 실행시켜야겟음
       for (Power device : deviceArray){
         if (device == null){
             System.out.println("장치가 없어 전원을 켜지않았습니다.");
             continue;//다음 반복문으로 건너뛰는 명령문
         }
         device.on();
       }
    public void displayInfo(){
           for (int i = 0; i < deviceArray.length; i++){
               if (deviceArray[i] == null){
                   System.out.println("슬롯 [ "+ (i+1)+" ] 번: Empty");
               }
           }
    public void powerOff(){
                for(int i = 0 ; i < deviceArray.length ; i++) {
                    if(deviceArray[i] == null) {
                        System.out.println("장치가 없어 전원을 끄지 못합니다.");
                        continue;
                    }
                    deviceArray[i].off();
                }
            }
            }
        }
    }
}

