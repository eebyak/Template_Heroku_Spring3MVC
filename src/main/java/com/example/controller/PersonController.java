package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Person;
import com.example.service.PersonService;
import static java.lang.System.*;
import java.util.Map;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String listPeople(Map<String, Object> map) {
        out.println("???????????????????");
    	out.println(map.isEmpty());
        out.println("???????????????????");

    	map.put("person", new Person());
        out.println("11111111111");
        out.println(personService);

    	map.put("peopleList", personService.listPeople());
        out.println("22222222222");

        return "people";
    }
    

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addPerson(@ModelAttribute("person") Person person, BindingResult result) {

        personService.addPerson(person);

        return "redirect:/people/";
    }

    @RequestMapping("/delete/{personId}")
    public String deletePerson(@PathVariable("personId") Integer personId) {

        personService.removePerson(personId);

        return "redirect:/people/";
    }
}
