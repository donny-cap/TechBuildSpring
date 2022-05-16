package com.techniq.demo.Models;



import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="admin")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    boolean enabled;
    Date start_date;
    Date end_date;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "employee_id")
    User employee_id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "admin_id")
    User admin_id;
}
