package com.minsk.spring.demo.controller;

import com.minsk.spring.demo.entity.Visit;
import com.minsk.spring.demo.exception.VisitNotFoundException;
import com.minsk.spring.demo.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private final VisitService visitService;

    public ApiController(VisitService visitService) {
        this.visitService = visitService;
    }

    @GetMapping("/visits")
    public Iterable<Visit> getVisits() {
        return visitService.findAll();
    }

    @GetMapping("/visits/{id}")
    public Visit getVisitById(@PathVariable(value = "id") String id) {
        Visit result = visitService.getVisitById(Long.parseLong(id));
        if (result == null)
            throw new VisitNotFoundException(id);
        return result;
    }
}
