package Builder.Builder;

public abstract class Builder<T> {
    private final T product;

    public Builder() {
        this.product = createProduct();
    }

    protected abstract T createProduct();

    public abstract Builder<T> setModel(String model);

    public abstract Builder<T> setManufacturingYear(int year);

    public abstract Builder<T> setPrice(double price);

    public abstract Builder<T> setIsSportsCar(boolean isSportsCar);

    public T getProduct() {
        return this.product;
    }

    public T build() {
        return this.product;
    }
}
