package com.bala.excelgen.model;

import javax.persistence.*;
import java.io.Serializable;
/**
 * Created by Balaji on 1/10/2017.
 */
@Entity
@Table(name="t_plant")
@NamedQuery(name="Plant.findAll",query="SELECT c FROM Plant c")
public class Plant implements Serializable{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="ID", updatable = false)
  private Long id;
@Column(name="NAME")
  private String name;
@Column(name="TYPE")
  private String type;
@Column(name="CATEGORY")
  private String category;
@Column(name="PRICE")
  private Long price;

  public Plant(String name, String type, String category, Long price) {
    this.name = name;
    this.type = type;
    this.category = category;
    this.price = price;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }
}
