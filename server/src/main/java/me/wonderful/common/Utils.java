package me.wonderful.common;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.util.Map;

/**
 * @author xiongchaodu
 * @date 2022/04/08 10:54
 **/
public class Utils {
    
    /**
     * 以 userAgent获取document
     */
    public static Document getHttpDocument(String url) throws IOException {
        return Jsoup.connect(url)
                .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.198 Safari/537.36")
                .get();
    }

    public static Document getHttpDocument(String url, Map<String, String> header) throws IOException {
        Connection connection = Jsoup.connect(url)
                .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.198 Safari/537.36");
        if (!CollectionUtils.isEmpty(header)) {
            connection.headers(header);
        }
        return connection.get();
    }
}
