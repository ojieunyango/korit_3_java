package ch12_arrays;
/*
향상된 for문 (enhanced for loop)

일반 for 문과의 차이점
    일반  for문의 경우 인덱스 넘버 (주소지)를 명확하게 알고 있어야 하지만 일일이 element의 숫자를 세는 것이 번거롭기때문에 arr01.length
    와 같은 방식으로 int값을 추출해서 대입했습니다

    그런데 잘 생각해보면  for(int i = 0;....)할때 int i는 for문 내부에서 선언됩니다

    이를 응용하여 배열 내의 element를 변수에 대입해버리는 방식으로 index 넘버 (주소지)의 사용없이 적용할수있는  for 반복문이 있는
    이를 향상된 for문이라고 합니다
    제약:
    읽기만 되고 쓰기가 안됩니다 (1-100까지 추출하는건 되는데 1부터 100까지 입력은 불가능)
    형식:
    for(자료형 변수명: 반복가능객체 (배열)){
    반복 실행문
    }
 */
public class Arrays08enhancedfor {
    public static void main(String[] args) {
        int[] numbers = new int[200];
        // 1-100까지 대입하시오

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (i+1);
        }
        //일반 for문 형태로 1-200 까지 출력

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        //향상된 for 문
        for (int number : numbers){
            System.out.println(number + " ");
        }
        String[] names = {"추영우","허남준","서강준","양지은","진기주","이은정","윤현지","박형식", "김성철"};
       //향샹된 for문으로 String[] 배열 읽어오기
        for (String name : names){
            System.out.println(name + " ");
        }

    }
}
