public enum LoadCapacity {

    n1(0, 3.5),
    n2(3.5, 12),
    n3(12, 500);

    private double max;
    private double min;

    LoadCapacity(double max, double min) {
        this.max = max;
        this.min = min;
    }

    LoadCapacity() {

    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public static LoadCapacity getValue(double value) {
        for (LoadCapacity e : LoadCapacity.values()) {
            if (value <= e.getMax() && value <= e.getMin()) {
                System.out.println(e);
                return e;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return " Грузоподъемность " + getMin() + " - " + getMax() + " тонн ";
    }
}

