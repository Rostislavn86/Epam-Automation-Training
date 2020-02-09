package OptionalTask2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class MethodsOptionalTask2 {

    public ArrayList<String> addStringFromFileToTheCollection() throws IOException {

        ArrayList<String> text = new ArrayList<>();

        File file = new File("D:\\Epam_Task\\CollectionsPovt\\src\\OptionalTask2\\Test.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
        {
            text.add(st);
        }
        return text;
    }

    public void SortirovkaStrokMethodomSort(ArrayList<String> x) throws IOException
    {
        Collections.sort(x);
        int count = x.size();
        try(FileWriter writer = new FileWriter("D:\\Epam_Task\\CollectionsPovt\\src\\OptionalTask2\\Test.txt", true))
        {
            writer.write("------------Отсортированные строки-----------------");
            writer.append('\n');
            for(int i =0; i < count;i++) {
                writer.write(x.get(i));
                writer.append('\n');
            }
        }
    }
}



