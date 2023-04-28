package com.api.jsonplaceholder.v1;

public class PostResponse {
	private int statusCode;
	private String statusMessage;
	private int userId;
	private int id;
	private String title;
	private String body;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String string) {
		this.statusMessage = string;
	}

	@Override
	public String toString() {
		return "PostResponse [statusCode=" + statusCode + ", statusMessage=" + statusMessage + ", userId=" + userId
				+ ", id=" + id + ", title=" + title + ", body=" + body + "]";
	}
	
	

}
