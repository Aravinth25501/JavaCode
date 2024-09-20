import java.text.NumberFormat;
import java.util.Locale;

public class Currency{
   
    public static void main(String[] args) {

    double num=12345.67;
    Locale germanyLocale =Locale.GERMANY;
    NumberFormat formatter = NumberFormat.getInstance(germanyLocale);

    String cr = formatter.format(num);
    

    System.out.println(cr);

    }
}

