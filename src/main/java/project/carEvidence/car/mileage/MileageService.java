package project.carEvidence.car.mileage;

public interface MileageService {

	public Mileage findMileageById(int id);

	public void save(Mileage mileage);

	public void remove(int id);
	
	public void updateMileage(String startPlace, String endPlace,
			 Integer startMileage, Integer endMileage, String attentions, Integer id);
}
