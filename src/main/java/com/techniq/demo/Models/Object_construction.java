package com.techniq.demo.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="object_construction")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Object_construction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    Date start_date;
    Date end_date;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "object_id")
    Object object_id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "client_id")
    User client_id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "builder_id")
    User builder_id;


}
