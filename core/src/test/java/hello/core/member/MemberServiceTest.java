package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @DisplayName("join/find Test")
    @Test
    void join() {
        // given: ~이 주어지고
        Member member = new Member(1L, "memberA", Grade.VIP);

        // when: ~일 때
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // then: ~하게 된다
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
