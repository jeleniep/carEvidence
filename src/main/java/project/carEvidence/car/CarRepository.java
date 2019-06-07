package project.carEvidence.car;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("carRepository")
public interface CarRepository extends JpaRepository<Car, Integer> {

	public Car findByNumberPlate(String numberPlate);
	
	public Car findById(int id);

	@Query("Select e from Car e")
	public List<Car> getCarList();


}
