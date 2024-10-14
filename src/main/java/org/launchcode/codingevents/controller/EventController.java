package org.launchcode.codingevents.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayEvents(Model model) {
        List<String> events = new ArrayList<>();
        events.add("JavaScript Workshop");
        events.add("Spring Boot Seminar");
        events.add("Python for Beginners");

        model.addAttribute("events", events);

        return "events/index";
    }

    //lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }
}
