package com.pengtong.feign.Impl;

import com.pengtong.feign.FeignInterface;
import org.springframework.stereotype.Component;

@Component
public class FeignError implements FeignInterface {
    public String getPort() {
        return "服务器出错......";
    }
}
