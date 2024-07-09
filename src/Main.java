import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter1 = new FileWriter("title.txt");
        FileWriter fileWriter2 = new FileWriter("author.txt");
        FileWriter fileWriter3 = new FileWriter("text.txt");
        fileWriter1.write("Beggin");
        fileWriter2.write("Боб Гаудио");
        fileWriter3.write("Oooooh\n" +
                "Put your loving hand hand out baby\n" +
                "I'm beggin'\n" +
                "Beggin', beggin' you" +
                " Put your  loving hand out, baby\n" +
                "Beggin', beggin' you " +
                "Put yor loving hand out darlung \n" +
                "Riding high, when I was king\n" +
                "Played it hard and fast, 'cause I had everything\n" +
                "But easy come and easy go\n" +
                "And it would end\n");

        fileWriter1.close();
        fileWriter2.close();
        fileWriter3.close();
        FileReader reader1 = new FileReader("title.txt");
        FileReader reader2 = new FileReader("author.txt");
        FileReader reader3 = new FileReader("text.txt");
        Scanner scanner1 = new Scanner(reader1);
        Scanner scanner2 = new Scanner(reader2);
        Scanner scanner3 = new Scanner(reader3);

        while (scanner1.hasNextLine()) {
            System.out.println(scanner1.nextLine());
            while (scanner2.hasNextLine()) {
                System.out.println(scanner2.nextLine());
                while (scanner3.hasNextLine()) {
                    System.out.println(scanner3.nextLine());
                }
            }
        }

        reader1.close();
        reader2.close();
        reader3.close();

    }
}

