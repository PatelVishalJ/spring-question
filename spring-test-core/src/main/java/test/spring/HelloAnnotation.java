package test.spring;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloAnnotation {

	private String messgae = "Message from Annotation";
	
	@Autowired
	private TestAnnotation testAnnotation;

	public String getMessgae() {
		System.out.println("From TestAnnotation : " + testAnnotation.getMessage());
		return messgae;
	}

	public void setMessgae(String messgae) {
		this.messgae = messgae;
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Post Construct");
	}
	
}
