package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + " ,age=" + age + " ,grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }// 생성자의 이름은 class의 이름과 같게, 반환 타입 안 써도 됨
}
