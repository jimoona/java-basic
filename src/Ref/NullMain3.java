package Ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData(); //x001
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);

        System.out.println("bigData.data.value" + bigData.data.value);
        // bigData. -> x001로 찾아감
        // data. -> null로 찾아감(초기값)
    }
}
