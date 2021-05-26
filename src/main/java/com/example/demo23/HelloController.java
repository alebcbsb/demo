package com.example.demo23;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/say/{n}")
    public String say(@PathVariable("n") String name){
        return "[功能1]Hello,"+name;
    }

}
