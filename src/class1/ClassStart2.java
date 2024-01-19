package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};
        //같은 데이터 타입끼리 묶기(같은 배열로 변수 이름 통일) -> 배열
        //(변수 이름이 다 달라서 출력 부분을 루프로 돌릴 수 없음.)

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrades[i]);
        }
    }
}
