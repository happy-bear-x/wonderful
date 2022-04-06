package me.wonderful;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiongchaodu
 * @date 2022/04/06 10:14
 **/
public class CatchJoke {
    public static void main(String[] args) throws IOException {
        List<Integer> goodJokes = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {

            //59284
            Connection connect = Jsoup.connect("https://xiaohua.zol.com.cn/index.php?c=Ajax_Xiaohua&a=XhVoteGoodBad&xhId=" + i);
            Document judgment = connect.get();
            // {"59284":["659","263"]}
            String jsonStr = judgment.body().text();
            if (StringUtils.hasText(jsonStr)) {
                int fStart = jsonStr.indexOf("[\"");
                int fEnd = jsonStr.indexOf("\",\"");
                int sEnd = jsonStr.indexOf("\"]");
                int agree = Integer.parseInt(jsonStr.substring(fStart + 2, fEnd));
                int disagree = Integer.parseInt(jsonStr.substring(fEnd + 3, sEnd));
                if (disagree == 0) {
                    disagree = 1;
                }
                if (agree / disagree > 2) {
                    goodJokes.add(i);
                }
            }
            
        }
        System.out.println(goodJokes);

//        String textUrl = "https://xiaohua.zol.com.cn/detail1/{}.html";
    }
}
