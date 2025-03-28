package ch16_objects.teacher;

import ch16_objects.Teacher;

import java.util.Objects;

public class Teacher01 {
    public Teacher01() {
    }

    public Teacher01(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return name+ "의 근무지는 "+ schoolName + "입니다.";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Teacher01 teacher)) return false;
        return Objects.equals(name, teacher.name) && Objects.equals(schoolName, teacher.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }
}
}
