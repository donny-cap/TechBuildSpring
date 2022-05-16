package com.techniq.demo.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="organization")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String address;
    int phone;
    Date rent_date;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "org_id")
    List<User> users;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "org_id")
    List<Object> objects;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "org_id")
    List<Material> materials;


}
