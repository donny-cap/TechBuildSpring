package com.techniq.demo.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="usr")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String full_name;
    String login;
    String pass;
    boolean enabled;
    String photo;
    int phone;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "role_id")
    Role role_id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "org_id")
    Organization org_id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "builder_id")
    List<Supply_material> supply_materials_b;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier_id")
    List<Supply_material> supply_materials_s;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "employee_id")
    List<Admin> admins_emp;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "admin_id")
    List<Admin> admins_ad;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "builder_id")
    List<Object_construction> object_constructions_b;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client_id")
    List<Object_construction> object_constructions_c;



}
