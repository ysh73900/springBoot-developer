import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitCycleQuiz {
    // 각각의 테스트를 시작하기 전
    @BeforeEach
    public void beforeEach() {
        System.out.println("Hello!");
    }

    // 모든 테스트를 끝마친 후
    @AfterAll
    public static void AfterAll() {
        System.out.println("Bye!");
    }

    @Test
    public void junitQuiz3() {
        System.out.println("This is first test");
    }

    @Test
    public void junitQuiz4() {
        System.out.println("This is second test");
    }
}
