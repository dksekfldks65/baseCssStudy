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

    @GetMapping(value="/6")
    public String dimen1(){
        return "dimen1";
    }

    @GetMapping(value="/7")
    public String color(){
        return "Color";
    }

    @GetMapping(value="/8")
    public String background(){
        return "Background";
    }

    @GetMapping(value="/9")
    public String font(){
        return "Font";
    }

    @GetMapping(value="/10")
    public String text(){
        return "Text";
    }

    @GetMapping(value="/11")
    public String img(){
        return "Img";
    }

    @GetMapping(value="/12")
    public String link(){
        return "Link";
    }

    @GetMapping(value="/13")
    public String table(){
        return "table";
    }

    @GetMapping(value="/14")
    public String border(){
        return "Border";
    }

}
