import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class parseRatings {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\arhum\\movie_system_\\milestone_1\\data\\my_ratings.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            reader.readLine();
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        }
        catch( FileNotFoundException e ) {
            System.out.println( "File not found" );

        }
        catch(IOException e) {
            System.out.println("Something went wrong!!" + e);
        }


    }
}
