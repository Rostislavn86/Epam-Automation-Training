
//        http://qaru.site/questions/109753/simple-way-to-count-character-occurrences-in-a-string
//        https://metanit.com/java/tutorial/2.9.php


import java.util.Scanner;

public class SozdanieZakaza {

    public static int CreateNomerZakaza()
    {
        int a;
        do {
            a = (int) (Math.random() * (99999 + 1));
            if (a<10000) a = (int) (Math.random() * (99999 + 1));
    }
        while (10000 / a > 1) ;
        return a;
    }

    public static int CreateNomerClienta() {
        int b;
        do {
            b = (int) (Math.random() * (9999 + 1));
            if (b<1000) b = (int) (Math.random() * (99999 + 1));
        }
        while (1000 / b > 1);
        return b;
    }

    public static boolean ProverkaSozdaniaimeniBolshieChetirioh(String name)
    {
        if ( name.length()>=4 ) return true; else return false;
    }

    public static boolean ProverkaSozdaniaimeniMeniheDvadsatsi(String name)
    {
        if ( name.length()<=20 ) return true; else return false;
    }

    public static boolean ProverkaNazvaniaPizzi (String name)
    {
        String iskomiiSimvoli = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        char[] strToArraySimvoly = iskomiiSimvoli.toCharArray();

        String pizzaName = name;
        char[] strToArrayVvedionnaStroka = pizzaName.toCharArray();

        int count = 0;
        for(int i = 0; i < strToArrayVvedionnaStroka.length; i ++)
        {
            for (int j = 0; j < strToArraySimvoly.length; j++) {

                if (strToArrayVvedionnaStroka[i] == strToArraySimvoly[j])
                {
                    count++;
                }
            }
        }
        if (count==pizzaName.length()) return true; else return false;
    }

    public static String ProverkaImeniPizzi( String pizza)
    {
        if ((ProverkaSozdaniaimeniBolshieChetirioh(pizza)==true)
                && (ProverkaSozdaniaimeniMeniheDvadsatsi(pizza) == true)
                && (ProverkaNazvaniaPizzi(pizza) == true))
            return pizza; else return pizza = "Error";
    }

    public String[] SozdanieNazvaniaZakaza()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Добрый день, введите количество заказов:");

        long start = System.currentTimeMillis();

        int kolichZakazov = sc.nextInt();
        String[] zakaz = new String[kolichZakazov];
        String[] saveNumberZakaza = new String[kolichZakazov];
        String[] savaNumberClienta = new String[kolichZakazov];
        String[] saveNazvaniePizzi = new String[kolichZakazov];
        int[] savekolichPizz = new int[kolichZakazov];

        do {
            SozdanieZakaza.SozdanieNomerovZakaza(kolichZakazov,saveNumberZakaza);
        }
        while (ProverkaNomeraZakaza(SozdanieZakaza.SozdanieNomerovZakaza(kolichZakazov,saveNumberZakaza))!= true);

        do {
            SozdanieZakaza.SozdanieNomerovImionKlientov(kolichZakazov,savaNumberClienta);
        }
        while (ProverkaNomeraZakaza(SozdanieZakaza.SozdanieNomerovImionKlientov(kolichZakazov,savaNumberClienta))!= true);

        for(int i = 0; i<kolichZakazov; i++)
        {

            int k = i + 1;
            System.out.println("Заказа номер :"  + k );
            System.out.println("Вы можите выбрать пиццу из готового меню, или придумать название собственной пиццы :");
            System.out.println("Пиццы из меню: Margarita, PepperoniOro, Diablo, VegetablePizza");
            System.out.println("примечание :");
            System.out.println("Название пиццы должно содержать не менее 4 и не более 20 латинских символов. " +
                    "Если указанное название не удовлетворяет данному условию, пицца получает название " +
                    "«имя_клиента_n», где n - номер пиццы по порядку в заказе.");
            System.out.println("Ведите название пиццы");
            Scanner name = new Scanner(System.in);
            String nazvaniePizziVvod = name.nextLine();
            saveNazvaniePizzi[i] = nazvaniePizziVvod;
            System.out.println("Введите количестов пицц к заказу номер " + k + " номер заказа в базе : " + saveNumberZakaza[i] );
            savekolichPizz[i] = proverkaKolichPizzNeBolshieDesiatsii();

            if (SozdanieZakaza.ProverkaImeniPizzi(nazvaniePizziVvod).equals("Error"))
                zakaz[i] = saveNumberZakaza[i] + ":"
                        + savaNumberClienta[i] + ":"
                        + savaNumberClienta[i] + "_" + k + ":" + savekolichPizz[i];
            else
                zakaz[i] = saveNumberZakaza[i] + ":"
                        + savaNumberClienta[i] + ":"
                        +  saveNazvaniePizzi[i] + ":" + savekolichPizz[i];
        }
        System.out.println("Если вы хотите изменить данный заказ - нажмите 'y', " +
                "если хотите изменить количество пицц в заказе нажмите ch, " +
                "если нет - любую кнопку");
        Scanner bukva = new Scanner(System.in);
        String yesorno = bukva.nextLine();
        if (yesorno.equals("y")) 
        {
            System.out.println("Ваш предыдущий заказ :");
            for(int i = 0;i<kolichZakazov;i++)
            {
                System.out.println(i + ":" + zakaz[i]);
            }
            System.out.println("Введите новый заказ :");
            System.out.println("----------------------------------------------------------");
            SozdanieNazvaniaZakaza();
        }

