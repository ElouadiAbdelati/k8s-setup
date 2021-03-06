package com.example.springapp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Commande {
    @Id
    @GeneratedValue
    private Long id;
    private String ref;
    private Double total;
    private Double totalPaye;

}
