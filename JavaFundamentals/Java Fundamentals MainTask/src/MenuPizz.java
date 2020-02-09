import java.util.Scanner;

class MenuPizz {

    static Pizza[] SkeletPizzi = new Pizza [5];

    public void GotovoeMenuPizz()
    {
        String[] ingridients = {"Tomato Paste ","Cheese ","Salami ","Bacon ","Garlic ","Corn ","Pepperoni ","Olives "};

        //Готовое меню пицц
        SkeletPizzi[0] = new Pizza("Margarita", "Pizza Base (Standart) " , ingridients[0] + ingridients[6] + ingridients[3]);
        SkeletPizzi[1] = new Pizza("PepperoniOro","Pizza Base (Calzione) ",   ingridients[0] + ingridients[1] + ingridients[6] + ingridients[7]);
        SkeletPizzi[2] = new Pizza("Diablo","Pizza Base (Standart) " , ingridients[0]+ingridients[1]+ingridients[2]);
        SkeletPizzi[3] = new Pizza("VegetablePizza","Pizza Base (Calzione) ", ingridients[0]+ingridients[1]+ingridients[7]);

        //Форма пиццы созданной клиентом
        //Это буфферная ячейка для массива типа пицц
        SkeletPizzi[4] = new Pizza("randomName", "Pizza Base (Calzione) " + "Pizza Base (Standart) ", "empty" );
    }

    void addIngridientInMeniu(String nazvaniepizzi)
    {
        if (nazvaniepizzi.equals("Margarita"))
        System.out.println("Вы ввели название пиццы которое есть в меню - это пицца 'Margarita'");

        if (nazvaniepizzi.equals("PepperoniOro"))
            System.out.println("Вы ввели название пиццы которое есть в меню - это пицца 'PepperoniOro'");

        if (nazvaniepizzi.equals("Diablo"))
            System.out.println("Вы ввели название пиццы которое есть в меню - это пицца 'Diablo'");

        if (nazvaniepizzi.equals("VegetablePizza"))
            System.out.println("Вы ввели название пиццы которое есть в меню - это пицца 'VegetablePizza'");

        SkeletPizzi[0].pizzaname = nazvaniepizzi;

        boolean[] massivIngridientov = {false,false,false,false,false,false,false,false};


        if (nazvaniepizzi.equals("Margarita"))
        {
            massivIngridientov[0] = true;
            massivIngridientov[6] = true;
            massivIngridientov[3] = true;
        }
        if (nazvaniepizzi.equals("PepperoniOro"))
        {
            massivIngridientov[0] = true;
            massivIngridientov[1] = true;
            massivIngridientov[6] = true;
            massivIngridientov[7] = true;
        }
        if (nazvaniepizzi.equals("Diablo"))
        {
            massivIngridientov[0] = true;
            massivIngridientov[1] = true;
            massivIngridientov[2] = true;
        }
        if (nazvaniepizzi.equals("VegetablePizza"))
        {
            massivIngridientov[0] = true;
            massivIngridientov[1] = true;
            massivIngridientov[7] = true;
        }

        String[] znacheniaMassivaIngridientov = {"","","","","","","",""};

        massivIngridientov = MenuPizz.proverkaPovtoreniaIngridientovDliaPizziNewPizza(massivIngridientov);

        if (massivIngridientov[0] == true) znacheniaMassivaIngridientov[0] = "Tomato Paste ";
        if (massivIngridientov[1] == true) znacheniaMassivaIngridientov[1] = "Cheese ";
        if (massivIngridientov[2] == true) znacheniaMassivaIngridientov[2] = "Salami ";
        if (massivIngridientov[3] == true) znacheniaMassivaIngridientov[3] = "Bacon ";
        if (massivIngridientov[4] == true) znacheniaMassivaIngridientov[4] = "Garlic ";
        if (massivIngridientov[5] == true) znacheniaMassivaIngridientov[5] = "Corn ";
        if (massivIngridientov[6] == true) znacheniaMassivaIngridientov[6] = "Pepperoni ";
        if (massivIngridientov[7] == true) znacheniaMassivaIngridientov[7] = "Olives ";

        StringBuffer sb = new StringBuffer();
        sb.insert(0,znacheniaMassivaIngridientov[0]);
        sb.insert(sb.length(),znacheniaMassivaIngridientov[1]);
        sb.insert(sb.length(),znacheniaMassivaIngridientov[2]);
        sb.insert(sb.length(),znacheniaMassivaIngridientov[3]);
        sb.insert(sb.length(),znacheniaMassivaIngridientov[4]);
        sb.insert(sb.length(),znacheniaMassivaIngridientov[5]);
        sb.insert(sb.length(),znacheniaMassivaIngridientov[6]);
        sb.insert(sb.length(),znacheniaMassivaIngridientov[7]);

        SkeletPizzi[0].pizzaComponent = sb.toString();

        System.out.println(SkeletPizzi[0].pizzaname + SkeletPizzi[0].pizzatype + SkeletPizzi[0].pizzaComponent);
    }

