package OptionalTask2;

//Ввести строки из файла, записать в список ArrayList.
// Выполнить сортировку строк, используя метод sort() из класса Collections.


import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException {
        MethodsOptionalTask2 methods = new MethodsOptionalTask2();
        methods.SortirovkaStrokMethodomSort(methods.addStringFromFileToTheCollection());
    }


}
