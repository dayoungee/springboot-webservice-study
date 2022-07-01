package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 줍니다.
public class HelloController {
    @GetMapping("/hello")//get 요청을 받을 수 있께
    public String hello(){
        return "hello";
    }
}


