package Builder;

import Builder.Builder.CarBuilder;
import Builder.Builder.CarManualBuilder;
import Builder.Director.CarDirector;
import Builder.Products.Car;
import Builder.Products.CarManual;

public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        CarManualBuilder carManualBuilder = new CarManualBuilder();

        CarDirector<Car> carDirector = new CarDirector<Car>(carBuilder);
        CarDirector<CarManual> carManualDirector = new CarDirector<CarManual>(carManualBuilder);

        carDirector.constructBudgetCar().describe();
        carManualDirector.constructSportsCar().describe();
    }
}
