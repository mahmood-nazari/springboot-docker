package ir.rbc.springdocker.controller;

import ir.rbc.springdocker.SampleService;
import ir.rbc.springdocker.model.SampleEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @RequestMapping(value = "/sample")
    public void saveEntity(@RequestBody SampleEntity sampleEntity){
        sampleService.saveSampleEntity(sampleEntity);
    }
}
