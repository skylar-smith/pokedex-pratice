package com.silph.poke;

import java.util.List;

import com.silph.poke.model.Pokemon;
import com.silph.poke.repository.PokemonRepository;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/pokemons")
public class PokemonResource {
    @Inject
    PokemonRepository pokemonRepository;

    @GET
    public List<Pokemon> getPokemons(@QueryParam("num") Integer num) {
        return pokemonRepository.findByNum(num);
    }

    @GET
    @Path("/count")
    public long count(){
        return pokemonRepository.count();
    }
}
