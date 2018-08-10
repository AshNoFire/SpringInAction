package aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:aop/audienceAround.xml"})
public class AudienceAroundTest {

    @Autowired
    public Performance performance;

    @Autowired
    public AudienceAround audienceAround;

    @Test
    public void play(){
        performance.perform();
    }
}
