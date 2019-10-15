package com.pengtong.feign;

import com.pengtong.feign.Impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider", fallback = FeignError.class)
public interface FeignInterface {

    @GetMapping("/student/getPort")
    String getPort();

}
