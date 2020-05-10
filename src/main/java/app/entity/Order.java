package app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
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
}