package jio.springboot_developer;

import org.junit.jupiter.api.BeforeAll;

public class JUnitCycleTest {
    @BeforeAll //전체 테스트를 시작하기 전에 1회 실행하므로 메서드는 static으로 선언
    static void beforeall(){
        System.out.println("@BeforeAll");
    }
}
