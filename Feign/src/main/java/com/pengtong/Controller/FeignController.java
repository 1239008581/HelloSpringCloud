package com.pengtong.Controller;

import com.pengtong.feign.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private FeignInterface feignInterface;

    @GetMapping("/getPort")
    public String getPort(){
        return feignInterface.getPort();
    }

}
