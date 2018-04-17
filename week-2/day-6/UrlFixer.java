public class UrlFixer {
    public static void main(String... args){
        int position = 5;
        char letter = ':';
        String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replace("bots", "odds");
        url = url.replace("https//", "https://");
        System.out.println(url);

    }
}