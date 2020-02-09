package MainTaskCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MenuMethods
{
    public static int StartMenuNumberOfTheCars()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Добрый день, введите количество автомобилей в автопарке");

        int kolichAvto = sc.nextInt();

        return kolichAvto;
    }

    public static int TaskMenu()
    {
        System.out.println("Автопарк умпшно создан, выбирите действие: ");
        System.out.println("1) Подсчитать стоимость автопарка");
        System.out.println("2) Провести сортировку автомобилей парка по расходу топлива.");
        System.out.println("3) Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости.");

        Scanner sc = new Scanner(System.in);
        int punkMenu = sc.nextInt();

        while ((punkMenu > 3 ) || (punkMenu <= 0))
        {
            System.out.println("Значение которое вы ввели отсуствует в меню, пожалуйста повторите ввод ...");
            punkMenu = sc.nextInt();
        }

        return punkMenu;
    }

    public static void RecMenu(HashMap<Integer, String> taksopark, ArrayList<Integer> maxSpeedOfTheCar, ArrayList<Double> fuelConsumptionOfTheCar, ArrayList<Float> priceOfTheCar)
    {
        Methods methods = new Methods();

        int x = MenuMethods.TaskMenu();

        Scanner bukva = new Scanner(System.in);

        if (x == 1)
        {
            System.out.println("Общая стоимость автопарка = "
                    + methods.TotalPrice(priceOfTheCar));
            System.out.println("Если хотите выбрать иную операцию введите 'y'");
            String ch = bukva.nextLine();
            if (ch.equals("y")) RecMenu(taksopark,maxSpeedOfTheCar,fuelConsumptionOfTheCar,priceOfTheCar);
        }

        if (x == 2)
        {
            System.out.println("Сортировка автопарка по расходу топлива ");
            methods.sortbyfueslvivod(taksopark, fuelConsumptionOfTheCar);
            System.out.println("Если хотите выбрать иную операцию введите 'y'");
            String ch = bukva.nextLine();
            if (ch.equals("y")) RecMenu(taksopark,maxSpeedOfTheCar,fuelConsumptionOfTheCar,priceOfTheCar);
        }

        if (x == 3)
        {
            System.out.println("Введите пожалуйста начальный диапазон скорости : ");
            Scanner sc = new Scanner(System.in);
            int startRange = sc.nextInt();
            System.out.println("Введите пожалуйста конечный диапазон скорости : ");
            int finalRange = sc.nextInt();
            System.out.println("Автомобили компании, соответствующие заданному диапазону параметров скорости ");
            methods.sortBySpeedRange(taksopark, maxSpeedOfTheCar, startRange, finalRange);
            System.out.println("Если хотите выбрать иную операцию введите 'y'");
            String ch = bukva.nextLine();
            if (ch.equals("y")) RecMenu(taksopark,maxSpeedOfTheCar,fuelConsumptionOfTheCar,priceOfTheCar);
        }
    }



}
