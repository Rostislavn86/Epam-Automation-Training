package MainTaskCollections;

import java.io.IOException;
import java.util.*;

public class Main
{


    public static void main(String[] args) throws IOException {

        Car car1 = new Car();

        HashMap<Integer, String> taksopark = new HashMap<>();
        ArrayList<String> nameOfTheCars = new ArrayList<>();
        ArrayList<String> vinNumberOfTheCar = new ArrayList<>();
        ArrayList<Integer> maxSpeedOfTheCar = new ArrayList<>();
        ArrayList<Double> fuelConsumptionOfTheCar = new ArrayList<>();
        ArrayList<Float> priceOfTheCar = new ArrayList<>();

        int count = MenuMethods.StartMenuNumberOfTheCars();

        for (int i = 0; i < count; i++)
        {
            nameOfTheCars.add(i,car1.getMarkOfTheCar());
            vinNumberOfTheCar.add(i,car1.getVinNumber());
            maxSpeedOfTheCar.add(i,car1.getMaxSpeed());
            fuelConsumptionOfTheCar.add(i,car1.getFuelConsumption());
            priceOfTheCar.add(i,car1.getPrice());

            taksopark.put(i,nameOfTheCars.get(i) + " , " + vinNumberOfTheCar.get(i) + " , " + maxSpeedOfTheCar.get(i)
            + " , " + fuelConsumptionOfTheCar.get(i) + " , " + priceOfTheCar.get(i));
        }
        MenuMethods.RecMenu(taksopark,maxSpeedOfTheCar,fuelConsumptionOfTheCar,priceOfTheCar);
    }
    }
