import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;
import java.util.Scanner;

public class ObjMassOfBooksAndMethods
{


    public Book[] library = new Book[10];

    public int CreateId()
    {
        int min = 10000;
        int max = 99999;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        return i;
    }

    public String createTypeOfBlinding()
    {
        Random random = new Random();
        if (random.nextBoolean()) return "Strong";
        else return "Light";
    }

    public void vivestiSpisokKnig()
    {
        for(int i=0;i<library.length;i++)
        {
            System.out.println(i+1 + ") " + "Id книги : " + library[i].getId() + " " + " Название книги : " + library[i].getNameBok());
        }
    }

    private void vivestiSpisokKnigPublishingHouse()
    {
            for(int i=0;i<library.length;i++)
            {
                System.out.print(i+1 + ") " + "Id книги : " + library[i].getId() + " " + " Название книги : " + library[i].getNameBok());
                System.out.println(" , " + library[i].getPublishingHouse());
            }
    }

    private void vivestiSpisokKnigYearOfLublishing()
    {
        for(int i=0;i<library.length;i++)
        {
            System.out.print(i+1 + ") " + "Id книги : " + library[i].getId() + " " + " Название книги : " + library[i].getNameBok());
            System.out.println(" , " + library[i].getYearOfPublishing());
        }
    }

    private void vivestiSpisokKnigNumberOfPages()
    {
        for(int i=0;i<library.length;i++)
        {
            System.out.print(i+1 + ") " + "Id книги : " + library[i].getId() + " " + " Название книги : " + library[i].getNameBok());
            System.out.println(" , " + library[i].getnNumberOfPages());
        }
    }

    private void vivestiSpisokKnigPrice()
    {
        for(int i=0;i<library.length;i++)
        {
            System.out.print(i+1 + ") " + "Id книги : " + library[i].getId() + " " + " Название книги : " + library[i].getNameBok());
            System.out.println(" , " + library[i].getPrice());
        }
    }

    private void vivestiSpisokKnigTypeOfBlinding()
    {
        for(int i=0;i<library.length;i++)
        {
            System.out.print(i+1 + ") " + "Id книги : " + library[i].getId() + " " + " Название книги : " + library[i].getNameBok());
            System.out.println(" , " + library[i].getTypeOfBinding());
        }
    }

    private void vivestiAllInformation()
    {
        for(int i=0;i<library.length;i++)
        {
            System.out.println(i+1 + ") " + "Id книги : " + library[i]);
        }
    }

    public void chooseVivod()
    {
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("Выбирите какой из параметров вы хотите вывести на консоль : ");
            System.out.println("Для того что бы вывести всю информацию о книгах введиет 'a' ");
            System.out.println("Для того что бы вывыести информацию о идателе введите 'i' ");
            System.out.println("Для того что бы вывыести информацию о годе издания книги введите 'y' ");
            System.out.println("Для того что бы узнать увидеть инфоомацию о количестве страниц в книге нажмите 'n'");
            System.out.println("Для того что бы узнать цену книги введите 'p'");
            System.out.println("Для того что бы вывести информацию о типе перелёта, нажмите 't'");
            System.out.println("Для выхода введите любой символ (или комбинацию символов : )");
            System.out.println("-----------------------------------Задание-----------------------------------------");
            System.out.println("Для того что бы вывести список книг заданного автора введите '1'");
            System.out.println("Для того что бы вывести список книг выпущенных заданным издательством введите '2'");
            System.out.println("Для того что бы вывести список книг заданного автора введите '3'");
            System.out.println("-----------------------------------------------------------------------------------");

            Scanner bukva = new Scanner(System.in);
            String ch = bukva.nextLine();

            if (ch.equals("a")) {
                System.out.println("Ваш Запрос :");
                vivestiAllInformation();
                chooseVivod();
            }

            if (ch.equals("i")) {
                System.out.println("Ваш Запрос :");
                vivestiSpisokKnigPublishingHouse();
                chooseVivod();
            }

            if (ch.equals("y")) {
                System.out.println("Ваш Запрос :");
                vivestiSpisokKnigYearOfLublishing();
                chooseVivod();
            }

            if (ch.equals("n")) {
                System.out.println("Ваш Запрос :");
                vivestiSpisokKnigNumberOfPages();
                chooseVivod();
            }

            if (ch.equals("p")) {
                System.out.println("Ваш Запрос :");
                vivestiSpisokKnigPrice();
                chooseVivod();
            }

            if (ch.equals("t")) {
                System.out.println("Ваш Запрос :");
                vivestiSpisokKnigTypeOfBlinding();
                chooseVivod();
            }

            if (ch.equals("1")) {
            System.out.println("Ваш Запрос :");

            System.out.println("Вот все авторы которые представленны в библиотеке");

            vivestiSpisokAvtorov();

            vivestiSpisokKnigZadannogoAvtora();

            }

        if (ch.equals("2")) {
            System.out.println("Ваш Запрос :");

            System.out.println("Название всех издательств находящехся в библиотеке");

            vivestiSpisokIzdatelstv();

            vivestiSpisokKnigVipuschennihZadannimIzdatestvom();

        }

        if (ch.equals("3")) {
            System.out.println("Ваш Запрос :");

            vivestiSpisokKnigSDatoiIzdaniaPosleOpredelionnogGoda();


        }

    }

