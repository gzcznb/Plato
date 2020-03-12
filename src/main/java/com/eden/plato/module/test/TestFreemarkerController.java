package com.eden.plato.module.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/freemarker")
public class TestFreemarkerController {


    /**
     *
     * @Title: toView
     * @Description: 跳转freemarker页面
     * @param mv
     * @return
     */
    @RequestMapping(value = "/toView")
    public String toView(Model mv) {
        System.out.println("====>>跳转freemarker页面");
        mv.addAttribute("name", "jack");

        return "module/test/test";
    }

    @RequestMapping("info")
    @ResponseBody
    public Map<String, Object> getInfo(){
        Map<String, Object> info = new HashMap<>();

        info.put("msg", "成功请求");
        info.put("code", "000000");

        return info;
    }

}
