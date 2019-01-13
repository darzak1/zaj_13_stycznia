import java.net.MalformedURLException;
import java.net.URL;

public class CheckExpeptionTester {

    public static void main(String[] args) {
        CheckExpeptionTester checkExpeptionTester = new CheckExpeptionTester();
        checkExpeptionTester.urlTesterByTryCatch("http://wszib.edu.pl");

    }

    public void urlTesterByTryCatch(String urlStr) {
        try {
            URL url = new URL(urlStr);
            System.out.println("Protocol " + url.getProtocol());
            System.out.println("Host " + url.getHost());
        } catch (MalformedURLException murle){
            murle.printStackTrace();
        }

    }



}
