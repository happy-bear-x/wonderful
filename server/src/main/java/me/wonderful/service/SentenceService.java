package me.wonderful.service;

import lombok.extern.slf4j.Slf4j;
import me.wonderful.common.AjaxResult;
import me.wonderful.common.Utils;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Objects;

@Slf4j
@Service
public class SentenceService {

    public AjaxResult getNiHaoWu(String url) {
        try {

            Document document = Utils.getHttpDocument(url);
            String section = document.selectFirst("section").text();
            AjaxResult result = AjaxResult.success(section);
            Element bgTag = document.selectFirst("p a.reload:last-of-type");
            if (!Objects.isNull(bgTag)) {
                String bgUrl = bgTag.attr("href");
                result.setOther(bgUrl);
            }
            return result;
        }catch (Exception e){
            log.error("获取你好污失败:"+url, e);
            return AjaxResult.error("获取失败，请重试");
        }
    }
}
