package com.minsk.spring.demo.service;

import com.minsk.spring.demo.entity.Visit;
import com.minsk.spring.demo.repository.VisitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitServiceImpl implements VisitService {

    @Autowired
    private VisitsRepository visitsRepository;

    public VisitServiceImpl(VisitsRepository visitsRepository) {
        this.visitsRepository = visitsRepository;
    }

    public VisitServiceImpl() {
    }

    @Override
    public Iterable<Visit> findAll(){
        return visitsRepository.findAll();
    }

    @Override
    public void newVisit(Visit visit) {
        visitsRepository.save(visit);
    }

    @Override
    public Visit getVisitById(long id) {
        return visitsRepository.findOne(id);
    }
}
