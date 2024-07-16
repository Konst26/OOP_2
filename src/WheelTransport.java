public abstract class WheelTransport implements Transport {
    private final String modelName;
    private final int wheelsCount;

    protected WheelTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }


    public abstract void updateType();
}
