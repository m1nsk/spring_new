package com.minsk.spring.demo.controller;

import com.minsk.spring.demo.entity.Visit;
import com.minsk.spring.demo.rabbit.Tut1Sender;
import com.minsk.spring.demo.repository.VisitsRepository;
import com.minsk.spring.demo.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/visit")
public class IndexController {

    @Autowired
    private final VisitService visitService;

    @Autowired
    private final Tut1Sender tut1Sender;

    public IndexController(VisitService visitService, Tut1Sender tut1Sender) {
        this.visitService = visitService;
        this.tut1Sender = tut1Sender;
    }

    @GetMapping("/")
    public ModelAndView index() {
        Map<String, String> model = new HashMap<>();
        model.put("name", "Alexey");

        Visit visit = new Visit();
        visit.description = String.format("Visited at %s", LocalDateTime.now());
        visitService.newVisit(visit);

        tut1Sender.sendVisit(visit.description);

        return new ModelAndView("index", model);
    }
}
