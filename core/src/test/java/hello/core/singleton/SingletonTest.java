package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    @DisplayName("스프링 없는 순수한 DI 컨테이너")
    void pureContainer() {
        AppConfig appConfig = new AppConfig();
        MemberService memberService1 =  appConfig.memberService();
        MemberService memberService2 =  appConfig.memberService();

        Assertions.assertThat(memberService1).isNotSameAs(memberService2);
    }

    @Test
    @DisplayName("싱글톤 패턴을 사용한 객체 사용")
    void singleTonTest() {
        SingletonService instance1 = SingletonService.getInstance();
        System.out.println("instance1 = " + instance1);
        SingletonService instance2 = SingletonService.getInstance();
        System.out.println("instance2 = " + instance2);
        Assertions.assertThat(instance1).isSameAs(instance2);
    }
}
