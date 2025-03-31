package ch18_static.singleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Factory {
    private String factoryName;

    public SmartPhone produceSmartPhone() {
        System.out.println(factoryName + "에서 스마트폰을 생산합니다.");

        String model = "갤럭시 S26"; //스마트폰 필드에 대입됨
        String serial = null;

        Samsung samsung = Samsung.getInstance();
        // 삼성 객체 생성 - 싱글톤 적용햇으니깐 매번 동일한 객체가 대입됨

        serial = samsung.createSerialNumber(model);
        // 여기서 스마트폰 객체생성 = AllArgsConstructor 로 만들기도함
        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model, serial);

        return smartPhone;
    }
}