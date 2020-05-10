package app.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Address
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Member member;
    private String country,city,street,building,number,name;
}