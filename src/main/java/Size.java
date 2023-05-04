public enum Size {
    XS(0, 10),
    S(10, 25),
    M(25, 50),
    L(50, 80),
    XL(80, 500);

    private int min;
    private int max;

    Size(int min, int max) {
        this.min = min;
        this.max = max;
    }

    Size() {

    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public static Size getValue(int value) {
        for (Size e : Size.values()) {
            if (value >= e.getMin() && value <= e.getMax()) {
                System.out.println(e);
                return e;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Вместимость" + " Нижняя граница " + getMin() + " Верхняя граница " + getMax() + " мест";
    }
}