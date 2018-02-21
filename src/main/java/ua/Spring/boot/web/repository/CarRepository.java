package ua.Spring.boot.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.Spring.boot.web.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{

	
	
}
