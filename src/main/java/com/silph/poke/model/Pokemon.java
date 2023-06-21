package com.silph.poke.model;

import org.bson.types.ObjectId;

import io.quarkus.mongodb.panache.common.MongoEntity;

@MongoEntity(collection = "Pokemon")
public class Pokemon {
    public ObjectId id;
    public Integer num;
    public String name;
    public String type1;
    public String type2;
    public Integer total;
    public Integer hp;
    public Integer attack;
    public Integer defense;
    public Integer spAtk;
    public Integer spDef;
    public Integer speed;
    public Integer generation;
    public String legendary;
}
