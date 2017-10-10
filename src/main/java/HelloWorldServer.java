import org.restlet.Server;
import org.restlet.data.Protocol;

public class HelloWorldServer {

	public static void main(String[] args) {
		Server server = new Server(Protocol.HTTP, 8111, HelloWorldResource.class);
		try {
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}