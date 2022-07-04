package hello.core.xml;

import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class XmlAppContext {

    //xml 설정 연습
    @Test
    void xmlAppcontext(){
        ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");

        MemberService memberService = ac.getBean("memberService", MemberService.class);

        Assertions.assertThat(memberService).isInstanceOf(MemberService.class);
    }
}
