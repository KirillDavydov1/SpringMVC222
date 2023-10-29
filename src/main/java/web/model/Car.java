package web.model;

public class Car {

    private boolean isNew;
    private String model;
    private int series;

    public Car() {
    }

    public Car(boolean isNew, String model, int series) {
        this.isNew = isNew;
        this.model = model;
        this.series = series;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "isNew=" + isNew +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
