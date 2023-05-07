package URIMethods;
import java.net.*;
class urimethods{
    public static void main(String[] args) {
        String uri_link="https://user:password@example.com/search?q=dogs=results";
        String uri_link2="https://user:password@subdomain.example.com/path//to/page/?category=books#section-2";

        try {
            URI uri=URI.create(uri_link);
            URI uri2=URI.create(uri_link2);
            System.out.println("Full URi ="+uri);
            System.out.println("URI Scheme="+getScheme());
            System.out.println("URI Authority = "+ uri.getAuthority());
            System.out.println("URI Path ="+uri.getPath());
            System.out.println("URI Query="+uri.getQuery());
            System.out.println("URI Fragment="+uri.getFragment());
            System.out.println("URI Pasre Server Authority="+ uri.parseServerAuthority());
            System.out.println("normalize()="+uri.normalize());

            URI baseURI=new URI("https://example.com/foo/bar.html");
            URI imageURI=new URI("https://example.com/foo/images/logo.png");
            URI relative =baseURI.relativize(imageURI);
            System.out.println("relative URI="+relative.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class urimethods {
    
}
