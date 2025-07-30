package Builder.Builder;

import Builder.Products.Car;

public class CarBuilder extends Builder<Car> {

    @Override
    protected Car createProduct() {
        return new Car();
    }

    public CarBuilder setModel(String model) {
        getProduct().setModel(model);
        return this;
    }

    public CarBuilder setManufacturingYear(int year) {
        getProduct().setManufactureYear(2025);
        return this;
    }

    public CarBuilder setPrice(double price) {
        getProduct().setPrice(price);
        return this;
    }

    public CarBuilder setIsSportsCar(boolean isSportsCar) {
        getProduct().setSportsCar(isSportsCar);
        return this;
    }

    @Override
    public Car build() {
        if (getProduct().model == null || getProduct().price == 0) {
            throw new IllegalStateException("Required model and price of the car");
        }
        return super.build();
    }
}
