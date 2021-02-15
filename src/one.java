
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class one {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub
        File text = new File("text.txt");

        Scanner scnr = new Scanner(text);
        String alphabet = ".*abcdefghijklmnopqrstuvwxyz.*|.*ABCDEFGHIJKLMNOPQRSTUVWXYZ.*";
        String findOla = "[Oo][Ll][Aa]";
        String findA = "[a]{3,5}";
        String findAz = "[^a-zA-Z0-9]{2,}";
        String findMail =  "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,3}";
        String findPhoneNr = "[0-9]{3}[\\s\\-/][0-9]{5,6}";




        Pattern pattern = Pattern.compile(findPhoneNr);

       // Pattern pattern = Pattern.compile(findPhoneNr);

        // Pattern pattern = Pattern.compile(findMail);

        int lineNumber = 1;
        int findACounter=0;
        int findACounter2=0;
        while (scnr.hasNextLine()) {
            String line = scnr.nextLine();
            //    finder(line, alphabet, lineNumber); // innanför loopen
            //  finder(line, findOla, lineNumber); // innanför loopen
            // finder(line, findA, lineNumber);
         //   findACounter = counter(line, findAz, findACounter); //räknare
          //  finder(line, findMail, lineNumber);
         //   finder (line, findPhoneNr, lineNumber);
     //       findACounter = counter(line, findAz, findACounter);
            findACounter2 = counter(line, findPhoneNr, findACounter2);

            //     System.out.print("Line: " + lineNumber + ": ");
            lineNumber++;
        }

       // System.out.print("Found email "+ findMail);
       // System.out.print("Found symbols "+ findACounter);
       // String myString = "myString";


    }

    public static void finder(String inputString, String pattern, int lineNumber) {
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(inputString);


        while (matcher.find()) { //searches for string
            if (matcher.group().length() != 0) { //print unless length is empty.
                System.out.println("lineNumber" + lineNumber + " " + matcher.group());

            }

            //   System.out.print("Line: " + lineNumber);

            //      System.out.println("End: " + matcher.end());

        }
    }

    public static int counter(String inputString, String pattern, int counter) {
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(inputString);


        while (matcher.find()) { //searches for string
            if (matcher.group().length() != 0) { //print unless length is empty.

                counter++;
            }

            //   System.out.print("Line: " + lineNumber);

            //      System.out.println("End: " + matcher.end());
        }
        return counter;
    }


}