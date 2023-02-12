package com.iftakhar.profile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProfileResource {
    @RequestMapping(value = "/", name = "test", method = RequestMethod.GET)
    String getTest() {
        return "Hello";
    }
}
