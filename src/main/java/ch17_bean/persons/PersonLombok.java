package ch17_bean.persons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@AllArgsConstructor
public class PersonLombok {
    @NonNull    // 필드레벨의 애너테이션
    private final String name;  //name은 비울수없다는 뜻
    private int age;
    // private final String name; 동일하게 빨간줄이 떻지만 lombok을 통해 해결
    //RequiredArgsConstructor는  필드의  final을 감지해서 자동으로 만듬
    //@Date로 수정 -> RequiredArgsConstructor


    @Override
    public String toString() {
        return "이름: " + name + "\n 나이: " + age;
    }
}
