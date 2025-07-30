package Builder.Director;

import Builder.Builder.Builder;

public class CarDirector<T> {
    private final Builder<T> builder;

    public CarDirector(Builder<T> builder) {
        this.builder = builder;
    }

    public T constructBudgetCar() {
        return builder
                .setModel("Honda amaze")
                .setPrice(20000)
                .build();
    }

    public T constructSportsCar() {
        return builder
                .setModel("Lamborghini")
                .setPrice(250000)
                .setManufacturingYear(2025)
                .setIsSportsCar(true)
                .build();
    }
}