    void  addIngridientNotInMeniu(String nazvaniepizzi)
    {

        System.out.println("Вы ввели название пиццы которого нет вменю, - пожалуйста введите тип основы для пиццы и инрееенты которые в ней будут.");
        System.out.println("Внимание !!! Ингридиенты не долны повторяться ... ");
        System.out.println("Пожалуйста, введите тип основы для пиццы, - напомню выбрать можно из двух вариантов: " +
                "Pizza Base (Calzione) - нажать клавишу 'C' или Pizza Base (Standart) - нажать клавишу 'S'");

        Scanner bukva = new Scanner(System.in);
        String ch;
        do
            {
            ch = bukva.nextLine();
            if (ch.equals("C"))
            {
                break;
            }
            if (ch.equals("S"))
            {
                break;
            }
        } while (!ch.equals("C") || !ch.equals("S"));

        SkeletPizzi[4].pizzaname = nazvaniepizzi + " ";

        if (ch.equals("C"))
            SkeletPizzi[4].pizzatype = "Pizza Base (Calzione) ";

        if (ch.equals("S"))
            SkeletPizzi[4].pizzatype = "Pizza Base (Standart) ";

        System.out.println(SkeletPizzi[4].pizzaname + SkeletPizzi[4].pizzatype);

        boolean[] massivIngridientov = {false,false,false,false,false,false,false,false};
        String[] znacheniaMassivaIngridientov = {"","","","","","","",""};

        massivIngridientov = MenuPizz.proverkaPovtoreniaIngridientovDliaPizziNewPizza(massivIngridientov);

        if (massivIngridientov[0] == true) znacheniaMassivaIngridientov[0] = "Tomato Paste ";
        if (massivIngridientov[1] == true) znacheniaMassivaIngridientov[1] = "Cheese ";
        if (massivIngridientov[2] == true) znacheniaMassivaIngridientov[2] = "Salami ";
        if (massivIngridientov[3] == true) znacheniaMassivaIngridientov[3] = "Bacon ";
        if (massivIngridientov[4] == true) znacheniaMassivaIngridientov[4] = "Garlic ";
        if (massivIngridientov[5] == true) znacheniaMassivaIngridientov[5] = "Corn ";
        if (massivIngridientov[6] == true) znacheniaMassivaIngridientov[6] = "Pepperoni ";
        if (massivIngridientov[7] == true) znacheniaMassivaIngridientov[7] = "Olives ";

        StringBuffer sb = new StringBuffer();
        sb.insert(0,znacheniaMassivaIngridientov[0]);
        sb.insert(sb.length(),znacheniaMassivaIngridientov[1]);
        sb.insert(sb.length(),znacheniaMassivaIngridientov[2]);
        sb.insert(sb.length(),znacheniaMassivaIngridientov[3]);
        sb.insert(sb.length(),znacheniaMassivaIngridientov[4]);
        sb.insert(sb.length(),znacheniaMassivaIngridientov[5]);
        sb.insert(sb.length(),znacheniaMassivaIngridientov[6]);
        sb.insert(sb.length(),znacheniaMassivaIngridientov[7]);

        SkeletPizzi[4].pizzaComponent = sb.toString();

        System.out.println(SkeletPizzi[4].pizzaname + SkeletPizzi[4].pizzatype + SkeletPizzi[4].pizzaComponent);

    }

