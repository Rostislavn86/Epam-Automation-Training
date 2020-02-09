package MainTaskCollections;

import java.io.*;
import java.util.*;

public class Methods
{
    //https://avtocod.ru/vin-kod
    public static String CreateVin()
    {
        return randomStringCifriiBukvi(3) + randomStringCifriiBukvi(6)
                + randomStringCifriiBukvi(4) + randomStringCifrii(4) ;
    }

    static final String AB1 = "0123456789ABCDEFGHJKLMNPRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static final String AB2 = "0123456789";
    static Random rnd = new Random();

    static String randomStringCifriiBukvi( int len ){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB1.charAt( rnd.nextInt(AB1.length()) ) );
        return sb.toString();
    }

    static String randomStringCifrii( int len ){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB2.charAt( rnd.nextInt(AB2.length()) ) );
        return sb.toString();
    }

    public String GenerateNameOfTheCar() throws IOException {
        ArrayList<String> text = new ArrayList<>();

        File file = new File("D:\\Epam_Task\\CollectionsPovt\\src\\MainTaskCollections\\DataFiles\\MarkOfTheCars.txt");

        //Доюавляем содержание файла в коллекцию
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
        {
            text.add(st);
        }

        int a = (int) ( Math.random() * text.size() );

        String v = text.get(a);

        return v;
    }

    public int GanerateMaxSpeed()
    {
        Random random = new Random();
        int num = 120 + random.nextInt(201 - 120);
        return num;
    }

    public double GenerateFuelConsumption()
    {
        double min = 5.01;
        double max = 12.03;
        Random rand = new Random();
        double result = rand.nextDouble() * (max - min) + min;
        return result;
    }

    public int GeneratePrice()
    {
        int min = 1000;
        int max = 10000;
        Random random = new Random();
        int num = min + random.nextInt(max - min);
        return num;
    }

    public float TotalPrice(ArrayList<Float> x)
    {
        float sum = 0;

        for (int i =0; i<x.size();i++)
        {
            sum += x.get(i);
        }
        return sum;
    }

    public void sortbyfueslvivod(HashMap<Integer, String> taksopark,ArrayList<Double> fuel) {

        Collections.sort(fuel);

        String[] arrSorted = new String[taksopark.size()];
        for (int j = 0; j < taksopark.size(); j++)
        {
            for (int i = 0; i < taksopark.size(); i++) {

                arrSorted[i] = fuel.get(i).toString();

                if (taksopark.get(i).contains(arrSorted[j])) System.out.println(j+1 + ") " + taksopark.get(i));
            }
    }
    }


    public void sortBySpeedRange(HashMap<Integer, String> taksopark, ArrayList<Integer> SpeedOfTheCar,int rangeFrom, int rangeTo)
    {
        for(int i = 0; i < SpeedOfTheCar.size(); i++)
        {
            if ((SpeedOfTheCar.get(i) >= rangeFrom) && (SpeedOfTheCar.get(i) <= rangeTo))
                System.out.println(i+1 + ") " + taksopark.get(i));
        }
    }
    }
