package Builder.Products;

public class Car {
    public String model;
    public double price;
    public int manufactureYear;
    public boolean isSportsCar;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setManufactureYear(int year) {
        this.manufactureYear = year;
    }

    public void setSportsCar(boolean isSportsCar) {
        this.isSportsCar = isSportsCar;
    }

    public void describe() {
        System.out.println("-------------------Car--------------");
        System.out.println("Model: " + this.model);
        System.out.println("Price: " + this.price);
        if (this.isSportsCar) System.out.println("Sports model");
        if (this.manufactureYear != 0) System.out.println("Manufactured in : " + this.manufactureYear);
    }
}
