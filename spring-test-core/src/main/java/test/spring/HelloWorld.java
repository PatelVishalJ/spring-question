package test.spring;

public class HelloWorld {
	private String message;
	
	private HelloAnnotation helloAnnotation;

	   public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
		   
	      System.out.println("Your Message : " + message);
	      System.out.println("HelloAnnotation message : " + helloAnnotation.getMessgae());
	   }
	public HelloAnnotation getHelloAnnotation() {
		return helloAnnotation;
	}
	public void setHelloAnnotation(HelloAnnotation helloAnnotation) {
		this.helloAnnotation = helloAnnotation;
	}
}
