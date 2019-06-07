package project.carEvidence.car;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import project.carEvidence.car.mileage.Mileage;

@Entity
@Table(name = "car")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "car_id")
	private int id;

	@Column(name = "make")
	@NotNull
	private String make;

	@Column(name = "model")
	@NotNull
	private String model;

	@Column(name = "number_plate")
	@NotNull
	private String numberPlate;

	@Column(name = "current_mileage")
	@NotNull
	private int currentMileage;

	@Column(name = "attentions")
	private String attentions;

	@OneToMany
	@JoinColumn(name = "car_id")
	private List<Mileage> mileages;

	// getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public int getCurrentMileage() {
		return currentMileage;
	}

	public void setCurrentMileage(int currentMileage) {
		this.currentMileage = currentMileage;
	}

	public String getAttentions() {
		return attentions;
	}

	public void setAttentions(String attentions) {
		this.attentions = attentions;
	}

	public List<Mileage> getMileages() {
		return mileages;
	}

	public void setMileages(List<Mileage> mileages) {
		this.mileages = mileages;
	}

}
