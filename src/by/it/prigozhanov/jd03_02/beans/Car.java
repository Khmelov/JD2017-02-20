package by.it.prigozhanov.jd03_02.beans;

/**
 * Created by v-omf on 4/29/2017!
 */
public class Car {

    private String description;
    private int id;
    private int hp;
    private int seats;
    private int fuelConsumption;
    private int luggageCapacity;
    private double price;
    private String location;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(int luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != car.id) return false;
        if (hp != car.hp) return false;
        if (seats != car.seats) return false;
        if (fuelConsumption != car.fuelConsumption) return false;
        if (luggageCapacity != car.luggageCapacity) return false;
        if (Double.compare(car.price, price) != 0) return false;
        if (description != null ? !description.equals(car.description) : car.description != null) return false;
        return location != null ? location.equals(car.location) : car.location == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = description != null ? description.hashCode() : 0;
        result = 31 * result + id;
        result = 31 * result + hp;
        result = 31 * result + seats;
        result = 31 * result + fuelConsumption;
        result = 31 * result + luggageCapacity;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }

    public Car(String description, int id, int hp, int seats, int fuelConsumption, int luggageCapacity, double price, String location) {
        this.description = description;
        this.id = id;
        this.hp = hp;
        this.seats = seats;
        this.fuelConsumption = fuelConsumption;
        this.luggageCapacity = luggageCapacity;
        this.price = price;
        this.location = location;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "description='" + description + '\'' +
                ", id=" + id +
                ", hp=" + hp +
                ", seats=" + seats +
                ", fuelConsumption=" + fuelConsumption +
                ", luggageCapacity=" + luggageCapacity +
                ", price=" + price +
                ", location='" + location + '\'' +
                '}';
    }
}
