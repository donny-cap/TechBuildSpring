package com.techniq.demo.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="material")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor



public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    int quantity;
    int price;
    String manufacturer;
    String photo;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "org_id")
    Organization org_id;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "material_id")
    List<Supply_material> supply_materials;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "kind_material_id")
    Kind_material kind_material_id;




//    @ManyToOne(fetch = FetchType.LAZY, mappedBy = "kind_material_id")
//    List<Kind_material> kind_material;

    public Material(int id, String name, int quantity, int price, String manufacturer, String photo, Organization org_id, List<Supply_material> supply_materials) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.manufacturer = manufacturer;
        this.photo = photo;
        this.org_id = org_id;
        this.supply_materials = supply_materials;
    }

    public Material() {
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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

    public List<Supply_material> getSupply_materials() {
        return supply_materials;
    }

    public void setSupply_materials(List<Supply_material> supply_materials) {
        this.supply_materials = supply_materials;
    }
}
