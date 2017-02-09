package com.bharat.rdbms.mysql.jpa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by BHARAT VERMA on 9/2/17.
 */
@Controller
@RequestMapping("/rdbms/mysql")
public class MainController {

    @RequestMapping("/jpa")
    @ResponseBody
    public String index() {
        return "Proudly handcrafted by " +
                "<a href='https://twitter.com/bindian0509'>BHARAT VERMA</a> :)";
    }

}
