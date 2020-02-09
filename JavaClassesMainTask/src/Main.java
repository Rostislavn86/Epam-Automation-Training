import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ObjMassOfBooksAndMethods objMassOfBooksAndMethods = new ObjMassOfBooksAndMethods();
        //Готовые книги
        Book book1 = new Book("Мастер и маргарита","Михаил Булгакв","Издательство Росмен",1953,250,5000,"Strong");
        Book book2 = new Book("Преступление и наказание","Фёдор Достоевский","Издательство Москва",1964,200,4000);
        Book book3 = new Book("Война и Мир","Лев Толстой","Издательство Заря",1968,950,10000);
        Book book4 = new Book("Идиот","Фёдор Достоевский","Издательство Росмен",1999,200,4560);
        Book book5 = new Book("Мёртыве Души","Николай Гоголь","Издательство Москва",2019,246,5600);
        Book book6 = new Book();
        Book book7 = new Book();
        Book book8 = new Book();
        Book book9 = new Book("Михаил Булгакв");
        Book book10 = new Book("Михаил Булгакв");

        objMassOfBooksAndMethods.library[0] = book1;
        objMassOfBooksAndMethods.library[1] = book2;
        objMassOfBooksAndMethods.library[2] = book3;
        objMassOfBooksAndMethods.library[3] = book4;
        objMassOfBooksAndMethods.library[4] = book5;
        objMassOfBooksAndMethods.library[5] = book6;
        objMassOfBooksAndMethods.library[6] = book7;
        objMassOfBooksAndMethods.library[7] = book8;
        objMassOfBooksAndMethods.library[8] = book9;
        objMassOfBooksAndMethods.library[9] = book10;

        System.out.println("Добрый день, вот книги которые в данный момнт находяться в Библиотеке :");
        objMassOfBooksAndMethods.vivestiSpisokKnig();

        System.out.println("Вы хотите вывести дополнительные критерии касательно книг на консоль ? ");

        objMassOfBooksAndMethods.chooseVivod();

    }
}