        Scanner chpizzachoice = new Scanner(System.in);

        if (yesorno.equals("ch"))
        for(int i = 0;i<kolichZakazov;i++)
        {
            int k = 0;
            k = i + 1;
            System.out.println("Если вы хотите изменить количество пицц в данном заказе, - нажмите 'y'");
            System.out.println("Если нет - любую кнопку.");
            System.out.println("[ " + k + ":" + zakaz[i]+ " ]");
            String chpizza = chpizzachoice.nextLine();
            if (chpizza.equals("y"))
            {
                System.out.println("Ваш предыдущий заказ номер " + k + " :");
                System.out.println("[ " + k + ":" + zakaz[i]+ " ]");
                System.out.println("Введите новое количество пицц ");
                savekolichPizz[i] = proverkaKolichPizzNeBolshieDesiatsii();
                if (SozdanieZakaza.ProverkaImeniPizzi(saveNazvaniePizzi[i]).equals("Error"))
                    zakaz[i] = saveNumberZakaza[i] + ":"
                            + savaNumberClienta[i] + ":"
                            + savaNumberClienta[i] + "_" + k + ":" + savekolichPizz[i];
                else
                    zakaz[i] = saveNumberZakaza[i] + ":"
                            + savaNumberClienta[i] + ":"
                            +  saveNazvaniePizzi[i] + ":" + savekolichPizz[i];
            }
        }
        System.out.println("Ваш сформированный заказ :");
        for(int i = 0;i<kolichZakazov;i++)
        {
            int k = 0;
            k = i + 1;
            System.out.println("[ " + k + ":" + zakaz[i]+ " ]");
        }

        long finish = System.currentTimeMillis();

        long timeConsumedMillis = finish - start;

        long seconds = (timeConsumedMillis / 1000) % 60;

        System.out.println("Заказ сформирован  за " + seconds + "секунд");
        return zakaz;
    }




    static int proverkaKolichPizzNeBolshieDesiatsii()
    {
        System.out.println("Введите количесто пицц меньше или равное 10-ти");
        Scanner kolichPizzKzakazu = new Scanner(System.in);
        int kolichPizz = kolichPizzKzakazu.nextInt();
        while ((kolichPizz > 10 ) || (kolichPizz <= 0))
        {
            System.out.println("Вы ввели колчиество пицц больше 10-ти, или меньше 0, пожалуйста введите корректное значение ...");
            kolichPizz = kolichPizzKzakazu.nextInt();
        }
         return kolichPizz;

    }

    static boolean ProverkaNomeraZakaza(String[] stroka)
    {
        int count = 0;
        for(int i=0; i<stroka.length; i++)
            for(int j=0; j<stroka.length; j++)
        {
            if (stroka[i].equals(stroka[j])) count++;
        }
        if (count==stroka.length) return true;
        else
        return false;
    }

    static String[] SozdanieNomerovZakaza(int kolichZakazovMethod,String[] saveNumerZakaz)
    {
        for(int i = 0; i<kolichZakazovMethod; i++)
        {
            saveNumerZakaz[i] = String.valueOf(SozdanieZakaza.CreateNomerZakaza());
        }
        return saveNumerZakaz;
    }

    static String[] SozdanieNomerovImionKlientov(int kolichZakazovMethod,String[] saveNameKlienta)
    {
        for(int i = 0; i<kolichZakazovMethod; i++)
        {
            saveNameKlienta[i] = String.valueOf(SozdanieZakaza.CreateNomerZakaza());
        }
        return saveNameKlienta;
    }
    }





