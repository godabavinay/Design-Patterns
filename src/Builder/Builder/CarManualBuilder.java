package Builder.Builder;

import Builder.Products.CarManual;

public class CarManualBuilder extends Builder<CarManual> {

    @Override
    protected CarManual createProduct() {
        return new CarManual();
    }

    public CarManualBuilder setModel(String model) {
        getProduct().setModel(model);
        return this;
    }

    public CarManualBuilder setManufacturingYear(int year) {
        getProduct().setManufactureYear(2025);
        return this;
    }

    public CarManualBuilder setPrice(double price) {
        getProduct().setPrice(price);
        return this;
    }

    public CarManualBuilder setIsSportsCar(boolean isSportsCar) {
        getProduct().setSportsCar(isSportsCar);
        return this;
    }


    @Override
    public CarManual build() {
        if (getProduct().model == null || getProduct().price == 0) {
            throw new IllegalStateException("Required model and price of the car");
        }
        return super.build();
    }
}
