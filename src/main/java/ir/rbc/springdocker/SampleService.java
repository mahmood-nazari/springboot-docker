package ir.rbc.springdocker;

import ir.rbc.springdocker.model.SampleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SampleService {

    @Autowired
    private SampleRepository sampleRepository;

    @Transactional
    public void saveSampleEntity(SampleEntity sampleEntity){
        sampleRepository.save(sampleEntity);
    }
}
