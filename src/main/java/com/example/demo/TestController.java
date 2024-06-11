package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

@RestController
public class TestController {



    public TestController(ResourceUrlProvider mvcResourceUrlProvider) {
    }

    @GetMapping("/health")
    public boolean health() {
        return true;

    }
    @GetMapping("api/version")
    public String version() {
        return "v1";
    }
}
