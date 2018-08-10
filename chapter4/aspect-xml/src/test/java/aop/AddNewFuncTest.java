package aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:aop/addNewFunc.xml"})
public class AddNewFuncTest {

    @Autowired
    public JazzMusic jazzMusic;

    @Test
    public void play() {
        CompactDisc compactDisc = (CompactDisc) jazzMusic;
        compactDisc.playTrack(7);
        jazzMusic.perform();
    }
}
