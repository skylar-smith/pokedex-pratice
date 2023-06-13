package com.silph.poke.repository;

import java.sql.Blob;
import java.util.List;

import com.silph.poke.model.Pokemon;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import io.quarkus.logging.Log;

@ApplicationScoped
public class PokemonRepository implements PanacheMongoRepository<Pokemon> {


    public Pokemon findByName(String name) {
        return find("name", name).firstResult();
    }

    public List<Pokemon> findByNum(Integer num){
        Log.info(num);
        return list("num", num);
    }
}
