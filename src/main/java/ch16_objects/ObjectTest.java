package ch16_objects;

public class ObjectTest {
    //필드선언
    private String name;
    private String address;

    public ObjectTest() {
    }

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getAddress() {
        return  address;
    }

    public void setAddress(String address) {
        this.address = address;

    }
    void displayInfo(){
        System.out.println("이름: "+name);
        System.out.println("주소: "+ address);
    }
    String displayInfo1(){
        return "name: " + name + "\n address: "+address;

    }

    @Override
    public String toString() {
        return "name: " + name + "address: "+address;
    }

}
