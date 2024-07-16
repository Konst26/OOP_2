public class Main {
    private static ServiceStation station;

    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6) {
            @Override
            public void updateType() {

            }
        };
        Truck truck2 = new Truck("truck2", 8) {
            @Override
            public void updateType() {

            }
        };

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 3);

        station.check(car);
    }
}