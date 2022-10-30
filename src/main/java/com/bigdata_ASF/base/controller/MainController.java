package com.bigdata_ASF.base.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {


    @GetMapping(value="/")
    public String main(){
        return "main";
    }

    @GetMapping(value="/index")
    public String index(){
        return "index";
    }

    @GetMapping(value="/status_1")
    public String status_1(){
        return "pages/status_1";
    }

    @GetMapping(value="/status_2")
    public String status_2(){
        return "pages/status_2";
    }

    @GetMapping(value="/status_3")
    public String status_3(){
        return "pages/status_3";
    }

    @GetMapping(value="/status_4")
    public String status_4(){
        return "pages/status_4";
    }

    @GetMapping(value="/status_5")
    public String status_5(){
        return "pages/status_5";
    }

    @GetMapping(value="/analysis_1")
    public String analysis_1(){
        return "pages/analysis_1";
    }

    @GetMapping(value="/analysis_2")
    public String analysis_2() { return "pages/analysis_2"; }

    @GetMapping(value="/service_1")
    public String service_1() { return "pages/service_1"; }
}
