package OptionalTask3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MethodsOptionalTask3 {

    public ArrayList<String> addStringFromFileToTheCollection() throws IOException {

        ArrayList<String> text = new ArrayList<>();

        File file = new File("D:\\Epam_Task\\CollectionsPovt\\src\\OptionalTask3\\Test.txt");

        //Доюавляем содержание файла в коллекцию
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
        {
            //System.out.println(st);
            text.add(st);
        }
        return text;
    }

    public void SortirovakStrok(ArrayList<String> x) throws IOException
    {

        Collections.sort(x, new LengthComparator());
        int count = x.size();
        try(FileWriter writer = new FileWriter("D:\\Epam_Task\\CollectionsPovt\\src\\OptionalTask3\\Test.txt", true))
    {
        writer.write("------------Отсортированные строки-----------------");
        writer.append('\n');
        for(int i =0; i < count;i++) {
            writer.write(x.get(i));
            writer.append('\n');
        }
    }
    }

    public class LengthComparator implements  java.util.Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o1.length()-o2.length();
        }
    }

    }



