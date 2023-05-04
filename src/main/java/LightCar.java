import java.util.List;

public class LightCar extends Transport <DriveB> implements Competing {
    private final int pitStopTime;
    private final int maxSpeed;
    private final int bestLapTime;

    private BodyCar BodyCar;

    private boolean diagnostickPassed;

    public LightCar(String brand, String model, double engineVolume, int pitStopTime, int maxSpeed, int bestLapTime, BodyCar bodyCar, List <Mechanic> mechanicList) {
        super(brand, model, engineVolume, maxSpeed, mechanicList);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
        this.BodyCar = BodyCar;
        this.mechanicList = mechanicList;



    }


    public BodyCar getBodyCar() {
        return BodyCar;
    }

    public void setBodyCar(BodyCar bodyCar) {
        this.BodyCar = bodyCar;
    }

    public void printType() {
        if (getBodyCar() == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getBodyCar());
        }
    }


    @Override
    boolean passDiagnostics() {
        System.out.println(getBrand() + getModel() + " Необходимо пройти диагностику ");
        return true;
    }


    void startMove() {
        System.out.println("Автомобиль начал движение");
    }

    @Override
    void finish() {

    }

    void finishMove() {
        System.out.println("Автомобиль закончил движение");
    }

    @Override
    public void getPitStop() {
        System.out.println("Пит-Стоп" + pitStopTime);
    }

    @Override
    public void getBestLapTime() {

    }

    @Override
    public void getBestTime() {
        System.out.println("Лучшее время" + bestLapTime);

    }

    @Override
    public void getMaxSpeed() {
        System.out.println("Максимальная скорость" + maxSpeed);
    }


    public String repair() {
        return " Ремонт подвески ";

    }
}