package spring;

import aop.Audience;
import aop.Performance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * ConcertConfig
 *
 * @author gang.wang
 * @date 2018/07/31
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {

    @Bean
    public Performance performance(){return new Performance();}

    @Bean
    public Audience audience(){
        return new Audience();
    }
}
