package aop;

import java.util.Map;
import java.util.HashMap;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * TrackCounter
 *
 * @author gang.wang
 * @date 2018/07/31
 */
@Aspect
public class TrackCounter {
    private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();

    @Pointcut("execution(* aop.CompactDisc.playTrack(int)) " + "&& args(trackNumber)")
    public void trackPlayed(int trackNumber) {
    }

    @After("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber) {
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber, currentCount + 1);
    }

    public int getPlayCount(int trackNumber) {
        return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
    }
}
