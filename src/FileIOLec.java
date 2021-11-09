import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileIOLec {


    public static void main(String[] args) throws IOException {

        String directory = "data";
        String filename = "info.txt";

        Path dataDir = Paths.get(directory);
        Path dataFile = Paths.get(filename);

        if(Files.notExists(dataDir)) {
            Files.createDirectories(dataDir);
        }
        if(! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }
        List<String> groceryList = Arrays.asList("Coffe", "milk", "eggs");
        Path getMyPath = Paths.get("data","info.txt");
        Files.write(getMyPath, groceryList);

        List<String> list = Files.readAllLines(getMyPath);

        for(int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ": " + list.get(i));
        }

        System.out.println(getMyPath);
        Files.write(
               Paths.get("data", "info.txt"),
                Arrays.asList("Sugar"),
                StandardOpenOption.APPEND

        );
        System.out.println();

        List<String> newList = Files.readAllLines(getMyPath);

        for(int j = 0; j < newList.size(); j++) {
            System.out.println((j + 1) + ": " + newList.get(j));
        }



    }

}
