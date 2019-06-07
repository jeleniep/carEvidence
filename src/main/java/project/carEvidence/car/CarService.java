package project.carEvidence.car;

import java.util.List;

public interface CarService {

	public Car findCarByNumberPlate(String numberPlate);

	public Car findCarById(int id);

	public List<Car> getCarList();

	public void saveCar(Car car);
}
