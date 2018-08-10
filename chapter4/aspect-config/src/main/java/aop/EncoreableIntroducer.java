package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "aop.JazzMusic+",
            defaultImpl = ClassicMusic.class)
    public static Encoreable encoreable;
}
