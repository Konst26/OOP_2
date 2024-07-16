public abstract class MotorTransport extends WheelTransport {
    public MotorTransport (String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public abstract void checkEngine();

    @Override
    public void service() {

    }
}