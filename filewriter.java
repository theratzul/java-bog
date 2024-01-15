import java.io.*;

public class filewriter{
    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("ioutput.txt"));
            writer.write("Writingtofile");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}