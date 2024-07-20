public class Car extends MotorTransport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

@Override
    public void updateTyre() {
        for (int i = 1; i < getWheelsCount(); i++) {
            System.out.println("Меняем " + i + " покрышку у " + getModelName());
        }
    }
@Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель " + getModelName());
    }

    @Override
    public void service() {
        updateType();
        checkEngine();
    }

    private void updateType() {
        System.out.println("Менияем покрышку");
    }
}