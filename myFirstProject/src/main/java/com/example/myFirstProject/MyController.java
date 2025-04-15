package com.example.myFirstProject;

import org.springframework.web.bind.annotation.RequestMapping;

public class MyController {
    
    @RequestMapping("m")
    
    public static String myMethod(){
          return "coding wallah sir";
    }
}
