package project.carEvidence.car.mileage;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "mileage")
public class Mileage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "mileage_id")
	private int id;

	@Column(name = "start_place")
	@NotNull
	private String startPlace;

	@Column(name = "end_place")
	@NotNull
	private String endPlace;

	@Column(name = "start_mileage")
	@NotNull
	private int startMileage;

	@Column(name = "end_mileage")
	@NotNull
	private int endMileage;

	@Column(name = "attentions")
	private String attentions;

//	@ManyToOne
//	@JoinColumn(name = "user_id")
//	private User user;
//
//	@ManyToOne
//	@JoinColumn(name = "car_id")
//	private Car car;
//	
	@Column(name = "user_id")
	private int userId;

	@Column(name = "car_id")
	private int carId;

	// getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStartPlace() {
		return startPlace;
	}

	public void setStartPlace(String startPlace) {
		this.startPlace = startPlace;
	}

	public String getEndPlace() {
		return endPlace;
	}

	public void setEndPlace(String endPlace) {
		this.endPlace = endPlace;
	}

	public int getStartMileage() {
		return startMileage;
	}

	public void setStartMileage(int startMileage) {
		this.startMileage = startMileage;
	}

	public int getEndMileage() {
		return endMileage;
	}

	public void setEndMileage(int endMileage) {
		this.endMileage = endMileage;
	}

	public String getAttentions() {
		return attentions;
	}

	public void setAttentions(String attentions) {
		this.attentions = attentions;
	}

	/*
	 * public User getUser() { return user; }
	 * 
	 * public void setUser(User user) { this.user = user; }
	 * 
	 * public Car getCar() { return car; }
	 * 
	 * public void setCar(Car car) { this.car = car; }
	 */

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

}