    static boolean[] proverkaPovtoreniaIngridientovDliaPizziNewPizza(boolean[] x)
    {

        System.out.println("Пожалуйста выбирите ингридиент из списка");
        System.out.println("Для выхода из меню введите цифру 9.");
        System.out.println("1) Tomato Paste ");
        System.out.println("2) Cheese ");
        System.out.println("3) Salami ");
        System.out.println("4) Bacon ");
        System.out.println("5) Garlic ");
        System.out.println("6) Corn ");
        System.out.println("7) Pepperoni ");
        System.out.println("8) Olives ");

        Scanner cifraChoice = new Scanner(System.in);
        int cifra ;

        do {
            cifra = cifraChoice.nextInt();
            if (cifra == 1)
            {
                if (x[0] == true) System.out.println("Данный ингридиент уже добавлен, повторите ввод");
                x[0] = true;
            }
            if (cifra == 2)
            {
                if (x[1] == true) System.out.println("Данный ингридиент уже добавлен, повторите ввод");
                x[1] = true;
            }
            if (cifra == 3)
            {
                if (x[2] == true) System.out.println("Данный ингридиент уже добавлен, повторите ввод");
                x[2] = true;
            }
            if (cifra == 4)
            {
                if (x[3] == true) System.out.println("Данный ингридиент уже добавлен, повторите ввод");
                x[3] = true;
            }
            if (cifra == 5)
            {
                if (x[4] == true) System.out.println("Данный ингридиент уже добавлен, повторите ввод");
                x[4] = true;
            }
            if (cifra == 6)
            {
                if (x[5] == true) System.out.println("Данный ингридиент уже добавлен, повторите ввод");
                x[5] = true;
            }
            if (cifra == 7)
            {
                if (x[6] == true) System.out.println("Данный ингридиент уже добавлен, повторите ввод");
                x[6] = true;
            }
            if (cifra == 8)
            {
                if (x[7] == true) System.out.println("Данный ингридиент уже добавлен, повторите ввод");
                x[7] = true;
            }
            if ((x[0]) && (x[1])&&(x[2]) && (x[3]) && (x[4]) && (x[5]) && (x[6]) && (x[7]))
            {
                System.out.println("Заказ полон, вы ввели макимально возможное количество ингридиентов," +
                        "программа ввода ингридиентов будет закрыта");
                cifra = 9;
            }
        }
        while (cifra != 9);
        return x;
    }

    double cenaPizzidouble(String nazvaniePizzi)
    {
        double totalPrce = 0;

        String str = null;
        switch (nazvaniePizzi)
        {
            case "Margarita" :
            {
                str = SkeletPizzi[0].pizzatype + SkeletPizzi[0].pizzaComponent;
                break;
            }
            case "PepperoniOro" :
            {
                str = SkeletPizzi[1].pizzatype + SkeletPizzi[1].pizzaComponent;
                break;
            }
            case "Diablo" :
            {
                str = SkeletPizzi[2].pizzatype + SkeletPizzi[2].pizzaComponent;
                break;
            }
            case "VegetablePizza" :
            {
                str = SkeletPizzi[3].pizzatype + SkeletPizzi[3].pizzaComponent;
                break;
            }
            default :
            {
                str = SkeletPizzi[4].pizzatype + SkeletPizzi[4].pizzaComponent;
                break;
            }
        }
        String[] subStr1;
        String delimeter = " ";
        subStr1 = str.split(delimeter);
        for(int e = 0; e < subStr1.length; e++) {
            if (subStr1[e].equals("Tomato")) totalPrce+=1;
            if (subStr1[e].equals("Cheese")) totalPrce+=1;
            if (subStr1[e].equals("Salami")) totalPrce+=1.5;
            if (subStr1[e].equals("Bacon")) totalPrce+=1.2;
            if (subStr1[e].equals("Garlic")) totalPrce+=0.3;
            if (subStr1[e].equals("Corn")) totalPrce+=0.7;
            if (subStr1[e].equals("Pepperoni")) totalPrce+=0.6;
            if (subStr1[e].equals("Olives")) totalPrce+=0.55;
            if (subStr1[e].equals("(Standart)")) totalPrce+=1;
            if (subStr1[e].equals("(Calzione)")) totalPrce+=1.5;
        }
        return totalPrce;
    }

