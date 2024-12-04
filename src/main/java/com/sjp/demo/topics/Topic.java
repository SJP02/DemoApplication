package com.sjp.demo.topics;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Topic {
    public String name;
    public String id;
    public String desc;

    public Topic() {
    }

    public Topic(String id, String name, String desc) {
        this.name = name;
        this.id=id;
        this.desc=desc;
    }

    public String getDesc() {
        return desc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;

    }
}

