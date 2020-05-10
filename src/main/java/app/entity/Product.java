package app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Product
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String title,description;
    private double price,discountPrice;
    private int stock;
    private boolean onSale=true,discount=false;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Seller seller;
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="product_color",joinColumns={@JoinColumn(name="productId")},inverseJoinColumns={@JoinColumn(name="colorId")})
    private Set<Color> colors;
    @OneToMany(fetch=FetchType.EAGER,mappedBy="product")
    @JsonIgnoreProperties("product")
    private Set<ProductImage> images;
    @OneToMany(fetch=FetchType.EAGER,mappedBy="product")
    @JsonIgnoreProperties("product")
    private Set<ProductProperty> properties;
}
