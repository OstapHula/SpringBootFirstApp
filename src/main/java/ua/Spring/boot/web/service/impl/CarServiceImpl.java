package ua.Spring.boot.web.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import ua.Spring.boot.web.entity.Car;
import ua.Spring.boot.web.repository.CarRepository;
import ua.Spring.boot.web.service.CarService;

@Service
public class CarServiceImpl implements CarService{

	private CarRepository carRepository;
	
	@Override
	public void saveCar(Car car) {
		carRepository.save(car);
	}

	@Override
	public List<Car> findAllCar() {
		return carRepository.findAll();
	}

}
