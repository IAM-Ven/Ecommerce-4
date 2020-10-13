package app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.util.Set;

@Entity
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
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description=description;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public double getDiscountPrice()
    {
        return discountPrice;
    }
    public void setDiscountPrice(double discountPrice)
    {
        this.discountPrice=discountPrice;
    }
    public int getStock()
    {
        return stock;
    }
    public void setStock(int stock)
    {
        this.stock=stock;
    }
    public boolean isOnSale()
    {
        return onSale;
    }
    public void setOnSale(boolean onSale)
    {
        this.onSale=onSale;
    }
    public boolean isDiscount()
    {
        return discount;
    }
    public void setDiscount(boolean discount)
    {
        this.discount=discount;
    }
    public Category getCategory()
    {
        return category;
    }
    public void setCategory(Category category)
    {
        this.category=category;
    }
    public Seller getSeller()
    {
        return seller;
    }
    public void setSeller(Seller seller)
    {
        this.seller=seller;
    }
    public Set<Color> getColors()
    {
        return colors;
    }
    public void setColors(Set<Color> colors)
    {
        this.colors=colors;
    }
    public Set<ProductImage> getImages()
    {
        return images;
    }
    public void setImages(Set<ProductImage> images)
    {
        this.images=images;
    }
    public Set<ProductProperty> getProperties()
    {
        return properties;
    }
    public void setProperties(Set<ProductProperty> properties)
    {
        this.properties=properties;
    }
}
