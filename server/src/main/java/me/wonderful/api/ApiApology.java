package me.wonderful.api;

import me.wonderful.bean.Iplogs;
import me.wonderful.service.IplogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xiongchaodu
 * @date 2022/03/24 14:55
 **/
@RestController
@RequestMapping("/apology")
public class ApiApology {
    @Autowired
    private IplogsService iplogsService;
    @GetMapping
    public String apology(HttpServletRequest request) {
        String remoteAddr = request.getRemoteAddr();
        Iplogs iplogs = new Iplogs();
        iplogs.setIp(remoteAddr);
        iplogs.setMsg("test");
        iplogsService.save(iplogs);
        System.out.println(remoteAddr);
        return "apology";
    }
}
