package ch17_bean;

public class UseEntityMain {
    public static void main(String[] args) {

        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(1);
        userEntity.setPassword(9876);
        userEntity.setEmail("a@test.com");
        userEntity.setName("양지은");

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUsername(2);
        userEntityLombok.setPassword(1357);
        userEntityLombok.setEmail("b@test.com");
        userEntityLombok.setName("김");

        System.out.println("user name: "+userEntityLombok.getUsername());
        System.out.println("password: "+userEntityLombok.getPassword());
        System.out.println("email: "+ userEntityLombok.getEmail());
        System.out.println("name: "+ userEntityLombok.getEmail());

    }
}
