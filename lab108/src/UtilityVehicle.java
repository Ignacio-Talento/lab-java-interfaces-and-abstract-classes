public class UtilityVehicle extends Car{
    private boolean fourWheelDrive;
    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean hasFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String getInfo() {
        return "Type: Utility Vehicle\n" + super.getInfo() + "\nFour wheel drive: " + fourWheelDrive;
    }
}
