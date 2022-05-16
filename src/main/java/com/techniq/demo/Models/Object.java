package com.techniq.demo.Models;



import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="object")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Object {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String address;
    int cost;
    String photo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "org_id")
    Organization org_id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "object_id")
    List<Object_construction> object_constructions;

    public Object() {
    }

    public Object(int id, String name, String address, int cost, String photo, Organization org_id, List<Object_construction> object_constructions) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cost = cost;
        this.photo = photo;
        this.org_id = org_id;
        this.object_constructions = object_constructions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Organization getOrg_id() {
        return org_id;
    }

    public void setOrg_id(Organization org_id) {
        this.org_id = org_id;
    }

    public List<Object_construction> getObject_constructions() {
        return object_constructions;
    }

    public void setObject_constructions(List<Object_construction> object_constructions) {
        this.object_constructions = object_constructions;
    }
}
