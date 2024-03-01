package com.seha.springauth.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "stores",
        uniqueConstraints = {
            @UniqueConstraint(columnNames = "store_name")
        })
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 20)
    private String storeName;

    @OneToOne(mappedBy = "store")
    Seller seller;
}
