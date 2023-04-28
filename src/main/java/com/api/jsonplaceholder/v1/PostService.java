package com.api.jsonplaceholder.v1;

import java.util.List;

public interface PostService {
	
	public List<PostResponse> getPosts();
	
	public PostResponse getPostById(Long id);
	
}
