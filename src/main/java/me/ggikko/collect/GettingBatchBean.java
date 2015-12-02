package me.ggikko.collect;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Park Ji Hong, ggikko.
 */

@Component
public class GettingBatchBean {

    private static String url = "http://cafeblog.search.naver.com/search.naver?where=post&sm=tab_pge&query=강남+회사+점심&st=sim&date_option=0&date_from=&date_to=&dup_remove=1&post_blogurl=&post_blogurl_without=&srchby=all&nso=&ie=utf8&start=11";
    private static String url2 = "http://cafeblog.search.naver.com/search.naver?where=post&sm=tab_pge&query=강남+회사+점심&st=sim&date_option=0&date_from=&date_to=&dup_remove=1&post_blogurl=&post_blogurl_without=&srchby=all&nso=&ie=utf8&start=1";
    private static String agent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.86 Safari/537.36";
    private static String url3 = "http://cafeblog.search.naver.com/search.naver?sm=tab_hty.top&where=post&ie=utf8&query=%EC%84%A0%EB%A6%89+%ED%9A%8C%EC%82%AC+6000%EC%9B%90";

    private static String Accept = "Accept";
    private static String Accept_Value = "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8";
    private static String Accept_Encoding = "Accept-Encoding";
    private static String Accept_Encoding_Value = "gzip, deflate, sdch";
    private static String Accept_Language = "Accept-Language";
    private static String Accept_Language_Value = "ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4";
    private static String Connection = "Connection";
    private static String Connection_Value = "keep-alive";
    private static String Cookie = "Cookie";
    private static String Cookie_Value = "NNB=YLJNMEKXALOVK; npic=dMJH2/5aI+vRgkrAbYPKlrPIVbYgEi4pCUOqip0Rtxu9Zd7e8mA71inoEcn6bHbMCA==; _ga=GA1.2.583957013.1447912291; nid_iplevel=-1; page_uid=SDQytsoRR1wssclQQq0ssssssth-233410; _naver_usersession_=/Hds/kP4nleIsdNh4MmFlg==; nx_open_so=1";
    private static String Host = "Host";
    private static String Host_Value = "cafeblog.search.naver.com";
    private static String Upgrade_Insecure_Requests = "Upgrade-Insecure-Requests";
    private static String Upgrade_Insecure_Requests_Value = "1";
    private static String User_Agent = "User-Agent";
    private static String User_Agent_Value = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.86 Safari/537.36";

    @Autowired
    CollectRepository collectRepository;

    //자동 네이버 블로그 데이터 긁어오기
   @Scheduled(cron = "*/20 * * * * *")
    public void inputData() {

//        try {
//
//            Document doc = Jsoup.connect(url3)
//                    .header(Accept, Accept_Value)
////                    .header(Accept_Encoding, Accept_Enxcoding_Value)
////                    .header(Accept_Language, Accept_Language_Value)
////                    .header(Connection, Connection_Value)
////                    .header(Cookie, Cookie_Value)
////                    .header(Host, Host_Value)
////                    .header(Upgrade_Insecure_Requests, Upgrade_Insecure_Requests_Value)
////                    .header(User_Agent, User_Agent_Value)
//                    .get();
//
//            //엘리먼트들을 가져온다
////            Document doc = Jsoup.connect(url2).get();
//            Elements elementsByClass = doc.select("a.sh_blog_title");
//
//            for (Element element : elementsByClass) {
//
//                ArrayList<String> list = new ArrayList<String>();
//                String title = element.attr("title");
//                list.add(title);
////                List<TermNode> result = Analyzer.parseJava(title);
////                for (int i = 0; i < result.size(); i++) {
////                    list.add(result.get(i).term().surface());
////                }
//
//
//                for (int i = 0; i < list.size(); i++) {
//
//                    System.out.printf(list.get(i) + "//");
//                }
//
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        //특수문자 제거
//        String str ="테####스!트@#";
//        StringBuffer sb = new StringBuffer();
//
//        for(int i=0 ; i< str .length(); i++)
//        {
//            if(Character.isLetterOrDigit(str .charAt(i))) sb.append(str .charAt(i));
//        }
//
//       String str2 = "하하 로로 이이 ";
//       String trim = str2.trim();
//       //하하로로이이
//
//       System.out.printf(sb.toString());
//
////
////        CollectInfo collectInfo = new CollectInfo();
////        collectInfo.setUrl("http://ggikko.com");
////        collectInfo.setHtmlInfo("hello");
////        collectRepository.save(collectInfo);

    }
}
