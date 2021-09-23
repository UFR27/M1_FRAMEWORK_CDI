package fr.pantheonsorbonne.ufr27.miage.web;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import fr.pantheonsorbonne.ufr27.miage.Cached;
import fr.pantheonsorbonne.ufr27.miage.service.Service;

@Path("primes")
public class PrimeResource {

    @Inject
    @Cached
    Service service;

    @Path("{primeLimit}")
    @GET
    public Response GetPrime(@PathParam("primeLimit") long primeLimit) {
        long res = service.compute(primeLimit);
        return Response.ok("response = " + res).build();

    }

}
