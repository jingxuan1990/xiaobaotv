package cn.xiaobaotv.is.tv.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hzliwenhao on 2017/9/9.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        return "index";
    }

}
