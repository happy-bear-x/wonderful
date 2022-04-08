package me.wonderful.api;

import lombok.extern.slf4j.Slf4j;
import me.wonderful.common.AjaxResult;
import me.wonderful.common.Utils;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author xiongchaodu
 * @date 2022/04/08 10:12
 **/
@Slf4j
@RequestMapping("/sentence")
@RestController
public class ApiSentence {

    /**
     * 心灵毒鸡汤
     */
    @GetMapping("/dis")
    public AjaxResult disHope() {
        String disHopeUrl = "https://www.nihaowua.com/home.html";
        try {
            Document document = Utils.getHttpDocument(disHopeUrl);
            Element section = document.selectFirst("section");

            Element bgTag = document.selectFirst("p a.reload:last-of-type");
            String url = bgTag.attr("href");
            return AjaxResult.success(section.text()).setOther(url);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            return AjaxResult.error();
        }
    }

    @PostMapping()
    public AjaxResult save() {
        String disHopeUrl = "https://www.nihaowua.com/home.html";
        try {
            Document document = Utils.getHttpDocument(disHopeUrl);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            return AjaxResult.error();
        }
        return AjaxResult.success();
    }
}
