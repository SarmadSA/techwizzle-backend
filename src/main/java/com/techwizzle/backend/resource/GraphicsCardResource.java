package com.techwizzle.backend.resource;


import com.techwizzle.backend.model.GraphicsCard;
import com.techwizzle.backend.service.GraphicsCardService;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/graphicsCards")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GraphicsCardResource {

    //@Inject
    private GraphicsCardService graphicsCardService = new GraphicsCardService();

    @GET
    public List<GraphicsCard> listAllGraphicsCards(){
        return graphicsCardService.getAllGraphicsCards();
    }

    @POST
    public GraphicsCard addGraphicsCard(@Valid GraphicsCard graphicsCard){
        return graphicsCardService.addGraphicsCard(graphicsCard);
    }

}
