import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Wypisz wszystkie daty i numery ip zawarte w logu.
 **/
public class Main {

    public static void main(String[] args) {

        String example1 = "132.25dc4.1.10 - - [07/Mar/2004:16:05:49 -0800] \"GET /twiki/bin/edit/Main/Double_bounce_sender?topicparent=Main.ConfigurationVariables HTTP/1.1\" 401 12846";
        String example2 = "192.1623218.88.22 - - [07/Apr/2004:16:06:51 -0800] \"GET /twiki/bin/rdiff/TWiki/NewUserTemplate?rev1=1.3&rev2=1.2 HTTP/1.1\" 200 4523";
        String example3 = "64.242.88.10 - - [07/May/2004:16:10:02 -0800] \"GET /mailman/listinfo/hsdivision HTTP/1.1\" 200 629";
        String example4 = "192.168.8.11 - - [07/December/2004:16:11:58 -0800] \"GET /twiki/bin/view/TWiki/WikiSyntax HTTP/1.1\" 200 7352";
        String example5 = "64.242.88.12 - - [07/Nov/2004:16:20:55 -0800] \"GET /twiki/bin/view/Main/DCCAndPostFix HTTP/1.1\" 200 5253";


        Methods.findIp(example1);
        Methods.findDateTime(example1);
        Methods.findIp(example2);
        Methods.findDateTime(example2);
        Methods.findIp(example3);
        Methods.findDateTime(example3);
        Methods.findIp(example4);
        Methods.findDateTime(example4);
        Methods.findIp(example5);
        Methods.findDateTime(example5);


    }

}
