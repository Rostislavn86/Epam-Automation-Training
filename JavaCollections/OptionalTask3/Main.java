package OptionalTask3;

//Занести стихотворение в список. Провести сортировку по возрастанию длин строк.

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException {
        MethodsOptionalTask3 methods = new MethodsOptionalTask3();
        methods.SortirovakStrok(methods.addStringFromFileToTheCollection());
    }


}
