package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    // private 로 new 생성자를 못만들게 함 싱글톤 방식
    private SingletonService() {
    }

    public static SingletonService getInstance() {
        return instance;
    }

}
