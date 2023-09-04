package ru.geekbrains.lesson3;

import java.awt.*;

public class FlyCar extends Car implements Fueling,Wiping {
    public FlyCar(String make, String model, Color color, FuelType fuelType) {
        super(make, model, color, fuelType);
        setWheelsCount(4);
    }

    private Refueling refueling;
    private  Wiping wiping;

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    public void setWipingStation(Wiping wiping){this.wiping = wiping;}
    public void fly(){
        System.out.println("Автомобиль летит!");
    }

    @Override
    public void movement() {
        fly();
    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    @Override
    public void fuel() {
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }

    @Override
    public void wipMirrors() {
        if (wiping != null){
            wiping.wipMirrors();
        }
    }

    @Override
    public void wipWindshield() {
        if (wiping != null){
            wiping.wipWindshield();
        }
    }

    @Override
    public void wipHeadlights() {
        if (wiping != null){
            wiping.wipHeadlights();
        }
    }
}
