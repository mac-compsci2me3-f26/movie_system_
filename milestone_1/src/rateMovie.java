import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class rateMovie {

    public static void main(String args[]) {

        String filePath = "C:\\Users\\arhum\\movie_system_\\milestone_1\\data\\my_ratings.txt";
        
        String ratingsHeader = "movie_id, rating, timestamp";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rating: ");
        String rating =  scanner.nextLine();
        



        try(FileWriter writer = new FileWriter(filePath, true)) {
            try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                if (br.readLine() == null) {
                    writer.write(ratingsHeader + "\n");
                    System.out.println("Wrote header line of my_ratings.txt");
                    // This is only written the first time upon file creation then never
                    // written again. Unless you delete the file and decide to create again.

                }
                
            }
            catch (FileNotFoundException e) {
                System.out.println("File not found!");
            }
            catch (IOException e) {
                System.out.println("Something went wrong!!" + e);
            }

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
