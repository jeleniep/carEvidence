package project.carEvidence.car.mileage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("mileageRepository")
public interface MileageRepository extends JpaRepository<Mileage, Integer> {

	public Mileage findById(int id);
	
	public void removeById(int id);
	
	@Modifying
	@Query("UPDATE Mileage m SET m.startPlace = :startPlace, m.endPlace = :endPlace, m.startMileage = :startMileage, m.endMileage = :endMileage, m.attentions = :attentions  where m.id = :id")
	public void updateMileage(@Param("startPlace") String startPlace, @Param("endPlace") String endPlace,
			@Param("startMileage") Integer startMileage, @Param("endMileage") Integer endMileage, @Param("attentions") String attentions, @Param("id") Integer id);

}
