package test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	      
//	      HelloAnnotation annotation = (HelloAnnotation) context.getBean("helloAnnotation");
//	      System.out.println("From Annotation " + annotation.getMessgae());
	   }
}
