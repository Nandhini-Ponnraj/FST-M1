package activities;

import org.apache.commons.io.FileUtils;
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Activity14 {

    public static void main(String[] args) throws IOException {
String path="src/main/java/activities/javafiletestWrite2.txt";
        File file = new File(path);
        boolean a = file.createNewFile();
        if(a == true){
        System.out.println("File Created Successfully");
        }
        else {
            System.out.println("Failed to create file");
        }
       String path2="src/main/java/activities/javafiletests.txt";
        FileWriter f=new FileWriter(file);
        f.write("Writing into the file: Welcome! " );
        f.close();
        File getfiletoread = FileUtils.getFile(file);
        String filecontent=FileUtils.readFileToString(getfiletoread, StandardCharsets.UTF_8);
        System.out.println("Reading file content: "+filecontent );

        File Dir=new File("resorce");
       FileUtils.copyFileToDirectory(file,Dir);
               System.out.println("File copied to Directory successfully!" );

    }
}