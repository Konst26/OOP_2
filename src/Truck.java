public abstract class Truck extends MotorTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Снимаем кабину и проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        updateType();
        checkEngine();
        checkTrailer();
    }
}