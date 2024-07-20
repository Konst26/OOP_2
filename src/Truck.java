public class Truck extends MotorTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
@Override
public void updateTyre () {
    System.out.println("Менияем покрышку у грузовика");
}
@Override
    public void checkEngine() {
        System.out.println("Снимаем кабину и проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        checkEngine();
        checkTrailer();
        updateTyre();
    }
}