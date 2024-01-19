package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        //1. 변수 선언: Student 타입의 객체(student1)를 받을 수 있는 변수 선언, 공간 할당
        student1 = new Student();
        //2. 객체 생성: 설계도인 학생(Student)클래스를 기반으로 student1이라는 객체(인스턴스)를 메모리에 생성
        //3. 참조값 보관: 객체에 접근할 수 있는 주소 반환. 변수 Student student1에 참조값 보관
        student1.name = "학생1";
        // .을 통해 메모리에 존재하는 객체에 접근(.키워드는 변수(student1)에 들어있는 참조값을 읽어서 메모리에 존재하는 객체에 접근)
        student1.age = 15;
        student1.grade = 90;
        //학생이라는 개념을 만들어서 한 학생의 데이터를 하나로 묶기

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}
