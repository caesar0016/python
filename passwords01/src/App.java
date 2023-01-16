import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    Pattern pattern = Pattern.compile("[a-zA-Z]{5}, //d");

    System.out.println("Enter Password: ");
    String pass = s.nextLine();
    
    Matcher matches = pattern.matcher(pass);
    
    if (matches.find()) {

      System.out.println("THis is good");

    }

  }

}
