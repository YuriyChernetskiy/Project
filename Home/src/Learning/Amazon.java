package Learning;
import java.util.regex.*;

/**
 * Created by Юрчик on 19.04.2017.
 */
class Amazon {
    Pattern pat;
    Matcher mat;
    String url;

    public Amazon(String url){
        this.url = url;
    }

    public String amazon() {
        pat = Pattern.compile("page=[0-9]*");
        mat = pat.matcher(url);
        return mat.replaceAll("page=10");
    }
}
class AmmazonApp {
    public static void main(String[] args) {
      Amazon am = new Amazon("https://www.amazon.com/s/ref=sr_pg_13?fst=p90x%3A1&rh=i%3Aaps%2Ck%3Aumbrella&page=13&keywords=umbrella&ie=UTF8&qid=1492598041&spIA=B01MT5F7FN,B015K7WUUA,B06Y3265XF,B00UR0EFEK,B01J4UCSFG,B01NAYOAXE");
      String newUrl =  am.amazon();
        System.out.println("Old url: ");
        System.out.println(am.url);
        System.out.println("New url: ");
        System.out.println(newUrl);
    }
}


