package spring;

import java.util.ArrayList;
import java.util.List;

import aop.BlankDisc;
import aop.CompactDisc;
import aop.TrackCounter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        BlankDisc blankDisc = new BlankDisc();
        blankDisc.setTitle("Sgt. Pepper's Lonely Hearts Club Band");
        blankDisc.setArtist("The Beatles");
        List<String> list = new ArrayList<String>();
        list.add("Sgt. Pepper's Lonely Hearts Club Band");
        list.add("With a Little Help from My Friends");
        list.add("Lucy in the sky with Diamonds");
        list.add("Getting Better");
        list.add("Fixing a Hole");

        blankDisc.setTracks(list);
        return blankDisc;
    }

    @Bean
    public TrackCounter trackCounter() {
        return new TrackCounter();
    }
}
