package project.carEvidence.car.mileage;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MileageService")
@Transactional
public class MileageServiceImpl implements MileageService {

	@Autowired
	private MileageRepository mileageRepository;

	@Override
	public Mileage findMileageById(int id) {
		return mileageRepository.findById(id);
	}

	@Override
	public void save(Mileage mileage) {
		mileageRepository.save(mileage);
	}

	@Override
	public void remove(int id) {
		mileageRepository.removeById(id);
	}

	@Override
	public void updateMileage(String startPlace, String endPlace, Integer startMileage, Integer endMileage,
			String attentions, Integer id) {
		mileageRepository.updateMileage(startPlace, endPlace, startMileage, endMileage, attentions, id);
	}
}
