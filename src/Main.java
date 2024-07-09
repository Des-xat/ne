import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter1 = new FileWriter("Alf.txt");
        fileWriter1.write("A a\n B b\n C c\n D d\nE e\n F f\n G g\n H h \n I i\n J j\nK k\n L l \n M m \nN n \n O o\n P p\nQ q\n R r\nS s\n T t\n U u\nV v\nW w\nX x\nY y\n Z z ");
        fileWriter1.write("0\n1\n\n2\n3\n4\n5\n6\n7\n8\n9");

        fileWriter1.close();
        FileReader fileReader1 = new FileReader("Alf.txt");
        Scanner scanner = new Scanner(fileReader1);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());

        }
        fileReader1.close();

    }
}

