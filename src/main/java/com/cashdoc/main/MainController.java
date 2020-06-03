package com.cashdoc.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(value = "/{number}")
    public String root(@PathVariable("number") String number) {
        return "phone_popup" + number;
    }
}
