package ua.Spring.boot.web.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="car")
@Getter
@Setter
@NoArgsConstructor
public class Car extends BaseEntity{
	
	@NotNull(message ="This field cant be empty")
	@NotEmpty(message ="This field cant be empty")
	@Size(min=2, max=10, message="Should be beatwen 2 and 10")
	private String make;
	@NotNull(message ="This field cant be empty")
	private String model;
	private String color;
	
}
