package Ref;

public class NullMain2 {

    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //발생. null에 점 찍었을 때. 가려고 하는데 주소가 없음
        System.out.println("data = " + data.value);
    }

    // 참조할 주소, 인스턴스 존재 X
    //바깥으로 걍 빠짐. 그 아래 수행X
}
