package app.entity;

import javax.persistence.*;

@Entity
public class Address
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Member member;
    private String country,city,street,building,number,name;
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
    public String getCountry()
    {
        return country;
    }
    public void setCountry(String country)
    {
        this.country=country;
    }
    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city=city;
    }
    public String getStreet()
    {
        return street;
    }
    public void setStreet(String street)
    {
        this.street=street;
    }
    public String getBuilding()
    {
        return building;
    }
    public void setBuilding(String building)
    {
        this.building=building;
    }
    public String getNumber()
    {
        return number;
    }
    public void setNumber(String number)
    {
        this.number=number;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
}