    public static void main (String[] args)
    {
        MenuPizz menuPizz = new MenuPizz();
        menuPizz.GotovoeMenuPizz();
            }

    public void toString(String x)
    {

        String[] subStr1;
        String delimeter = ":";
        subStr1 = x.split(delimeter);
        System.out.println();
        System.out.println("******************************");
        System.out.println("Заказ: "+ subStr1[0]);
        System.out.println("Клиент: " + subStr1[1]);
        System.out.println("Название: " + subStr1[2]);
        System.out.println("-------------------------------");

        if (subStr1[2].equals("Margarita"))
        {
           String osnovaPizzi = SkeletPizzi[0].pizzatype;
           String componentsPizzi = SkeletPizzi[0].pizzaComponent;

            findPriceforAPizzaType(osnovaPizzi);

            System.out.println(osnovaPizzi + findPriceforAPizzaType(osnovaPizzi) + " €");

            findNameAndPriceforPizzaComponent(componentsPizzi);

            System.out.println("---------------------------------");

            System.out.println("Всего : " + cenaPizzidouble("Margarita"));

            System.out.println("Количество : " + subStr1[3]);

            System.out.println("---------------------------------");

            System.out.println("Общая сумма : " + cenaPizzidouble("Margarita") * stringToDouble(subStr1[3]));

        }

        if (subStr1[2].equals("PepperoniOro"))
        {


            String osnovaPizzi = SkeletPizzi[1].pizzatype;
            String componentsPizzi = SkeletPizzi[1].pizzaComponent;

            findPriceforAPizzaType(osnovaPizzi);

            System.out.println(osnovaPizzi + findPriceforAPizzaType(osnovaPizzi) + " €");

            findNameAndPriceforPizzaComponent(componentsPizzi);

            System.out.println("---------------------------------");

            System.out.print("Всего : ");
            System.out.printf("%.2f", cenaPizzidouble("PepperoniOro"));
            System.out.println(" €");

            System.out.println("Количество : " + subStr1[3]);

            System.out.println("---------------------------------");

            System.out.print("Общая сумма : ");
            System.out.printf("%.2f", cenaPizzidouble("PepperoniOro") * stringToDouble(subStr1[3]));
            System.out.print(" €");
        }

        if (subStr1[2].equals("Diablo"))
        {
            String osnovaPizzi = SkeletPizzi[2].pizzatype;
            String componentsPizzi = SkeletPizzi[2].pizzaComponent;

            findPriceforAPizzaType(osnovaPizzi);

            System.out.println(osnovaPizzi + findPriceforAPizzaType(osnovaPizzi) + " €");

            findNameAndPriceforPizzaComponent(componentsPizzi);

            System.out.println("---------------------------------");

            System.out.print("Всего : ");
            System.out.printf("%.2f", cenaPizzidouble("Diablo"));
            System.out.println(" €");

            System.out.println("Количество : " + subStr1[3]);

            System.out.println("---------------------------------");

            System.out.print("Общая сумма : ");
            System.out.printf("%.2f", cenaPizzidouble("Diablo") * stringToDouble(subStr1[3]));
            System.out.print(" €");



        }

        if (subStr1[2].equals("VegetablePizza"))
        {
            String osnovaPizzi = SkeletPizzi[3].pizzatype;
            String componentsPizzi = SkeletPizzi[3].pizzaComponent;

            findPriceforAPizzaType(osnovaPizzi);

            System.out.println(osnovaPizzi + findPriceforAPizzaType(osnovaPizzi) + " €");

            findNameAndPriceforPizzaComponent(componentsPizzi);

            System.out.println("---------------------------------");

            System.out.print("Всего : ");
            System.out.printf("%.2f", cenaPizzidouble("VegetablePizza"));
            System.out.println(" €");

            System.out.println("Количество : " + subStr1[3]);

            System.out.println("---------------------------------");

            System.out.print("Общая сумма : ");
            System.out.printf("%.2f", cenaPizzidouble("VegetablePizza") * stringToDouble(subStr1[3]));
            System.out.print(" €");



        }

        if ((!subStr1[2].equals("Margarita"))
                && (!subStr1[2].equals("PepperoniOro"))
                && (!subStr1[2].equals("Diablo"))
                && (!subStr1[2].equals("VegetablePizza")))
        {
            System.out.println("К сожалению данной пиццы нет в Меню :( ");
        }
    }

