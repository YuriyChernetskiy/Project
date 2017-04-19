package Learning;
import java.util.regex.*;
import java.util.Scanner;

/**
 * Created by Юрчик on 19.04.2017.
 */
class Amazon {
    private Pattern pat;
    private Matcher mat;
    public  String url;
    private String repPage;

    public Amazon(String url){
        this.url = url;
    }

    public String changeUrl(String nextPage) {
        repPage = "page=" + nextPage;
        pat = Pattern.compile("page=[0-9]*");
        mat = pat.matcher(url);
        return mat.replaceAll(repPage);
    }
}
class AmmazonApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Amazon am = new Amazon("https://www.amazon.com/s/ref=sr_pg_13?fst=p90x%3A1&rh=i%3Aaps%2Ck%3Aumbrella&page=13&keywords=umbrella&ie=UTF8&qid=1492598041&spIA=B01MT5F7FN,B015K7WUUA,B06Y3265XF,B00UR0EFEK,B01J4UCSFG,B01NAYOAXE");
        System.out.print("Выбирете страницу для перехода: ");
        String page = sc.next();
        String newUrl =  am.changeUrl(page);
        System.out.println("Old url: ");
        System.out.println(am.url);
        System.out.println("New url: ");
        System.out.println(newUrl);
    }
}


