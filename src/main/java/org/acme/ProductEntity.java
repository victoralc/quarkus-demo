package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "products")
public class ProductEntity {

    @Id
    @Column(name = "product_id")
    public Long id;

    @NotNull
    @Column(name = "product_name")
    public String name;

    @NotNull
    public String description;

    public ProductEntity() {}
}
