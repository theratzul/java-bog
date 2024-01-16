import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class filearraywriter {
        public static void main(String[] args) {

        String[] names = {"John", "Carl", "Jerry"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("ioutput.txt"));


            writer.write("Writingtofile");

            for (String name : names) {

                writer.write("\n" + name);
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

