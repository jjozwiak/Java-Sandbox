/*
 * Variables
 * Iterations
 * User-defined methods
 * Method argument passing
 * Constructor
 * ArrayList
 * User-defined class
 */

import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Example program to list links from a URL.
 */
public class WebPage {

    Document doc;
    Elements images;
    ArrayList<String> imageFiles;

    public WebPage(String url) throws IOException
    {
        doc = Jsoup.connect(url).timeout(10*1000).get();
        images = doc.getElementsByTag("img");
        imageFiles = new ArrayList<String>();
    }

    // public void printFiles()
    // {
    //     for (Element image : images) {

    //         String fileName = image.attr("src");

    //         String[] bits = fileName.split("/");
    //         String lastOne = bits[bits.length-1];

    //         System.out.println(lastOne);

    //     }
    // }

    public void addToImagesList(ArrayList<String> imagesList)
    {
        for (Element image : images) {

            String fileName = image.attr("src");

            String[] bits = fileName.split("/");
            String lastOne = bits[bits.length-1];

            imagesList.add(lastOne);

        }
    }

}