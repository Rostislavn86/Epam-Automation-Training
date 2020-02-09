package MainTaskCollections;

import java.io.IOException;

public class Car
{
    Methods methods = new Methods();

    public String getMarkOfTheCar() throws IOException {
        return methods.GenerateNameOfTheCar();
    }

    public String getVinNumber() {
        return methods.CreateVin();
    }

    public int getMaxSpeed() {
        return methods.GanerateMaxSpeed();
    }


    public double getFuelConsumption() {
        return methods.GenerateFuelConsumption();
    }


    public float getPrice() {
        return methods.GeneratePrice();
    }










}
