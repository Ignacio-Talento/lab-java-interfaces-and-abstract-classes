public class Truck extends Car{
    private double towingCapacity;
    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }
    public double getTowingCapacity() {
        return towingCapacity;
    }
    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String getInfo() {
        return "Type: Truck\n" + super.getInfo() + "\nTowing capacity: " + towingCapacity;
    }
}
