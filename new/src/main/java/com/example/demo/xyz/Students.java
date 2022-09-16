package com.example.demo.xyz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Students {
    public int getRoll;
    @Id
    @Column
    private int roll;
   @Column
    private String name;
   @Column
    private String address;
   @Column
   private int contact;

    public int getRoll() {
        return roll;
    }
    private void setRoll( int roll)
    {
        this.roll=roll;
    }
    private String getName() {
        return name;
    }
    private void setName( String name)
    {
        this.name=name;
    }
    private String getAddress() {
        return address;
    }
    private void setAddress( String address)
    {
        this.address=address;
    }
    private int getContact() {
        return contact;
    }
    private void setContact( int contact)
    {
        this.contact=contact;
    }
}

