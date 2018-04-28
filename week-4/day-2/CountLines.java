import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountLines
{
    public static void main(String[] args)
    {
        List<String> content = new ArrayList(
                Arrays.asList(
                        "First Line",
                        "Second *** Line",
                        "Third Line",
                        "Fourth Line",
                        "Fifth *** Line"
                )
        );

        Path filePath = Paths.get("myFile.txt");
        try {
            Files.write(filePath, content);
        } catch (Exception e) {
            System.out.println(" Could not write a file :( ");
        }

        try{

            File file = new File("myFile.txt");

            if(file.exists()){

                FileReader fr = new FileReader(file);
                LineNumberReader lnr = new LineNumberReader(fr);

                int linenumber = 0;

                while (lnr.readLine() != null){
                    linenumber++;
                }

                System.out.println("Number of lines : " + linenumber);

                lnr.close();


            }else{
                System.out.println("File not found");
            }

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
