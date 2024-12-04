package com.sjp.demo.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Arrays;

import static com.fasterxml.jackson.databind.type.LogicalType.Array;

@RestController
public class Topiccontroller{

    @Autowired
    private TopicService topicservice;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicservice.getAllTopics();
    }
    @RequestMapping("/topics/{id}")
    public Topic getTopicById(@PathVariable String id){
        return topicservice.getTopicById(id);
    }
    @RequestMapping(method=RequestMethod.POST,value="/topics")
    public void addTopic(@RequestBody Topic topic){
    topicservice.addTopic(topic);}

    @RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic){
        topicservice.updateTopic(id,topic);
    }
    @RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicservice.deleteTopic(id);
    }
}

