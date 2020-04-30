package com.css.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudyController {

    @GetMapping(value="/")
    public String main(){

        return "index";
    }

    @GetMapping(value="/1")
    public String basic1(){

        return "Basic1";
    }

    @GetMapping(value="/2")
    public String basic2(){

        return "basic2";
    }

    @GetMapping(value="/3")
    public String basic3(){

        return "basic3";
    }

    @GetMapping(value="/4")
    public String select1(){

        return "Select1";
    }

    @GetMapping(value="/5")
    public String select2(){

        return "Select2";
    }
}
