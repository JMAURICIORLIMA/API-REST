package com.github.jmauriciorlima.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TB_PRODUCTS")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 60)
    private String name;

    private Long amount;

    private Long itemValue;


    public Products() {
    }

    public Products(Long id, String name, Long amount, Long itemValue) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.itemValue = itemValue;
    }


    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", itemValue=" + itemValue +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Objects.equals(id, products.id) && Objects.equals(name, products.name) && Objects.equals(amount, products.amount) && Objects.equals(itemValue, products.itemValue);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name, amount, itemValue);
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

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getItemValue() {
        return itemValue;
    }

    public void setItemValue(Long itemValue) {
        this.itemValue = itemValue;
    }
}
