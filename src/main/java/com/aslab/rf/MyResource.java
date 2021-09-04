package com.aslab.rf;

import com.aslab.rf.mac_info;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.FormParam;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/api")
public class MyResource {

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to the
	 * client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@Path("/print")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> getIt() {
		mac_info mi = new mac_info(10, "00aa11bb22cc");
		return mi.get_json();
	}

	@Path("/get_form")
	@POST
	public void getNum(
			@FormParam("in_host") String host,
			@FormParam("in_device") String device,
			@FormParam("mac1") String mac1,
			@FormParam("mac2") String mac2,
			@FormParam("mac3") String mac3,
			@FormParam("mac4") String mac4,
			@FormParam("mac5") String mac5,
			@FormParam("mac6") String mac6
			) {
		System.out.println(host);
		System.out.println(device);
		System.out.println(mac1 + "-" + mac2 + "-" + mac3 + "-" +
						   mac4 + "-" + mac5 + "-" + mac6);
	}
}
