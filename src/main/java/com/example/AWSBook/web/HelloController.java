package com.example.AWSBook.web;

import com.example.AWSBook.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam String user) {
        return "Hello "+user+", Have a Hard Work!!!";
    }

    @GetMapping("/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }

    @PostMapping("/post")
    public HelloResponseDto helloDto(@RequestBody HelloResponseDto helloResponseDto) {
        return new HelloResponseDto(helloResponseDto.getName(), helloResponseDto.getAmount());
    }
}
