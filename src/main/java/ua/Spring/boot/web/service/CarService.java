package ua.Spring.boot.web.service;

import java.util.List;

import ua.Spring.boot.web.entity.Car;

public interface CarService {
	
	void saveCar(Car car);
	
	List<Car> findAllCar();
}
