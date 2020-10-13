package app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="orders")
public class Order
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Member member;
    @ManyToOne
    private Address address;
    @OneToMany(fetch=FetchType.EAGER,mappedBy="product")
    @JsonIgnoreProperties("order")
    private Set<OrderProduct> products;
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public Member getMember()
    {
        return member;
    }
    public void setMember(Member member)
    {
        this.member=member;
    }
    public Address getAddress()
    {
        return address;
    }
    public void setAddress(Address address)
    {
        this.address=address;
    }
    public Set<OrderProduct> getProducts()
    {
        return products;
    }
    public void setProducts(Set<OrderProduct> products)
    {
        this.products=products;
    }
}