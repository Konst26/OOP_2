public class Car extends MotorTransport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        for (int i = 1; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку у " + getModelName());
        }
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель " + getModelName());
    }

    @Override
    public void service() {
        updateType();
        checkEngine();
    }

    @Override
    public void updateType() {

    }
}