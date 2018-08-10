package aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:aop/trackCounter.xml"})
public class TrackCounterTest {

    @Autowired
    public CompactDisc compactDisc;

    @Autowired
    public TrackCounter trackCounter;

    @Test
    public void play(){
        compactDisc.playTrack(1);
        compactDisc.playTrack(2);
        compactDisc.playTrack(3);
        compactDisc.playTrack(3);
        compactDisc.playTrack(3);
        compactDisc.playTrack(3);
        compactDisc.playTrack(7);
        compactDisc.playTrack(7);

        compactDisc.play();

        assertEquals(1,trackCounter.getPlayCount(1));
        assertEquals(1,trackCounter.getPlayCount(2));
        assertEquals(4,trackCounter.getPlayCount(3));
        assertEquals(0,trackCounter.getPlayCount(4));
        assertEquals(0,trackCounter.getPlayCount(5));
        assertEquals(0,trackCounter.getPlayCount(6));
        assertEquals(2,trackCounter.getPlayCount(7));
    }
}
