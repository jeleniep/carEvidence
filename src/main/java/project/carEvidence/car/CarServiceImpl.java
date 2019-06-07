package project.carEvidence.car;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CarService")
@Transactional
public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepository carRepository;


	
	@Override
	public Car findCarByNumberPlate(String numberPlate) {
		return carRepository.findByNumberPlate(numberPlate);
	}
	
	@Override
	public Car findCarById(int id) {
		return carRepository.findById(id);
	}
	
	@Override
	public List<Car> getCarList(){
		return carRepository.getCarList();
	}
	
	@Override
	public void saveCar(Car car) {
		carRepository.save(car);
	}

}
