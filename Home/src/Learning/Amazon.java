package Learning;
import java.util.regex.*;

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


