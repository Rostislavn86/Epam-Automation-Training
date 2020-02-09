//        OptionalTask 2
//        Задание.
//        Ввести число от 1 до 12.
//        Вывести на консоль название месяца, соответствующего данному числу.
//        Осуществить проверку корректности ввода чисел.

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("OptionalTask"+"\n"+"Ввести число от 1 до 12."+
                "\n"+"Вывести на консоль название месяца, соответствующего данному числу."+"" +
                "\n"+"Осуществить проверку корректности ввода чисел."+"\n");
        Scanner sc = new Scanner(System.in);
        int number;
            do {
                System.out.println("Введите пожалуйста целое число от 1-ого до 12 ти ");
                do {
                    while (!sc.hasNextInt())
                    {
                        System.out.println("Это не целое число!");
                        sc.next();
                    }
                    number = sc.nextInt();
                    if (number == 0) number = 99;
                } while (number < 0);
            } while (number > 12);

        System.out.println("Вы ввели чсло " + number);

        String monthString = null;

        switch (number) {
            case 1:  monthString = "Январь";
                break;
            case 2:  monthString = "Февраль";
                break;
            case 3:  monthString = "Март";
                break;
            case 4:  monthString = "Апрель";
                break;
            case 5:  monthString = "Май";
                break;
            case 6:  monthString = "Июнь";
                break;
            case 7:  monthString = "Июль";
                break;
            case 8:  monthString = "Август";
                break;
            case 9:  monthString = "Сентябрь";
                break;
            case 10: monthString = "Октябрь";
                break;
            case 11: monthString = "Ноябрь";
                break;
            case 12: monthString = "Декабрь";
                break;
        }
        System.out.println("Оно соотвествует месяцу = " + monthString );
    }
}
