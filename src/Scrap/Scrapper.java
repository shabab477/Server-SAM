package Scrap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Scrapper {

    public static void main(String[] args) {

        Document doc = null;

        try {

            doc = Jsoup.connect("http://172.16.50.4/FTP-2/English%20Movies%20%281080p%29/%282017%29%201080p/").get();
            Elements names = doc.select("li.item").not("li.folder-parent");

            for (Element name : names) {
                //System.out.println( name.text() );

                parseData movie = new parseData(name.text());
                System.out.println("Name : " + movie.getName());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
