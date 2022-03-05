public class Vehicle {
    private String model;
    private String type;
    private int speed;
    private Character fuelType;

    private int noOfVehicles;

    public Vehicle(String model, String type, int speed, Character fuelType){
        this.model = model;
        this.type = type;
        this.speed = speed;
        if (fuelType.equals('C') || fuelType.equals('D')) {
            this.fuelType = fuelType;
        }
    }

    public String getModel(){
        return this.model;
    }

    public String getType(){
        return this.type;
    }

    public int getSpeed(){
        return this.speed;
    }

    public Character getFuelType(){
        return this.fuelType;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setFuelType(Character fuelType){
        this.fuelType = fuelType;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(this.model).append(" ");
        stringBuilder.append(this.type).append(" ");
        stringBuilder.append(this.speed).append(" ");
        stringBuilder.append(String.valueOf(this.fuelType));

        return stringBuilder.toString();
    }
}
