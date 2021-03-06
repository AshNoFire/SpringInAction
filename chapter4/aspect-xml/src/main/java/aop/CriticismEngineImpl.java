package aop;

public class CriticismEngineImpl implements CriticismEngine {

    public CriticismEngineImpl() {
    }

    private String[] criticismPool;

    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }

    public String getCriticism() {
        int i = (int) (Math.random() * criticismPool.length);
        return criticismPool[i];
    }
}
