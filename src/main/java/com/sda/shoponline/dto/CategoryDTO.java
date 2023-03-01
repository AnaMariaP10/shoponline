package com.sda.shoponline.dto;

public class CategoryDTO {

 public final Integer id;
 public final String name;

 public Integer getId() {
  return id;
 }

 public String getName() {
  return name;
 }

 public CategoryDTO(Integer id, String name) {
  this.id = id;
  this.name = name;

 }
}
