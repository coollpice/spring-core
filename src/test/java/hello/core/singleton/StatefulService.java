package hello.core.singleton;

public class StatefulService {

/*    private int price; //상태 유지 필드 => 무상태로 설계해야하기 때문에 없어야함.

    public void order(String name, int price) {
        System.out.println("name  = " + name + "price = " + price);
        this.price = price;   // <= 이 코드가 문제임. 개선된 코드 ▽
    }

    public int getPrice() {
        return this.price;
    }
*/

    public int order(String name, int price) {
        return price;
    }

    /*싱글톤으로 설계시 하나의 객체를 공유해서 사용하기 때문에, 상태유지를 하는 필드를 사용 하면
        멀티쓰레드 환경에서 안전하지 않다. 그렇기에, 항상 무상태로 설계해야 한다 ( 지역변수, 파라미터 사용)
     */


}
