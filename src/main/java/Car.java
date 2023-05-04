import java.util.List;

public abstract class Car extends Transport {

    public int maxSpeed;
    public int pitStopTime;
    public int bestLapTime;
    private List<Mechanic> mechanicList;


    public Car(String brand, String model, double engineVolume, int maxSpeed, int pitStopTime, int bestLapTime, List <Mechanic> mechanicList) {
        super(brand, model, engineVolume, maxSpeed, mechanicList);
        this.maxSpeed = maxSpeed;
        this.pitStopTime = pitStopTime;
        this.bestLapTime = bestLapTime;
        this.mechanicList = mechanicList;
    }


    void startMove () {
        System.out.println("Машина едет");
    }

    public void finish() {
        System.out.println("Машина финишировала");
    }

    @Override
    public void getPitStop () {
        System.out.println("Время питстоп" + pitStopTime);
    }

    public void getBestLapTime () {
        System.out.println("Лучшее время" + bestLapTime);
    }

    public void getMaxSpeed () {
        System.out.println("Максимальная скорость" + maxSpeed);
    }

    public boolean diagnostics () {
        System.out.println("Авто" + getBrand() + getModel() + "прошло диагностику");
        return true;
    }

    // public String repair () {
    //    System.out.println("авто" + getBrand() + getModel() + "отремонтировано");

    public interface Competing {
        void pitStop();
        void bestTimeCircle();
        void maxSpeed ();
    }
}