    public void toStringforApart4(String x)
    {

        String[] subStr1;
        String delimeter = ":";
        subStr1 = x.split(delimeter);

        System.out.println();
        System.out.println("******************************");
        System.out.println("Заказ: "+ subStr1[0]);
        System.out.println("Клиент: " + subStr1[1]);
        System.out.println("Название: " + subStr1[2]);
        System.out.println("-------------------------------");

        if (subStr1[2].equals("Margarita"))
        {
            String osnovaPizzi = "Pizza Base (Calzione) ";
            String componentsPizzi = SkeletPizzi[0].pizzaComponent;

            findPriceforAPizzaType(osnovaPizzi);

            System.out.println(osnovaPizzi + findPriceforAPizzaType(osnovaPizzi) + " €");

            findNameAndPriceforPizzaComponent(componentsPizzi);

            System.out.println("---------------------------------");

            System.out.println("Всего : " + cenaPizzidouble("Margarita"));

            System.out.println("Количество : " + subStr1[3]);

            System.out.println("---------------------------------");

            System.out.println("Общая сумма : " + cenaPizzidouble("Margarita") * stringToDouble(subStr1[3]));

        }

        if (subStr1[2].equals("PepperoniOro"))
        {


            String osnovaPizzi = "Pizza Base (Standart) ";
            String componentsPizzi = SkeletPizzi[1].pizzaComponent;

            findPriceforAPizzaType(osnovaPizzi);

            System.out.println(osnovaPizzi + findPriceforAPizzaType(osnovaPizzi) + " €");

            findNameAndPriceforPizzaComponent(componentsPizzi);

            System.out.println("---------------------------------");

            System.out.print("Всего : ");
            System.out.printf("%.2f", cenaPizzidouble("PepperoniOro"));
            System.out.println(" €");

            System.out.println("Количество : " + subStr1[3]);

            System.out.println("---------------------------------");

            System.out.print("Общая сумма : ");
            System.out.printf("%.2f", cenaPizzidouble("PepperoniOro") * stringToDouble(subStr1[3]));
            System.out.print(" €");



        }

        if (subStr1[2].equals("Diablo"))
        {
            String osnovaPizzi = SkeletPizzi[2].pizzatype;
            String componentsPizzi = SkeletPizzi[2].pizzaComponent;

            findPriceforAPizzaType(osnovaPizzi);

            System.out.println(osnovaPizzi + findPriceforAPizzaType(osnovaPizzi) + " €");

            findNameAndPriceforPizzaComponent(componentsPizzi);

            System.out.println("---------------------------------");

            System.out.print("Всего : ");
            System.out.printf("%.2f", cenaPizzidouble("Diablo"));
            System.out.println(" €");

            System.out.println("Количество : " + subStr1[3]);

            System.out.println("---------------------------------");

            System.out.print("Общая сумма : ");
            System.out.printf("%.2f", cenaPizzidouble("Diablo") * stringToDouble(subStr1[3]));
            System.out.print(" €");

        }

        if (subStr1[2].equals("VegetablePizza"))
        {
            String osnovaPizzi = SkeletPizzi[3].pizzatype;
            String componentsPizzi = SkeletPizzi[3].pizzaComponent;

            findPriceforAPizzaType(osnovaPizzi);

            System.out.println(osnovaPizzi + findPriceforAPizzaType(osnovaPizzi) + " €");

            findNameAndPriceforPizzaComponent(componentsPizzi);

            System.out.println("---------------------------------");

            System.out.print("Всего : ");
            System.out.printf("%.2f", cenaPizzidouble("VegetablePizza"));
            System.out.println(" €");

            System.out.println("Количество : " + subStr1[3]);

            System.out.println("---------------------------------");

            System.out.print("Общая сумма : ");
            System.out.printf("%.2f", cenaPizzidouble("VegetablePizza") * stringToDouble(subStr1[3]));
            System.out.print(" €");

        }

        if (subStr1[2].equals("BasePZZ"))
        {
            String osnovaPizzi = "Pizza Base (Standart) ";
            String componentsPizzi = SkeletPizzi[3].pizzaComponent;

            findPriceforAPizzaType(osnovaPizzi);

            System.out.println(osnovaPizzi + findPriceforAPizzaType(osnovaPizzi) + " €");

            findNameAndPriceforPizzaComponent(componentsPizzi);

            System.out.println("---------------------------------");

            System.out.print("Всего : ");
            System.out.printf("%.2f", cenaPizzidouble("VegetablePizza"));
            System.out.println(" €");

            System.out.println("Количество : " + subStr1[3]);

            System.out.println("---------------------------------");

            System.out.print("Общая сумма : ");
            System.out.printf("%.2f", cenaPizzidouble("VegetablePizza") * stringToDouble(subStr1[3]));
            System.out.print(" €");
        }
    }

