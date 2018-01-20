package com.minsk.spring.demo.service;

import com.minsk.spring.demo.entity.Visit;

public interface VisitService {
    void newVisit(Visit visit);
    Iterable<Visit> findAll();
    Visit getVisitById(long id);
}
