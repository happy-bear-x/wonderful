package me.wonderful.api;

import lombok.extern.slf4j.Slf4j;
import me.wonderful.common.AjaxResult;
import me.wonderful.common.Utils;
import me.wonderful.service.SentenceService;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
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

    @Autowired
    private SentenceService sentenceService;

    /**
     * 心灵毒鸡汤
     */
    @GetMapping("/dis")
    public AjaxResult disHope() {
        String disHopeUrl = "https://www.nihaowua.com/home.html";
        return sentenceService.getNiHaoWu(disHopeUrl);
    }

    @GetMapping("/flatterer")
    public AjaxResult flatterer() {
        String disHopeUrl = "https://www.nihaowua.com/dog.html";
        String text = null;
        while (!StringUtils.hasText(text) || text.contains("爸爸")) {
            AjaxResult haoWu = sentenceService.getNiHaoWu(disHopeUrl);
            text = (String) haoWu.get(AjaxResult.MSG_TAG);
        }
        return AjaxResult.success(text);

    }

    @PostMapping()
    public AjaxResult save() {
        String disHopeUrl = "https://www.nihaowua.com/dog.html";
        try {
            Document document = Utils.getHttpDocument(disHopeUrl);
        } catch (IOException e) {
            log.error(e.getMessage(), e);
            return AjaxResult.error();
        }
        return AjaxResult.success();
    }
}
