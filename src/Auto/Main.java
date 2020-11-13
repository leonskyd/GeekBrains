package Auto;

public class Main {

    public static void main(String[] args) {

        Car bmwSeven = new BMW(new Engine(), "R16", "sedan", "velvet");
        Car scaniaOne = new Scania(new Engine(), "R20", "low", "12 feet");
        Car bmwFive = new BMW(new Engine(), "R15", "hatchback", "leather", Colour.BLACK);
        bmwSeven.run();

        Car[] cars = {bmwSeven, scaniaOne};

        for (Car car : cars) {
            car.voice();
        }



    }
}
