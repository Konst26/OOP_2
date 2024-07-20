public abstract class WheeledTransport implements Transport {
    private final String modelName;
    private final int wheelsCount;

    public WheeledTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public String getModelName () {
        return modelName;
    }
    public int getWheelsCount () {
        return wheelsCount;
    }
    public abstract void updateTyre ();
}