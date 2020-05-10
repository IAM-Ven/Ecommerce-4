package app.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ProductImage
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Product product;
    private String name;
}