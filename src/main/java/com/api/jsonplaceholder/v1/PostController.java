package com.api.jsonplaceholder.v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/jsonapi")
public class PostController {

	@Autowired
	private PostService postService;

	@GetMapping("/posts")
	public ResponseEntity<List<PostResponse>> getPosts() {
		PostResponse response = new PostResponse();
		try {
			List<PostResponse> postsList = postService.getPosts();
			ArrayList al=new ArrayList();

			if (postsList.isEmpty()) {
				System.out.println("the code is executed if bl");
				return new ResponseEntity("No posts found", HttpStatus.NOT_FOUND);
			} else {
				response.setStatusCode(200);
				response.setStatusMessage("Data Fetched Successfully!");
				postsList.forEach(null);
                response.setId(9);
				//response.setStatusCode(200);
				System.out.println("the code is executed else bl");
				return new ResponseEntity(response, HttpStatus.OK);
			}
		} catch (Exception e) {
			response.setStatusMessage("INTERNAL_SERVER_ERROR");
			response.setStatusCode(500);
			System.out.println("the code is executed catch bl");
			return new ResponseEntity(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/posts/{id}")
	public ResponseEntity<PostResponse> getPostById(@PathVariable("id") Long id) {
		PostResponse response = new PostResponse();
		try {
			PostResponse post = postService.getPostById(id);

			if (post == null) {
				return new ResponseEntity("Post not found", HttpStatus.NOT_FOUND);
			} else {
				post.setStatusCode(200);
				post.setStatusMessage("Data Fetched Successfully!");
				System.out.println("the code is exceuted");
				return new ResponseEntity<>(post, HttpStatus.OK);
			}
		} catch (Exception e) {
			response.setStatusMessage("INTERNAL_SERVER_ERROR");
			response.setStatusCode(500);
			System.out.println("the catch code is exceuted");
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
