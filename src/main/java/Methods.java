import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by HP on 2017-11-28.
 */
public class Methods {

    public static void findIp(String text){

        String ipPattern = "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])";

        Pattern ipFinderPattern = Pattern.compile(ipPattern);
        Matcher matcher = ipFinderPattern.matcher(text);

        if (matcher.find()){
            System.out.println("Znaleziono poprawnie wpisany adres IP: " + matcher.group());
        }
        else{
            System.out.println("We wprowadzonym wyrażeniu nie ma poprawnego adresu IP.");
        }
    }
    public static void findDateTime(String text){

        String timePattern = "(\\d{2})/(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Apr|Sep|Oct|Nov|Dec)/(\\d{4}):(\\d{2}):(\\d{2}):(\\d{2})";

        Pattern timeDatePattern = Pattern.compile(timePattern);
        Matcher matcher = timeDatePattern.matcher(text);

        if (matcher.find()){
            System.out.println("Znaleziono poprawnie wpisaną datę i godzinę: " +matcher.group());
        }else{
            System.out.println("We wprowadzonym wyrażeniu nie ma poprawnej daty i godziny w formacie np. '07/Mar/2004:16:05:49'");
        }
    }
}
