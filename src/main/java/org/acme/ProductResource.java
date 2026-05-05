package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/products")
public class ProductResource {

    @Inject
    ProductRepository productRepository;

    @GET
    public Response getProducts() {
        return Response.ok(productRepository.listAll()).build();
    }
}
