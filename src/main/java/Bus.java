import java.util.List;

public class Bus extends Transport <DriveD> implements  Competing {

    private final int pitStopTime;
    private final int maxSpeed;
    private final int bestLapTime;

    private Size size;

    private List<Mechanic> mechanicList;


    public Bus(String brand, String model, double engineVolume, int pitStopTime, int maxSpeed, int bestLapTime, Size size, List <Mechanic> mechanicList) {
        super(brand, model, engineVolume, maxSpeed, mechanicList);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
        this.size = size;
        this.mechanicList = mechanicList;
    }

    public Size getSize () {return size;}

    public void setSize (Size size) {this.size = size;}

    public void printType () {
        if (getSize() == null) {
            System.out.println("Недостаточно данных");
        } else {
            System.out.println(getSize());
        }
    }
    void startMove() {
        System.out.println("Автобус начал движение");
    }

    @Override
    public void finish() {

    }

    void finishMove() {
        System.out.println("Автобус закончил движение");
    }
    @Override
    public boolean passDiagnostics () {
        throw new TransportTypeException ("Автобусы диагностику не проходят");

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

    @Override
    public String repair() {
        return " Качаем шины ";
    }
}