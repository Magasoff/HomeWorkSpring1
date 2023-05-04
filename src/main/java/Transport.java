import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public abstract class Transport <T extends Drive> implements Competing {

    private final String brand;
    private final String model;
    private double engineVolume;
    public List<Mechanic> mechanicList;

    public Transport(String brand, String model, double engineVolume, int maxSpeed, List<Mechanic> mechanicList) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.mechanicList = mechanicList;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public List<Mechanic> getMechanics() {
        return mechanicList;
    }

    public boolean checkNeedTransportService() {
        try {
            passDiagnostics();
        } catch (TransportTypeException e) {
            return false;
        }
        return true;
    }

    abstract void startMove();

    abstract void finish();

    abstract void finishMove();

    @Override
    public abstract void getPitStop();

    public abstract void getBestLapTime();

    public abstract void getBestTime();

    public abstract void getMaxSpeed();

    //public abstract boolean diagnostics();

    public abstract void printType();

    abstract boolean passDiagnostics() throws TransportTypeException;

    public abstract String repair();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model) && mechanicList.equals(transport.mechanicList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, mechanicList);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", mechanicList=" + mechanicList +
                '}';
    }
}
