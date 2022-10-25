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

    @GetMapping(value="/status_1")
    public String status_1(){
        return "pages/status_1";
    }

    @GetMapping(value="/analysis_1")
    public String analysis_1(){
        return "pages/analysis_1";
    }
}
