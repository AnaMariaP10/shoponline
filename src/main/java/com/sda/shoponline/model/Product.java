package com.sda.shoponline.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {

 @Id
 @Column(name = "id")
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;

 @Column(name = "name")
 private String name;

 @Column(name = "description")
 private String description;

 @Column(name = "price")
 private Double price;

 @Column(name = "detailed_characteristics")
 private String detailedCharacteristics;

 @ManyToOne
 @JsonManagedReference
 @JoinColumn(name = "category")
 private Category category;

}



