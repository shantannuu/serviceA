package com.ge.servicea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/serviceA")
public class StatusController {

    @GetMapping(path = "/status")
    public Map<String,Object> getStatus(){
        Map<String,Object> response = new HashMap<>();
        response.put("name","service1");
        response.put("status",true);
        return response;
    }
}
