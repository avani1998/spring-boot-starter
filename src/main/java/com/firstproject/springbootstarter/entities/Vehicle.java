package com.firstproject.springbootstarter.entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Vehicle")
public class Vehicle 
{
    @Id
    private UUID id;
    private String vehicleIDNumber;
    private String make;
    private String model;
    
    public Vehicle(){}
    public UUID getId()
    {
        return id;
    }

    public void setId(UUID id)
    {
        this.id=id;
    }
    public String getVehicleIDNumber()
    {
        return vehicleIDNumber;
    }
    public void setVehicleIDNumber(String vehicleIDNumber)
    {
        this.vehicleIDNumber=vehicleIDNumber;
    }
    public String getMake() {return make;}
    public void setMake(String make) 
    {
        this.make=make;
    }
    public String getModel () {return model;}
    public void setModel(String model) 
    {
        this.model=model;
    }

    @Override
    public String toString()
    {
        return "Vehicle:\n\t id="+id+"\n\t VehicleIdentityNumber="+vehicleIDNumber+"\n\t Make="+make+"\n\t Model="+model;
    }

}