    private void vivestiSpisokKnigSDatoiIzdaniaPosleOpredelionnogGoda()
    {
        System.out.println("Введите год идания книги :");

        Scanner bukva = new Scanner(System.in);
        int year = bukva.nextInt();
        int count = 0;

        for(int i=0;i<library.length;i++)
        {
            if (library[i].getYearOfPublishing() > year)
            {
                count++;
                System.out.println(count + " ) " + library[i].getNameBok());
            }
        }

        if (count==0)
        {
            System.out.println("К сожалению данного автора нет в наличии в библиотеке, хотите повторить ввод ?");
            System.out.println("Для того что бы ввести Имя нового автора введите 'y'");
            System.out.println("Для того что бы выйти из программы введите любой символ (или символы)");
            String yesorno = bukva.nextLine();
            if (yesorno.equals("y")) vivestiSpisokKnigSDatoiIzdaniaPosleOpredelionnogGoda();
        }
    }

    private void vivestiSpisokKnigVipuschennihZadannimIzdatestvom()
    {
        System.out.println("Введите имя имя издательства которое вы хотел бы вывести консоль");

        Scanner bukva = new Scanner(System.in);
        String izd = bukva.nextLine();
        int count = 0;

        for(int i=0;i<library.length;i++)
        {
            if (library[i].getPublishingHouse().equals(izd))
            {
                count++;
                System.out.println(library[i].getNameBok());
            }
        }

        if (count==0)
        {
            System.out.println("К сожалению данного автора нет в наличии в библиотеке, хотите повторить ввод ?");
            System.out.println("Для того что бы ввести Имя нового автора введите 'y'");
            System.out.println("Для того что бы выйти из программы введите любой символ (или символы)");
            String yesorno = bukva.nextLine();
            if (yesorno.equals("y")) vivestiSpisokKnigVipuschennihZadannimIzdatestvom();
        }


    }

    private void vivestiSpisokIzdatelstv()
    {
        String[] tempArray = new String[library.length];

        for (int i = 0; i < library.length; i++)
        {
        tempArray[i] = library[i].getPublishingHouse();
        }

        for (int i = 0; i < library.length; i++) {
            for (int j = i + 1; j < library.length; j++)
            //     Определили индекс повторяющехся элементов
            {
                if (library[i].getPublishingHouse() == library[j].getPublishingHouse()) tempArray[j] = "null";
            }
        }

        for (int i = 0; i < library.length; i++)
        {
            if (tempArray[i] == "null") i++; else System.out.println(tempArray[i]);
        }
    }

    private void vivestiSpisokAvtorov()
    {
        String[] tempArray = new String[library.length];

        for (int i = 0; i < library.length; i++)
        {
            tempArray[i] = library[i].getAuthor();
        }

        for (int i = 0; i < library.length; i++) {
            for (int j = i + 1; j < library.length; j++)
            {
                if (library[i].getAuthor() == library[j].getAuthor()) tempArray[j] = "null";
            }
        }

        for (int i = 0; i < library.length; i++)
        {
            if (tempArray[i] == "null") i++; else System.out.println(tempArray[i]);
        }

    }

    private void vivestiSpisokKnigZadannogoAvtora()
    {
        System.out.println("Введите имя автора список книг которого вы хотел бы вывести консоль");

        Scanner bukva = new Scanner(System.in);
        String avtor = bukva.nextLine();
        int count = 0;

        for(int i=0;i<library.length;i++)
        {
            if (library[i].getAuthor().equals(avtor))
            {
                count++;
                System.out.println(library[i].getNameBok());
            }
        }

        if (count==0)
        {
            System.out.println("К сожалению данного автора нет в наличии в библиотеке, хотите повторить ввод ?");
            System.out.println("Для того что бы ввести Имя нового автора введите 'y'");
            System.out.println("Для того что бы выйти из программы введите любой символ (или символы)");
            String yesorno = bukva.nextLine();
            if (yesorno.equals("y")) vivestiSpisokKnigZadannogoAvtora();
        }
    }
    }


