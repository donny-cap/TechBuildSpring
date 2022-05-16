package com.techniq.demo.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="supply_material")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supply_material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int quantity;
    Date ordered_date;
    Date delivered_date;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "material_id")
    Material material_id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    User supplier_id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "builder_id")
    User builder_id;
}
