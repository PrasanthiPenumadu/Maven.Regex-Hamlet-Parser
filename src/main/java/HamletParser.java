import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;

    public HamletParser(){
        this.hamletData = loadFile();
    }

    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData(){
        return hamletData;
    }
    public Integer findHamlet(){
        Integer count=0;
        String patternstring="Hamlet";
        String patternstring1="HAMLET";
        Pattern pattern=Pattern.compile(patternstring);
        Matcher matcher=pattern.matcher(this.hamletData);
        for(int i=0;matcher.find();i++){
            count++;
        }
        Pattern pattern1=Pattern.compile(patternstring1);
        Matcher matcher1=pattern1.matcher(this.hamletData);
        for(int i=0;matcher1.find();i++){
            count++;
        }
        System.out.println(count);
        return count;
    }
    public Integer findHoratio() {
        Integer count=0;
        String patternstring="Horatio";
        String patternString1="HORATIO";
        Pattern pattern = Pattern.compile(patternstring);
        Matcher matcher = pattern.matcher(this.hamletData);
        for (int i = 0; matcher.find(); i++) {
            count++;
        }
        Pattern pattern1 = Pattern.compile(patternString1);
        Matcher matcher1 = pattern1.matcher(this.hamletData);
        for (int j = 0; matcher1.find(); j++) {
            count++;
        }
        System.out.println(count);
        return count;
    }
    public String changeHoratioToTariq(){
        String patternstring="Horatio";
        String patternString1="HORATIO";
        Pattern pattern = Pattern.compile(patternstring);
        Matcher matcher = pattern.matcher(this.hamletData);
        String output=    matcher.replaceAll("Tariq");
        Pattern pattern1 = Pattern.compile(patternString1);
        Matcher matcher1 = pattern1.matcher(this.hamletData);
          output+=  matcher1.replaceAll("Tariq");
        return output;
    }
    public Integer findTariq() {
        Integer count = 0;
        String patternstring = "Tariq";
        Pattern pattern = Pattern.compile(patternstring);
        Matcher matcher = pattern.matcher(changeHoratioToTariq());
        for (int i = 0; matcher.find(); i++) {
            count++;
        }
        System.out.println(count);
        return count;
    }
    public String changeHamletToLeon(){
        String patternstring="HAMLET";
        String patternString1="Hamlet";
        Pattern pattern = Pattern.compile(patternstring);
        Matcher matcher = pattern.matcher(this.hamletData);
        String output1=    matcher.replaceAll("Leon");
        Pattern pattern1 = Pattern.compile(patternString1);
        Matcher matcher1 = pattern1.matcher(this.hamletData);
        output1+=  matcher1.replaceAll("Leon");
        return output1;
    }
    public Integer findLeon() {
        Integer count = 0;
        String patternstring = "Leon";
        Pattern pattern = Pattern.compile(patternstring);
        Matcher matcher = pattern.matcher(changeHamletToLeon());
        for (int i = 0; matcher.find(); i++) {
            count++;
        }
        System.out.println(count);
        return count;
    }

}
