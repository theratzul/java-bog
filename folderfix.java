import java.io.*;

public class folderfix {

    public static void main(String[] args) {
        String path = "test";
        File Dir = new File(path);

        if(!Dir.exists()) {
            if(Dir.mkdir()) {
                System.out.println("Folder has ben created");
            }
            else{
                System.out.println("Folder failed to be created");
            }
        }
        else{
            System.out.println("Folder already exists");
        }

    }
    
}
