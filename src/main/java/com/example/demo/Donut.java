package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor
public class Donut {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    public String name;

    public Double costDollars;

    @Enumerated(EnumType.STRING)
    private DonutToppings toppings;

    Donut(String name, DonutToppings toppings, Double costDollars) {
        this.name = name;
        this.toppings = toppings;
        this.costDollars = costDollars;
    }
}
