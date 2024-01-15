package generic.cls;

import generic.cls.Cup;   // 제너릭 타입의 cup 클래스를 임포트
public class GenericClass2Demo {
    public static void main(String[] args) {
        Cup<Beer> c = new Cup<Beer>(); // Beer타입의 Cup 객체 생성
        
        c.setBeverage(new Beer());   // Beer 객체가 반환되므로 타입 변환 필요 없음
        Beer b1 = c.getBeverage();

        //c.setBeverage(new Boricha()); // Beer 타입의 cup 객체에 boricha 담을 수 없음
        b1 = c.getBeverage();
    }
}