package static1;

public class Data3 {
    public String name;
    public static int count; //static

    public Data3(String name){
        this.name = name;
        Data3.count++; //내 클래스 안이니까 Data3은 생략 가능
    }
}
