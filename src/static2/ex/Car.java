package static2.ex;

public class Car {
    //Car클래스의 멤버변수 먼저 설정(멤버변수에는 인스턴스변수와 클래스변수가 있다.)
    private static int totalCars; //값을 누적해야->클래스변수(정적변수, static변수)
    private String name; //이름이 인스턴스마다 다름->인스턴스변수

    public Car(String name) {
        System.out.println("차량 구입, 이름: " + name);
        this.name = name; //지역 변수(매개변수)인 name에 전달된 값을
        totalCars++;
    } // 생성자의 이름은 클래스의 이름과 같다.(대문자로 시작) 반환 타입이 없다.

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + totalCars);
    } //이건 메서드
    //클래스에서 불러서 static(CarMain에서 Car.showTotalCars())
    //어차피 static변수만 사용
}
