package jio.springboot_developer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @DisplayName("1+2는 3이다.") //테스트 이름
    @Test //테스트 메서드
    public void JunitTest(){
        int a=1;
        int b=2;
        int sum=3;

        Assertions.assertEquals(a+b,sum);;
    }


}
