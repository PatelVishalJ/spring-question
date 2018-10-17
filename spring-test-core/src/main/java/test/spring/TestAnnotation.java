package test.spring;

import org.springframework.stereotype.Component;

@Component
public class TestAnnotation {

	private String message = "Test Annotation message";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
