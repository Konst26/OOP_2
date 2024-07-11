public abstract class WheelTransport implements Transport {
    private final String modelName;
    private final int wheelsCount;


    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }


    public abstract void updateType();
}
