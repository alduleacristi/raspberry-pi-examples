package ro.home.rspberry.temperature.jaxrs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ro.home.raspeberry.model.Temperature;

@Path("/api")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TemperatureJaxRS {
	@GET
	@Path("/temperature")
	public List<Temperature> getTemperature() {
		List<Temperature> tempertures = new ArrayList<>();
		Temperature temp1 = new Temperature(20.3);
		Temperature temp2 = new Temperature(21.3);
		Temperature temp3 = new Temperature(22.3);

		tempertures.add(temp1);
		tempertures.add(temp2);
		tempertures.add(temp3);

		return tempertures;
	}
}
