package com.firstproject.springbootstarter.repositories;

import java.util.UUID;

import com.firstproject.springbootstarter.entities.Vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
//acts as a bridge between Java class and actual table
//Extends CrudRepository provided by Spring Data JPA for CRUD operations 
public interface VehicleRepository extends CrudRepository<Vehicle,UUID>
{}

/*CommandLineRunner is used to execute a piece of code after Spring has started.
This is done by extending a @compoment by the CommandLineRunner interface.
Here, creating commandLineRunner to insert two vehicles in database*/ 

@Component
class demoCommandLineRunner implements CommandLineRunner
{
    @Autowired
    //This tells Spring that an instance of the repository class needs to be injected as 
    //a dependency to DemoCommandLineRunner
    private VehicleRepository vehicleRepository;
    @Override
	public void run(String... args) throws Exception {

		Vehicle audi = new Vehicle();
		audi.setId(UUID.randomUUID());
		audi.setVehicleIDNumber("Reg#1234");
		audi.setMake("Audi");
		audi.setModel("Q5");

		vehicleRepository.save(audi);

		Vehicle tesla = new Vehicle();
		tesla.setId(UUID.randomUUID());
		tesla.setVehicleIDNumber("Reg#6789");
		tesla.setMake("Tesla");
		tesla.setModel("Model S");

		vehicleRepository.save(tesla);
	}
    /*When the Spring context loads up, the CommandLineRunner should be executed. 
    And the two records should be inserted into the table.*/
}
