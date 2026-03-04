package com.example.productsapi2.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private String product;

    @ManyToOne
    @JoinColumn(name="user_id")
    @JsonIgnore
    private User user;

}
