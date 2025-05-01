package org.unipar.exemplo_rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.unipar.exemplo_rest.domain.Professor;

import java.util.ArrayList;
import java.util.List;

@Path("/professores")
public class ProfessorController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Professor> hello() {
        ArrayList<Professor> listaProfessores = new ArrayList<>();
        listaProfessores.add(new Professor(1, "John Doe"));
        listaProfessores.add(new Professor(2, "Jane Doe"));
        listaProfessores.add(new Professor(3, "Jack Doe"));

        return listaProfessores;
    }


    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Professor findById(@PathParam("id") Integer id) {
        return new Professor(id, "Anderson");
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Professor insert(Professor professor){
        return professor;
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Professor update(@PathParam("id") Integer id, Professor professor){
        return professor;
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") Integer id){

    }
}