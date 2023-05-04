public class DriveB extends Drive {

    public DriveB(String name, boolean driveLicense, int experinse) {
        super(name, driveLicense, experinse);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель с категорией прав B " + getName() + "начал движение");
    }

    @Override
    public void finish() {

        System.out.println("Водитель с категорией прав B " + getName() + "закончил движение");
    }


    public void refill() {
        System.out.println("Водитель с категорией прав B " + getName() + "заправляет авто");
    }

}
