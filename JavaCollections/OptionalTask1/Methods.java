package OptionalTask1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

//1.   Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.

public class Methods {

    public ArrayList<String> addStringFromFileToTheCollection() throws IOException {

        ArrayList<String> text = new ArrayList<>();

        File file = new File("D:\\Epam_Task\\CollectionsPovt\\src\\OptionalTask1\\Test.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
        {
            text.add(st);
        }
        return text;
    }

    public void vvodStrokIzFailaVObrathnomPorioadke(ArrayList<String> x) throws IOException
    {
        Collections.reverse(x);
        int count = x.size();
        try(FileWriter writer = new FileWriter("D:\\Epam_Task\\CollectionsPovt\\src\\OptionalTask1\\Test.txt", true))
        {
            writer.write("------------Выведенные строки в обратном порядке-----------------");
            writer.append('\n');
        for(int i =0; i < count;i++) {
            writer.write(x.get(i));
            writer.append('\n');
        }
        }
    }
}
