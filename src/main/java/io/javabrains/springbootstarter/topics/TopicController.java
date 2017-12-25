package io.javabrains.springbootstarter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topics> getAllTopics()
	{
		return topicService.getAllTopics(); 
	}
	
	@RequestMapping("topics/{id}")
	public Topics getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
	}

}