    double toStringTotalPrice(String x)
    {
        String[] subStr1;
        String delimeter = ":"; // Разделитель
        subStr1 = x.split(delimeter); // Разделения строки str с помощью метода split()

        if (subStr1[2].equals("Margarita"))
        {
            return cenaPizzidouble("Margarita") * stringToDouble(subStr1[3]);
        }

        if (subStr1[2].equals("PepperoniOro"))
        {
            return cenaPizzidouble("PepperoniOro") * stringToDouble(subStr1[3]);
        }

        if (subStr1[2].equals("Diablo"))
        {
            return cenaPizzidouble("Diablo") * stringToDouble(subStr1[3]);
        }

        if (subStr1[2].equals("VegetablePizza"))
        {
            return cenaPizzidouble("VegetablePizza") * stringToDouble(subStr1[3]);
        }
       return 0;
    }



    double stringToDouble(String strokaVdouble)
    {
        double d=Double.parseDouble(strokaVdouble);
        return  d;
    }

    void findNameAndPriceforPizzaComponent(String t)
    {


        String[] subStr1;
        String delimeter = " ";
        subStr1 = t.split(delimeter);
        for(int e = 0; e < subStr1.length; e++)
        {
            if (subStr1[e].equals("Tomato")) System.out.println("Tomato Paste " + 1 + " €");
            if (subStr1[e].equals("Cheese")) System.out.println("Cheese " + 1 + " €");
            if (subStr1[e].equals("Salami")) System.out.println("Salami " + 1.5 + " €");
            if (subStr1[e].equals("Bacon")) System.out.println("Bacon " + 1.2 + " €");
            if (subStr1[e].equals("Garlic")) System.out.println("Garlic " + 0.3 + " €");
            if (subStr1[e].equals("Corn")) System.out.println("Corn " + 0.7 + " €");
            if (subStr1[e].equals("Pepperoni")) System.out.println("Pepperoni " + 0.6 + " €");
            if (subStr1[e].equals("Olives")) System.out.println("Olives " + 0.55 + " €");
        }
    }


    double findPriceforAPizzaType(String t)
    {
        double totalPrce = 0;

        String str = null;
        switch (t)
        {
            case "Pizza Base (Standart) " :
            {
                totalPrce = 1;
                break;
            }
            case "Pizza Base (Calzione) " :
            {
                totalPrce = 1.5;
                break;
            }
        }
        return totalPrce;
    }
    }

    class Pizza{
    String pizzaname;
    String pizzaComponent;
    String pizzatype;

    public Pizza (String pizzaname, String pizzatype,String pizzaComponent)
    {
        this.pizzaname = pizzaname;
        this.pizzaComponent = pizzaComponent;
        this.pizzatype = pizzatype;
    }
    }



