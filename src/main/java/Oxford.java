package oxford;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Oxford {

  private static final String BASE_URL = "https://od-api.oxforddictionaries.com/api/v1/entries/en";
  private static final String KEY = "aa20d46fa4be349111629b09d4b8aaa2";
  private static final String ID = "84ab7a8c";

	public String getDefinition(String word) {

    DefaultHttpClient httpClient = new DefaultHttpClient();

    RetrieveEntry re = new RetrieveEntry();

	  try {
  		HttpGet getRequest = new HttpGet(BASE_URL + "/" + word);
  		getRequest.addHeader("accept", "application/json");
      getRequest.addHeader("app_id", ID);
      getRequest.addHeader("app_key", KEY);

  		HttpResponse response = httpClient.execute(getRequest);

  		if (response.getStatusLine().getStatusCode() != 200) {
  			throw new RuntimeException("Failed : HTTP error code : "
  			   + response.getStatusLine().getStatusCode());
  		}

  		BufferedReader br = new BufferedReader(
                           new InputStreamReader((response.getEntity().getContent())));

  		ObjectMapper objm = new ObjectMapper();

      re = objm.readValue(br, RetrieveEntry.class);

	  } catch (ClientProtocolException e) {

		    e.printStackTrace();

	  } catch (IOException e) {

		    e.printStackTrace();

	  } finally {

      httpClient.getConnectionManager().shutdown();

      return re.toString();

    }
	}
}
