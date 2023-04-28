package com.api.jsonplaceholder.v1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostServiceImpl implements PostService{

	private final String URL = "https://jsonplaceholder.typicode.com/posts";
	private final RestTemplate restTemplate = new RestTemplate();

	@Override
	public List<PostResponse> getPosts() {
		PostResponse[] postsArray = restTemplate.getForObject(URL, PostResponse[].class);
		return Arrays.asList(postsArray);
	}
	
	@Override
	public PostResponse getPostById(Long id) {
        PostResponse post = restTemplate.getForObject(URL + "/" + id, PostResponse.class);
        return post;
    }
	
	

}
