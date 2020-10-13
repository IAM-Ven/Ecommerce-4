package app.entity;

import javax.persistence.*;

@Entity
public class ProductProperty
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private CategoryProperty categoryProperty;
    @ManyToOne
    private Product product;
    private String value;
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public CategoryProperty getCategoryProperty()
    {
        return categoryProperty;
    }
    public void setCategoryProperty(CategoryProperty categoryProperty)
    {
        this.categoryProperty=categoryProperty;
    }
    public Product getProduct()
    {
        return product;
    }
    public void setProduct(Product product)
    {
        this.product=product;
    }
    public String getValue()
    {
        return value;
    }
    public void setValue(String value)
    {
        this.value=value;
    }
}
