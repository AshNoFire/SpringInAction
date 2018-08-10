package aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:aop/audience.xml"})
public class AudienceTest {

    @Autowired
    public Performance performance;

    @Autowired
    public Audience Audience;

    @Test
    public void play() {
        performance.perform();
    }
}
