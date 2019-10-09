package com.stackroute;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
@Controller
public class User {
    @Value("PANKAJ")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
