package aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.EncoreableConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = EncoreableConfig.class)
public class EncoreableTest {

    @Autowired
    public JazzMusic jazzMusic;

    @Test
    public void play() {
        Encoreable encoreable = (Encoreable)jazzMusic;
        encoreable.performEncore();
        jazzMusic.perform();
    }
}
