package ch18_static.singleton;

import ch18_static.singleton.products.ProductView;
import lombok.Getter;

public class Samsung {
    //정적변수
    private static Samsung instance;
    // 멤버 변수
    @Getter
    private String company;
    private int serialNumber;


    private Samsung() {
        company = getClass().getSimpleName();
        serialNumber = 20250000;
    }

    public static Samsung getInstance() {
        if (instance == null) {
            instance = new Samsung();
        }
        return instance;

    }

    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber;
    }
}