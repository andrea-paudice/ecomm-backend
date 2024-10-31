package com.andrea.WebApp.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prodId;
    private String prodName;
    private BigDecimal price;
    private String brand;
    private String prodDescription;

    @ManyToOne
    @JoinColumn(name="categoryId")
    private Category categoryId;
    private Date releaseDate;
    private boolean available;
    private int quantity;

}
