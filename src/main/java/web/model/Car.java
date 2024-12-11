package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model;
    private int year;
    private int yearOfSail;

    public Car() {
    }

    public Car(String model, int year, int yearOfSail) {
        this.model = model;
        this.year = year;
        this.yearOfSail = yearOfSail;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYearOfSail() {
        return yearOfSail;
    }

    public void setYearOfSail(int yearOfSail) {
        this.yearOfSail = yearOfSail;
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + ", year=" + year + ", dateOfSail=" + yearOfSail + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;
        return year == car.year && yearOfSail == car.yearOfSail && model.equals(car.model);
    }

    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + year;
        result = 31 * result + yearOfSail;
        return result;
    }
}
