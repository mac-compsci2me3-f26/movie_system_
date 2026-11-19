import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class rateMovie {

    public static void main(String args[]) {

        String filePath = "C:\\Users\\arhum\\movie_system_\\milestone_1\\data\\test.txt";
        String ratingsHeader = "movie_id, rating, timestamp";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rating: ");
        String rating =  scanner.nextLine();

        try(FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(ratingsHeader + "\n");
            writer.write(rating + "\n");
            writer.close();
            System.out.println("File has been written");

        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file location!");
        }
        catch(IOException e) {
            System.out.println("Could not write file!");

        }
        scanner.close();
    }
}
