package web.model;

public class Car {
    private String model;
    private int year;
    private int dateOfSail;


    public Car(String model, int year, int dateOfSail) {
        this.model = model;
        this.year = year;
        this.dateOfSail = dateOfSail;
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

    public int getDateOfSail() {
        return dateOfSail;
    }

    public void setDateOfSail(int dateOfSail) {
        this.dateOfSail = dateOfSail;
    }

    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + ", year=" + year + ", dateOfSail=" + dateOfSail + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;
        return year == car.year && dateOfSail == car.dateOfSail && model.equals(car.model);
    }

    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + year;
        result = 31 * result + dateOfSail;
        return result;
    }
}
