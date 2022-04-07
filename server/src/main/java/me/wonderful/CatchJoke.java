package me.wonderful;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CatchJoke {
    public static void main(String[] args) throws IOException, InterruptedException {
        List<Integer> goodJokeIdList = new ArrayList<>();
        String judgUrl = "https://xiaohua.zol.com.cn/index.php?c=Ajax_Xiaohua&a=XhVoteGoodBad&xhId=";
        String contextUrl = "https://xiaohua.zol.com.cn/detail14/%d.html";
        for (int i = 16000; i < 17000; i++) {
            try {

                Document document = getDoc(judgUrl + i);
                // {"16828":["4","3"]}
                String text = document.body().text();
                if (StringUtils.hasText(text)) {
                    int fStart = text.indexOf("[\"");
                    int fEnd = text.indexOf("\",\"");
                    int sEnd = text.indexOf("\"]");
                    double agree = Double.parseDouble(text.substring(fStart + 2, fEnd));
                    double disagree = Double.parseDouble(text.substring(fEnd + 3, sEnd));
                    if (disagree == 0) {
                        disagree = 1;
                    }
                    if (agree > 20 && agree / disagree > 2.5) {
                        goodJokeIdList.add(i);
                    }
                }
                Thread.sleep(200);
            } catch (Exception ig) {
                ig.printStackTrace();
            }

        }
        System.out.println(goodJokeIdList);
        for (Integer id : goodJokeIdList) {
            try {
                String targetUrl = String.format(contextUrl, id);
                Document document = getDoc(targetUrl);
                for (Element element : document.select(".article-text")) {
                    System.out.println(id + ">>" + element.text());
                    System.out.println();
                }
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static Document getDoc(String url) throws IOException {
        return Jsoup.connect(url)
                .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.198 Safari/537.36")
                .get();
    }
}
