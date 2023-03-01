package com.sda.shoponline.dto;

public class ProductDTO {

 public final String name;
 public final String description;
 public final double price;

 public ProductDTO(String name, String description, double price) {
  this.name = name;
  this.description = description;
  this.price = price;
 }

 public String getName() {
  return name;
 }

 public String getDescription() {
  return description;
 }

 public double getPrice() {
  return price;
 }

 @Override
 public String toString() {
  return "ProductDTO{" +
          "name='" + name + '\'' +
          ", description='" + description + '\'' +
          ", price=" + price + '}';
 }
}
