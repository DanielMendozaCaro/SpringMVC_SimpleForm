/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Daniel
 */

@Controller
public class FormController {
    
    
    
    @RequestMapping(value="form.htm", method=RequestMethod.GET)
    public ModelAndView form(){
    
        return new ModelAndView("form","command",new Person());
        
        /* pass parameter throught the constructor of the class person
        return new ModelAndView("form","command",new Person("Daniel", "Email@gmail.com", 23));
        */
    }
    
    @RequestMapping(value="form.htm", method=RequestMethod.POST)
    public String form(Person per, ModelMap model){
    
        model.addAttribute("name",per.getName());
        model.addAttribute("email",per.getEmail());
        model.addAttribute("years",per.getYears());
       
        return "success";
    }
}
