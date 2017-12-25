package io.javabrains.springbootstarter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topics> topics = Arrays.asList(new Topics("Spring",
			"Spring Framework", "Spring description"), new Topics("Struts",
			"Struts Framework", "Struts description"), new Topics("Hibernate",
			"Hibernate Framework", "Hibernate Description"));

	public List<Topics> getAllTopics() {
		return topics;
	}

	public Topics getTopic(String id) {
		try {
			return topics.stream().filter(t -> t.getId().equals(id))
					.findFirst().get();
		} catch (Exception e) {
			return null;
		}

	}
}
