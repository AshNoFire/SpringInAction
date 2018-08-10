package aop;

public aspect CriticAspect {

    private CriticismEngine criticismEngine;

    public CriticAspect() {
    }

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }

    pointcut performance():execution(* perform(..));

    after():performance(){
        System.out.println(criticismEngine.getCriticism());
    }
}
