package cookie;
import java.net.*;
import java.util.*;

public class Httpexample {
    public static void main(String[] args) {
        try{
            //import java.net.*; lekhnu ra import java.net.CookieManger lekhnu yeutai ho
            CookieManager manager = new CookieManager();
            CookieStore cookieStore =manager.getCookieStore();
            HttpCookie cookieA =new HttpCookie("c1","Lionel");
            HttpCookie cookieB =new HttpCookie("c2", "Messi");
    
            URI uri1 =new URI ("www.abc.com");
            URI uri2 =new URI ("www.xyz.com");
    
            cookieStore.add(uri1,cookieA);
            cookieStore.add(uri2,cookieB);
    
            List<HttpCookie> list =cookieStore.getCookies();
            System.out.println("Store Cookies:"+list);
            // cookieStore.remove(uri1, cookieA);
            // System.out.println("Store Cookies:"+list);
            // cookieStore.remove(uri2, cookieB);
            // System.out.println("Store Cookies:"+list);

            for (HttpCookie cookie : list) {
                System.out.println(cookie);
            }
        }
        
        catch (Exception e){

        }
    }
}
