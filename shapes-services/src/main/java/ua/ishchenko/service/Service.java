package ua.ishchenko.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import ua.ishchenko.common.service.ServiceCommonInterface;


@Path("/")
public interface Service extends ServiceCommonInterface{

@GET
@Path("/getShape")
@Produces("application/xml")
public String getShape();
}
