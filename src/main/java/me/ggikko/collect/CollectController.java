package me.ggikko.collect;

import me.ggikko.gcm.GcmDto;
import me.ggikko.gcm.GcmTest;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by Park Ji Hong, ggikko.
 */

@RestController
public class CollectController {

    @Autowired
    CollectRepository collectRepository;

    @RequestMapping(value = "hello")
    public String hello() {
        return "hello ggikko";
    }

    @RequestMapping(value = "test/{id}", method = GET)
    public void inputTest(@PathVariable String id) {

//        try {
//            Document doc = Jsoup.connect("http://www.diningcode.com/list.php?query="+id).get();
//            Elements content = doc.select("div.dc-restaurant-name");
//
//            for(Element element : content){
//                System.out.printf(element.text() + " ");
//            }
//
//                System.out.printf(content.text());
//
//        }catch(Exception e ){
//
//        }


//        List<TermNode> result = Analyzer.parseJava("강남역12번출구 이자카야 하루 대박강추 점심메뉴도 존맛!!");
//        for (TermNode term: result) {
//            System.out.println(term.term().surface());
//        }


    }

    //GCMTEST
    @RequestMapping(value = "gcm", method = GET)
    public void gcmTest() {

        GcmTest gcmservice = new GcmTest();
        gcmservice.pushMessageToApp();

    }

    @RequestMapping(value = "gcm2/{message}/{title}", method = GET)
    public void gcmTest2(@PathVariable("message")String message,@PathVariable("title")String title) throws IOException {

        GcmTest gcmservice = new GcmTest();
        gcmservice.pushMessageToApp2(message, title);

    }

}


//dc-restaurant-name