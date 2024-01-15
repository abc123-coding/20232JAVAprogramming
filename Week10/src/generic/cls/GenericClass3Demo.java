package generic.cls;

public class GenericClass3Demo {
    public static void main(String[] args) {
        Cup c = new Cup(); // 구체적 타입이 없으므로 raw 타입 제너릭 클래스 

        c.setBeverage(new Beer());  // Raw 타입의 Cup 객체이므로 어떤 타입 객체든지 추가 가능

//        Beer beer = c.getBeverage();    // 어떤 타입이 반환되는지 모르므로 타입 변환 필요
        Beer beer = (Beer) c.getBeverage(); // 명시적 형 변환이 필요하다 ★★★
    }
}