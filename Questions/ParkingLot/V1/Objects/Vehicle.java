package Questions.ParkingLot.V1.Objects;

import Questions.ParkingLot.V1.Enums.VehicleType;

public class Vehicle {
    String number;
    String model;
    String manufacturer;
    VehicleType type;

    public Vehicle (String number, String model, String mf, VehicleType type){
        this.number=number;
        this.manufacturer=mf;
        this.model=model;
        this.type=type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
}
