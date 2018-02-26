package ua.Spring.boot.web.entity;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.validator.constraints.NotEmpty;

import ua.Spring.boot.web.validation.anotation.UniqueCarModel;

@Entity
@Table(name="car")
@Getter
@Setter
@NoArgsConstructor

public class Car extends BaseEntity{
	
	@NotNull(message = "this field cant be empty")
	@NotEmpty (message = "this field cant be empty")
	@Size(min = 2, max = 10, message="2-10")
	private String make;
	
	@NotNull(message = "this field cant be empty")
	@NotEmpty (message = "this field cant be empty")
	@Size(min=2, max=5, message="2-5")
	//@UniqueCarModel(message = "Model already exists")
	private String model;
	
	private String color;
	
}