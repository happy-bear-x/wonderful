package me.wonderful.service;

import me.wonderful.common.AjaxResult;
import me.wonderful.common.Utils;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class SentenceService {

   public String getNiHaoWuSectionText(String url) throws IOException {
       return Utils.getHttpDocument(url).selectFirst("section").text();
    }
}
