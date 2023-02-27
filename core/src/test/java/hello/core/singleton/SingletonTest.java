package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    void isSingleTon() {
        AppConfig appConfig = new AppConfig();
        MemberService memberService1 =  appConfig.memberService();
        MemberService memberService2 =  appConfig.memberService();

        Assertions.assertThat(memberService1).isNotSameAs(memberService2);
    }

}
