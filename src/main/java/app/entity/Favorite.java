package app.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Favorite
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Member member;
    @ManyToOne
    private Product product;
}