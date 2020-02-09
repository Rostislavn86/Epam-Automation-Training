//Условие задачи
//https://learn.by/courses/course-v1:EPAM+JF+ext1/courseware/3a977f16464449bf9530c1fcc6d881d0/3b62d1b6d46f4d0d9f6558370c0b5506/1

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Part 1

        //Решение
        System.out.println("************* Part 1 *************");

        SozdanieZakaza sozdanieZakaza = new SozdanieZakaza();
        String[] x = sozdanieZakaza.SozdanieNazvaniaZakaza();

        //Part 2

        System.out.println("*************** Part 2 *****************");

              MenuPizz menuPizz = new MenuPizz();
              menuPizz.GotovoeMenuPizz();
                menuPizz.addIngridientInMeniu("Margarita");
                menuPizz.addIngridientInMeniu("Diablo");
                menuPizz.addIngridientNotInMeniu("Pizza Lisitsa");

        //Part 3

        System.out.println("*************** Part 3 ******************");

        double summaElementovMassiva = 0;

        for(int i = 0;i<x.length;i++)
        {
            menuPizz.toString(x[i]);

            double[] massivZnachenii = new double[x.length];
            massivZnachenii[i] = menuPizz.toStringTotalPrice(x[i]);

            for (double k : massivZnachenii)
                summaElementovMassiva += k;
                    }

        System.out.println();
        System.out.println("---------------------------");
        System.out.println("Общая сумма всех заказов : " + summaElementovMassiva + " €");

//      Part 4

        System.out.println("************** Part 4 ***************");

        menuPizz.toStringforApart4(uslovioeZadachi(7717,"Margarita", 2));

        menuPizz.toStringforApart4(uslovioeZadachi(7717,"PepperoniOro",3));

        menuPizz.toStringforApart4(uslovioeZadachi(4372,"BasePZZ",12));

//      Part 5

        // Реализованно

    }

    static String uslovioeZadachi(int nomerzakaza,  String namePizzi, int kolichPizzi)
    {
        String nomerZakazaString = Integer.toString(nomerzakaza);
        String kolichPizziString = Integer.toString(kolichPizzi);
        SozdanieZakaza.CreateNomerClienta();
        return nomerZakazaString + ":" + SozdanieZakaza.CreateNomerClienta() + ":"  + namePizzi + ":" + kolichPizziString;
    }
}


