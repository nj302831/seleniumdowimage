import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIcall {

	public static void main(String[] args) throws IOException, InterruptedException {
		
//		var url ="https://api.github.com/users/nj302831";
		 var url ="https://api.nationalize.io/?name=nathaniel";
//		call api -https://api.nationalize.io/?name=nathaniel
		var request=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
		
		var client= HttpClient.newBuilder().build();
		
		HttpResponse<String> response= client.send(request,HttpResponse.BodyHandlers.ofString());
		
		System.out.println(response.statusCode());
		
		System.out.println(response.body());
		

	}

}
