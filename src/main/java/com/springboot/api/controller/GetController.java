package com.springboot.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/get-api")
public class GetController {

   // @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping(value="/variable1/{variable}")

    //public String getHello(){
    public String getVariable1(@PathVariable String variable){
        //return "Hello get api";
    return variable;
    }
}
