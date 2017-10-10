import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import model.Greeting;

public class HelloWorldResource extends ServerResource {

	@Get("xml|json")
	public Greeting represent() {
		Greeting greeting = new Greeting();
		greeting.setValue("Hello, world!");
		greeting.setLang("en");
		return greeting;
	}

}