public class Bicycle extends WheelTransport {

    public Bicycle(String modelName, int wheelsCount) {
        super();
    }

    @Override
    public void updateType() {

    }

    public void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда");
    }

    @Override
    public void service() {
        updateTyre();
    }
}
