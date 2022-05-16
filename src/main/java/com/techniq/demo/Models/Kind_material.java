package com.techniq.demo.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "kind_material")

public class Kind_material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String kind;
    String img;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "kind_material_id")
    List<Material> materials;

    public Kind_material() {
    }

    public Kind_material(int id, String kind, String img, List<Material> materials) {
        this.id = id;
        this.kind = kind;
        this.img = img;
        this.materials = materials;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }
}
