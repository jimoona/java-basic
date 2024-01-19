package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        this.name = name; //나의 멤버변수를 넣을 때. this를 안 넣으면 가장 가까운 윗줄의 name 매개변수가 바뀜
        this.age = age;
        this.grade = grade;
    }
}
