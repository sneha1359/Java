package com.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Anvesh on 8/15/2017.
 */
@RestController
public class Controller {

    @RequestMapping("/greeting")
    public String App(){
        return "Anvesh is called";
    }
}
